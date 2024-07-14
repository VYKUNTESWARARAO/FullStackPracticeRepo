package com.vyku.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vyku.config.AppConfig;
import com.vyku.sbeans.Vehicle;

public class XmlConfigtest
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		String result =vehicle.journey();
		System.out.println(result);
		ctx.close();
	}

}
