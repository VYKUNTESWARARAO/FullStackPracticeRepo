package com.vyku.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vyku.config.AppConfig;

public class I18Ntest 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Lang code :: ");
		String lang=sc.next();
		System.out.println("Enter Country Code :: ");
		String country=sc.next();
		Locale locale=new Locale(lang,country);
		
		String msg1=ctx.getMessage("wish.msg",new Object[]{"chinni"},locale);
		String msg2=ctx.getMessage("todaySpecial.msg",new Object[]{"lahari"},locale);
		System.out.println("===================================");
		System.out.println(msg1);
		System.out.println(msg2);
		
		sc.close();
		ctx.close();
	}

}
