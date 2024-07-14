package com.vyku.service;

import java.util.List;

import com.vyku.models.Employee;

public interface IEmployeeService 
{
	public List<Employee> fetchAllEmployeeByDesgs(String job1,String job2,String job3) throws Exception;
}
