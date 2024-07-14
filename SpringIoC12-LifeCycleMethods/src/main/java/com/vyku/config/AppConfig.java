package com.vyku.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.vyku.sbeans")
@PropertySource("com/vyku/commons/Info.properties")
public class AppConfig 
{
	

}
