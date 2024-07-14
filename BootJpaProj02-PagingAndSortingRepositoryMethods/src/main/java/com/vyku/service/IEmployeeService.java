package com.vyku.service;


import org.springframework.data.domain.Page;

import com.vyku.entity.Employee;

public interface IEmployeeService {

	public Iterable<Employee> showEmployeeBySorting(boolean asc,String...props);
	public Page<Employee> getEmployeeDetailsInPages(int pageNo,int pageSize,boolean ascOrder,String...props);
	
	
	
}
