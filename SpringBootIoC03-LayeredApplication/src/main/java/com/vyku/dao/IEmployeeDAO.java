package com.vyku.dao;

import java.util.List;

import com.vyku.models.Employee;

public interface IEmployeeDAO
{
	public List<Employee> getEmployeeDatabyJobs(String job1,String job2,String job3) throws Exception;

}
