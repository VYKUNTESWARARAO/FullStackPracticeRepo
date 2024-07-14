package com.vyku.service;

import java.util.List;

import com.vyku.entity.Employee;

public interface IEmployeeService {
	
	public String deleteEmployeesInBatch(List<Integer> ids);
	public List<Employee> findEmployeeByExampleData(Employee exEmployee,boolean asc,String...props);
	public Employee getEmployeeBasedOnId(Integer id);
	

}
