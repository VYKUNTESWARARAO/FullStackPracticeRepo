package com.vyku.sbeans;



import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("votercheck")
public class VoterCheck 
{
	@Value("${voter.id}")
	private Integer id;
	
	@Value("${voter.name}")
	private String name;
	
	@Value("${voter.age}")
	private Integer age;
	
	private Date verifiedOn;
	@PostConstruct
	public void myInit() 
	{
		System.out.println("VoterCheck.myInit()==========>");
		verifiedOn =new Date();
		if(name==null || age<=0) 
		{
			throw new IllegalArgumentException();
		}
		
	}
	
	public String checkVoteEligiblity() 
	{
		System.out.println("VoterCheck.checkVoteEligiblity()");
		if(age>=18) 
		{
			return "Mr/Mrs/Ms "+name+" your are "+age+" now eligbile for voting ::::-->verified on "+verifiedOn; 
		}
		else 
		{
			return "Mr/Mrs/Ms "+name+" your are "+age+" now not eligbile for voting ::::-->verified on "+verifiedOn;
		}
	}
	
	
	
	@PreDestroy
	public void myDestroy() 
	{
		System.out.println("VoterCheck.myDestroy()::::::::::>");
		id=0;
		name=null;
		age=0;
		
	}
	
	

}
