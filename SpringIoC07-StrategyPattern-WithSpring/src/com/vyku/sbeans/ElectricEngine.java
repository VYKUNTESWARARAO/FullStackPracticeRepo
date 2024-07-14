package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements Engine
{

	@Override
	public void start() {
		
		System.out.println("ElectricEngine :: JOURNEY STARTED");
	}

	@Override
	public void going() {
		
		System.out.println("ElectricEngine :: JOURNEY GOINGON");
	}

	@Override
	public void end() {
		System.out.println("ElectricEngine :: JOURNEY ENDED");
		
	}
	

}
