package com.vyku.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vyku.config.Appconfig;
import com.vyku.sbeans.Restraunt;

public class MavenStrategyDp
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		Restraunt restraunt=ctx.getBean("restraunt",Restraunt.class);
		String result= restraunt.order("Pavbaji", "Mango Juice");
		System.out.println(result);
		ctx.close();
	}
}
