package com.vyku.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderServiceImpl implements ISeasonFinderMgmtService{

	@Override
	public String seasonGuessing() {
		
		int month=LocalDate.now().getMonthValue();
		
		if(month>=3 || month<=6) 
		{
		    return "Summer Season";
		}
		else if(month>=7 || month<=11) {
			return "Rainy Season";
			}
		else
		{
			return "Winter Season";
		}
	}
	
	

}
