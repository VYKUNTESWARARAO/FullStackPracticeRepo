package com.vyku.service;


import java.util.List;
import java.util.Optional;

import com.vyku.entity.Employee;

public interface IEmployeeService {

	public String addEmployee(Employee employee);
	public String registerAllEmployees(List<Employee> list);
	public Employee getEmployeeById(Integer id);
	//Same Method(in another Way)
	public Optional<Employee> showEmployeeByID(Integer id);
	
	public Long getCountOfEmployees();
	public boolean checkEmployeeByID(Integer id);
	
	public Iterable<Employee> getEmployeesByMoreIds(List<Integer> list);
	public Iterable<Employee> getAllEmployees();
	
	public String removeEmployee(Employee emp);
	public String kickEmployeeById(Integer id);
	public String deleteEmployeeByObjects(Iterable<Employee> list);
	public String deleteAllEmployees();
	
	
}
