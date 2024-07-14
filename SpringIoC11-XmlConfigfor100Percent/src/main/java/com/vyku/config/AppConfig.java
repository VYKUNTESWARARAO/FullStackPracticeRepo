package com.vyku.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.vyku.sbeans")
@ImportResource("com/vyku/commons/ApplicationContext.xml")
public class AppConfig {

}
