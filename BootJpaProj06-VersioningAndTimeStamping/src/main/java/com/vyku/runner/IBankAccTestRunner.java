package com.vyku.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vyku.entity.BankAccount;
import com.vyku.service.IBankMgmtService;
@Component
public class IBankAccTestRunner implements CommandLineRunner {
	
	@Autowired
	private IBankMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
		BankAccount Acc1= new BankAccount("Vykuntewsar");
		BankAccount Acc2= new BankAccount("Chinni");
		
		
		String msg=service.saveCustomer(Acc2);
//		service.saveCustomer(Acc1);
		System.out.println(msg);
		
		
		
		
		
		

	}

}
