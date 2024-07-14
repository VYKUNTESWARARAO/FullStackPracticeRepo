package com.vyku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.vyku.sbeans.Shopping;

@SpringBootApplication
@ImportResource("com/vyku/commons/ApplicationContext.xml")
public class SpringBootIoC02DependencyInjectonStrategyPatternApplication {

	public static void main(String[] args) {
		try 
		{
			ApplicationContext ctx=SpringApplication.run(SpringBootIoC02DependencyInjectonStrategyPatternApplication.class, args);
			Shopping shop=ctx.getBean("shopping",Shopping.class);
			String resultMsg =shop.buy(new String[]{"shirt","phant","Shoes"},new double[]{4000.0,5000.0,2000.0});
			System.out.println(resultMsg);
			((ConfigurableApplicationContext) ctx).close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
