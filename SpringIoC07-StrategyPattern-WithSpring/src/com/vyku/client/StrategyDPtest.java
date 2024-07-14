package com.vyku.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.vyku.config.AppConfig;
import com.vyku.sbeans.Vehicle;

public class StrategyDPtest 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		String resultMsg=vehicle.journey("Hyderabad", "Delhi");
		System.out.println(resultMsg);
		ctx.close();
		
	}
}
