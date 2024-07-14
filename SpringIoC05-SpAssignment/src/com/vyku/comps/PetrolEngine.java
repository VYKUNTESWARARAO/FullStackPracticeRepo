package com.vyku.comps;

public class PetrolEngine implements Engine
{

	@Override
	public int mileage() {
		
		return 60;
	}

	@Override
	public int horsePower() {
		
		return 2;
	}

	@Override
	public int maxSpeed() {
		
		return 100;
	}


}
