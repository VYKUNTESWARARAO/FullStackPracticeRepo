package com.vyku.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vyku.bean.WishMessageGenerator;
import com.vyku.config.AppConfig;

public class DependencyInjectionTest
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		 String msg=generator.showWishMessageGenerator("Vyku");
		 System.out.println(msg);
		 ctx.close();
		
	}

}
