package com.vyku;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.vyku.controller.PayrollOperationsController;
import com.vyku.models.Employee;

@SpringBootApplication
public class SpringBootIoC03LayeredApplication {

	public static void main(String[] args)  {
		ApplicationContext ctx=SpringApplication.run(SpringBootIoC03LayeredApplication.class, args);
		PayrollOperationsController payroll=ctx.getBean("payroll",PayrollOperationsController.class);
		try {
			List<Employee> list=payroll.showAllEmployeeDeatails("CLERK","MANAGER","SALESMAN");
			System.out.println();
			System.out.println();
			list.forEach(emp->System.out.println(emp));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
