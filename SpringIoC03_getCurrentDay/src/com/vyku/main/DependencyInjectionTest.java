package com.vyku.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vyku.bean.WeekEndOrWorkDay;
import com.vyku.config.AppConfig;

public class DependencyInjectionTest 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		WeekEndOrWorkDay wow1=ctx.getBean("wow",WeekEndOrWorkDay.class);
		String msg=wow1.wishToDay();
		System.out.println(msg);
		ctx.close();
		
	}

}
