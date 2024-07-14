package com.vyku.runner;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.vyku.entity.Employee;
import com.vyku.service.IEmployeeService;

@Component
public class EmployeeTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService empService;

	@Override
	public void run(String... args) throws Exception {
//		
//		try {
//			empService.showEmployeeBySorting(true, "empId").forEach(System.out::println);
//			System.out.println("------------------------------");
//			empService.showEmployeeBySorting(false, "empDesignation").forEach(System.out::println);
//			
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}
		try 
		{
			Page<Employee> page= empService.getEmployeeDetailsInPages(1, 2,true, "empName");
			System.out.println("page Number:::::"+page.getNumber());
			System.out.println("pages Total No.of Pages:::::"+ page.getTotalPages());
			System.out.println("pageNumber is First:::::"+ page.isFirst());
			System.out.println("pageNumber is Last:::::"+ page.isLast());
			System.out.println("pageNumber count:::::"+page.getSize());
			System.out.println("pageNumber no.of elements:::::"+page.getNumberOfElements());
			
			System.out.println("----------------------------------------------------------");			
			List<Employee> list=page.getContent();
			list.forEach(System.out::println);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
		
		
		
		
		
}