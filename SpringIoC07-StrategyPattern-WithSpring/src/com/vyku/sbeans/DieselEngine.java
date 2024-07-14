package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements Engine
{

	@Override
	public void start() {
		
		System.out.println("DieselEngine :: JOURNEY STARTED");
	}

	@Override
	public void going() {
		
		System.out.println("DieselEngine :: JOURNEY GOINGON");
	}

	@Override
	public void end() {
		System.out.println("DieselEngine :: JOURNEY ENDED");
		
	}
	

}
