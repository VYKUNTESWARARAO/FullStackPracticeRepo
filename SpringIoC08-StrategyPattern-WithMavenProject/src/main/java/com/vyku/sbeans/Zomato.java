package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("zomato")
public class Zomato implements Food
{
	

	public Zomato() 
	{
		System.out.println("Zomato::::::::::>Constructor");
	}

	@Override
	public String vegFood() {
		
		return "Your odered veg food through Zomato";
	}

	@Override
	public String nonVegFood() {
		
		return "Your odered Non-veg food through Zomato";
	}
	

}
