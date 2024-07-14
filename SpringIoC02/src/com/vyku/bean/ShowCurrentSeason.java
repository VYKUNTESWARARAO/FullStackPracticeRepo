package com.vyku.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("scs")
public class ShowCurrentSeason
{
	@Autowired
	private LocalDate ld;
	public String ShowSeason() 
	{
		int currentMonth =ld.getMonthValue();
		
		if(currentMonth>=11 && currentMonth<=2) 
		{
			return "This is Winter Season";
		}
		else if(currentMonth>=3 && currentMonth<=6) 
		{
			return "This is Summer Season";
		}
		else
		{
			return "This is Rainy Season";
		}
		
	}
}
