package com.vyku.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vyku.config.AppConfig;
import com.vyku.sbeans.PersonInfo;

public class PropertyValueAnnotationTest
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
		PersonInfo info=ctx.getBean("pInfo",PersonInfo.class);
		System.out.println(info);
		ctx.close();
	}

}
