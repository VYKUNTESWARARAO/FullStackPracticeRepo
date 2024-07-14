package com.vyku.sbeans;

public class ElectricalEngine implements Engine
{

	@Override
	public String start(String startPoint, String endPoint) {
		
		return "ElectricalEngine Started from "+startPoint +" going to "+endPoint;
	}

	@Override
	public String end(String startPoint, String endPoint) {
		
		return "ElectricalEngine from "+startPoint +" Arrived to "+endPoint;
	}
	

}
