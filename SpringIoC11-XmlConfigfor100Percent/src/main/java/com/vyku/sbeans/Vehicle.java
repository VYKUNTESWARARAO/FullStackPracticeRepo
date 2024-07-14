package com.vyku.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle 
{
	@Autowired
	@Qualifier("engineId")
	private Engine engine;
	public String journey()
	{
		
		System.out.println("Vehicle journey( )  ========>Method");
		String start=engine.start("Hyderabad","Delhi");
		String end=engine.end("Hyderabad","Delhi");
		System.out.println("=======================================================");
		System.out.println(start);
		System.out.println(":::::::::");
		System.out.println(":::::::::");
		System.out.println(end);
		System.out.println("=======================================================");
		return "::::::>>>>>>>>>Safely reached";
	}

}
