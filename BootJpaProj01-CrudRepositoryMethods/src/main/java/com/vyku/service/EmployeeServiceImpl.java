package com.vyku.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyku.entity.Employee;
import com.vyku.repository.EmployeeRepo;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public String addEmployee(Employee employee) {
		
		Employee emp=empRepo.save(employee);
		return " employee is saved with the id value "+emp.getEmpId();
	}

	@Override
	public String registerAllEmployees(List<Employee> list) {
		Iterable<Employee> savedList=empRepo.saveAll(list);
		return list.size()+" Employees are saved";
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Employee emp=empRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid EmpID"));
		return emp;
		
	}

	@Override
	public Optional<Employee> showEmployeeByID(Integer id) {
		Optional<Employee> opt=empRepo.findById(id);
		return opt;
	}

	@Override
	public Iterable<Employee> getEmployeesByMoreIds(List<Integer> ids) {
		
		return empRepo.findAllById(ids);
	}

	@Override
	public Iterable<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Long getCountOfEmployees() {
		return empRepo.count();
	}

	@Override
	public boolean checkEmployeeByID(Integer id) {
		
		return empRepo.existsById(id);
	}

	@Override
	public String removeEmployee(Employee emp) 
	{
		Optional<Employee> opt=empRepo.findById(emp.getEmpId());
		if(opt.isPresent()) 
		{
			empRepo.delete(emp);
			return "employee is deleted by id "+emp.getEmpId();
			
		}
		else 
		{
			return emp.getEmpId()+" not found with this id";
		}
	}

	@Override
	public String kickEmployeeById(Integer id) {
		Optional<Employee> opt=empRepo.findById(id);
		if(opt.isEmpty()) {
			return "Employee is Not Found for deletion with id"+ opt.get().getEmpId();
			
		}
		else 
		{
			empRepo.deleteById(id);
			return "Employee is deleted with Id Value " + opt.get().getEmpId();
			
		}
	}

	@Override
	public String deleteEmployeeByObjects(Iterable<Employee> list) {
		if (!list.iterator().hasNext()) {
		      return "No employees found to delete.";
		    }
		empRepo.deleteAll(list);
		
		
		return String.format("%d employees deleted successfully.", list.spliterator().getExactSizeIfKnown()); 
	}
	@Override
	public String deleteAllEmployees() 
	{
		long count=empRepo.count();
		if(count>0) {
		empRepo.deleteAll();
		return count+ "no.of records found for deletion ";
		}
		return "records not found for deletion" ;
	}

	
}

	


	

