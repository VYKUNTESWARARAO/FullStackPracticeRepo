package com.vyku.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vyku.entity.Employee;
import com.vyku.service.IEmployeeService;

@Component
public class EmployeeTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeService empService;

	@Override
	public void run(String... args) throws Exception {
		
//		String msg=empService.deleteEmployeesInBatch(List.of(1392,1393));
//		System.out.println(msg);
//		Employee emp=new Employee();
//		emp.setEmpSalary(15000.0);
//		
//		empService.findEmployeeByExampleData(emp, true, "empAddress").forEach(System.out::println);
		
		System.out.println(empService.getEmployeeBasedOnId(10111));
		
	}

}
