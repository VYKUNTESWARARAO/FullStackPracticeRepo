package com.vyku.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vyku.bean.ShowCurrentSeason;
import com.vyku.config.AppConfig;

public class DependencyInjectionTest
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ShowCurrentSeason season=ctx.getBean("scs",ShowCurrentSeason.class);
		String seasonIs=season.ShowSeason();
		System.out.println(seasonIs);
		ctx.close();
		
	}

}
