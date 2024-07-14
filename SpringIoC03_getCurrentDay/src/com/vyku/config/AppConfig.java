package com.vyku.config;



import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.vyku.bean")
public class AppConfig 
{
	
	  @Bean(name="ld") 
	  public LocalDate createLDT()
	  {
		  return LocalDate.now();
	  }
	 
	
	
	
}
