package com.vyku.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderServiceImpl implements ISeasonFinderMgmtService{

	@Override
	public String seasonGuessing() {
		
		int month=LocalDate.now().getMonthValue();
		
		if(month>=3 || month<=7) 
		{
		    return "Summer Season";
		}
		else if(month>=8 || month<=11) {
			return "Rainy Season";
			}
		else
		{
			return "Winter Season";
		}
	}
	
	

}
