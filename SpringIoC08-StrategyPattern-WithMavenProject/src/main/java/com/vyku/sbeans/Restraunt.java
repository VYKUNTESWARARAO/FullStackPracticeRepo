package com.vyku.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("restraunt")
public class Restraunt 
{
	@Autowired
	@Qualifier("zomato")
	private Food food;
	
	public String order(String item,String beverages) 
	{
		System.out.println("Restraunt==========>Select your order");
		String f1=food.vegFood();
		String f2=food.nonVegFood();
		System.out.println(f1);
		System.out.println(f2);
		return "You have Ordered "+item+" with "+beverages;
	}
	
	
	
	
	
	
}
