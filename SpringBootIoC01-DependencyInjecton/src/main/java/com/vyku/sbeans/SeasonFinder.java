package com.vyku.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder 
{
	@Autowired
	private LocalDate ldt;
	
	//b.method
	public String currentSeason() 
	{
		
		int month=ldt.getMonthValue();
		if(month>3 && month<8)
			return "Summer Season";
		else if(month>=8 && month<11)
			return  "Rainy Season";
		else
			return  "Winter Season";
		
	}
	

}
