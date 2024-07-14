package com.vyku.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vyku.repository.EmployeeRepo;

@Component
public class EmployeeTestRunner implements CommandLineRunner {
	//@Autowired
	//private IEmployeeService empService;
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public void run(String... args) throws Exception {
		//empRepo.findByEmpDesignation("Clerk").forEach(System.out::println);
		//empRepo.findByEmpDesignationEquals("Clerk").forEach(System.out::println);
		//empRepo.findByEmpDesignationIs("Clerk").forEach(System.out::println);
		//empRepo.findByEmpDesignationStartsWith("C").forEach(System.out::println);
		//empRepo.findByEmpNameEndsWith("u").forEach(System.out::println);
		//empRepo.findByEmpNameContaining("ku").forEach(System.out::println);
		empRepo.findByEmpNameLike("%pp%").forEach(System.out::println);
		
	}



}
