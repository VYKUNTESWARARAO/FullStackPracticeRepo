package com.vyku.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vyku.service.IOToMAssociationMgmtSerice;
import com.vyku.service.OtoMAssociationMappingServiceImpl;

@Component
public class OtoMAssociationTestRunner implements CommandLineRunner {

	@Autowired
	private IOToMAssociationMgmtSerice service;
	
	@Override
	public void run(String... args) throws Exception {
		//service.saveDataUsingParent();
		//service.saveDataUSingChild();
		service.loadDataUsingParent();
		
	}

}
