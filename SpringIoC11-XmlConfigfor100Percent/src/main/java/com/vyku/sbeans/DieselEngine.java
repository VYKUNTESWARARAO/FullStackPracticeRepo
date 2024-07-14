package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements Engine
{

	@Override
	public String start(String startPoint, String endPoint) {
		
		return "DieselEngine Started from "+startPoint +" going to "+endPoint;
	}

	@Override
	public String end(String startPoint, String endPoint) {
		
		return "DieselEngine from "+startPoint +" Arrived to "+endPoint;
	}
	

}
