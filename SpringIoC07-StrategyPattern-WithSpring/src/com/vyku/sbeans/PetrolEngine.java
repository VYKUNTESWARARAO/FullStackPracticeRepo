package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements Engine
{

	@Override
	public void start() {
		
		System.out.println("PetrolEngine :: JOURNEY STARTED");
	}

	@Override
	public void going() {
		
		System.out.println("PetrolEngine :: JOURNEY GOINGON");
	}

	@Override
	public void end() {
		System.out.println("PetrolEngine :: JOURNEY ENDED");
		
	}
	

}
