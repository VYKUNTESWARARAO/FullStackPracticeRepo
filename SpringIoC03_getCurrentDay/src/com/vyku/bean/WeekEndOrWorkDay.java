package com.vyku.bean;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wow")
public class WeekEndOrWorkDay
{
	@Autowired
	private LocalDate ld;
	
	
	public String wishToDay()
	{
		DayOfWeek doW=ld.getDayOfWeek();
		int doW1=doW.getValue();
		
		if(doW1==1|| doW1==2 || doW1==3 || doW1==4|| doW1==5) 
		{
			return  "Happy Working Day";
			
		}
		else 
		{
			return "Happy Weekend";
		}	
	}
	

}
