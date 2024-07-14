package com.vyku.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vyku.config.AppConfig;
import com.vyku.sbeans.VoterCheck;

public class LifeCycleMethodsTest
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		VoterCheck voterCheck=ctx.getBean("votercheck",VoterCheck.class);
		String result=voterCheck.checkVoteEligiblity();
		System.out.println(result);
		ctx.close();
		
	}

}
