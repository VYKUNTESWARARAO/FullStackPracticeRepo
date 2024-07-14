package com.vyku.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle
{
	
	public Vehicle() {
		System.out.println("Vehicle::::::::::::::Vehicle()");
	}
	
	@Autowired
	@Qualifier("eEngine")
	private Engine engine;
	
	
	public String journey(String startingPoint,String destination) 
	{
		
		System.out.println("Vehicle journey( )  ========>Method");
		engine.start();
		engine.going();
		engine.end();
		return "Journey Strated from "+startingPoint +" to " + destination;
	}

	
	
	
	

}
