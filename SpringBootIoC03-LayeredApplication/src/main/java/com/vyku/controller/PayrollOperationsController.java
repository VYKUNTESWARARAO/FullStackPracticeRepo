package com.vyku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vyku.models.Employee;
import com.vyku.service.IEmployeeService;

@Controller("payroll")
public class PayrollOperationsController
{
	@Autowired
	private IEmployeeService service;
	
	public List<Employee> showAllEmployeeDeatails(String job1,String job2,String job3) throws Exception
	{
		List<Employee> list=service.fetchAllEmployeeByDesgs(job1, job2, job3);
		return list;
		
	}
	

}
