package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements Engine
{

	@Override
	public String start(String startPoint, String endPoint) {
		
		return "PetrolEngine Started from "+startPoint +" going to "+endPoint;
	}

	@Override
	public String end(String startPoint, String endPoint) {
		
		return "PetrolEngine Coming from "+startPoint +" Arrived to "+endPoint;
	}
	

}
