package com.vyku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyku.dao.IEmployeeDAO;
import com.vyku.models.Employee;

@Service("service")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;
	@Override
	public List<Employee> fetchAllEmployeeByDesgs(String job1, String job2, String job3) throws Exception 
	{
		List<Employee> list=dao.getEmployeeDatabyJobs(job1, job2, job3);
		//business logic
		return list;
	}

}
