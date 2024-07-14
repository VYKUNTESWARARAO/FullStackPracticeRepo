package com.vyku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.vyku.entity.Employee;
import com.vyku.repository.EmployeeRepo;


@Service
public class EmployeeMgmtServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public String deleteEmployeesInBatch(List<Integer> ids) {
		List<Employee> list=empRepo.findAllById(ids);
		empRepo.deleteAllByIdInBatch(ids);
		return list.size()+" no.of records are deleted";
	}

	@Override
	public List<Employee> findEmployeeByExampleData(Employee exEmployee, boolean asc, String... props) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		Example<Employee> example=Example.of(exEmployee);
		List<Employee> list=empRepo.findAll(example,sort);
		return list;
	}

	@Override
	public Employee getEmployeeBasedOnId(Integer id) {
		Employee emp=empRepo.getReferenceById(id);
		return emp;
	}

}
