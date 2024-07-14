package com.vyku;

import java.time.LocalDate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.vyku.sbeans.SeasonFinder;

@SpringBootApplication
public class SpringBootIoC01DependencyInjectonApplication 
{
    @Bean(name = "ld")
    LocalDate localDate() 
	{
		return LocalDate.now();
	}
	public static void main(String[] args) 
	{
		
		ApplicationContext ctx=SpringApplication.run(SpringBootIoC01DependencyInjectonApplication.class, args);
		SeasonFinder sf = ctx.getBean("sf",SeasonFinder.class);
		String result =sf.currentSeason();
		System.out.println("::::::::::::::::::::>>>>>>>>>>"+result);
		((ConfigurableApplicationContext) ctx).close();
	}
	

}
