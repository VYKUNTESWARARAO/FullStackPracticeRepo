package com.vyku.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.vyku.entity.Employee;
import com.vyku.repository.EmployeeRepo;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public Iterable<Employee> showEmployeeBySorting(boolean asc, String... props) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		Iterable<Employee> it=empRepo.findAll(sort);
		return it;
	}

	@Override
	public Page<Employee> getEmployeeDetailsInPages(int pageNo, int pageSize, boolean ascOrder, String... props) {
		Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC,props);
		Pageable pageable=PageRequest.of(pageNo, pageSize, sort);
		Page<Employee> page=empRepo.findAll(pageable);
		
		return page;
	}

	

	
}

	


	

