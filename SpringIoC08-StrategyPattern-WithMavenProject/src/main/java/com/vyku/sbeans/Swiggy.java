package com.vyku.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("swiggy")
@Lazy(true)
public class Swiggy implements Food
{
	

	public Swiggy() {
		System.out.println("Swiggy::::::::::>Constructor");
	}

	@Override
	public String vegFood() {
		
		return "Your odered veg food through Swiggy";
	}

	@Override
	public String nonVegFood() {
		
		return "Your odered Non-veg food through Swiggy";
	}
	

}
