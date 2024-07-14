package com.vyku.comps;

public class StandardBike implements Bike
{

	@Override
	public void start() {
		System.out.println("Hero Honda Bike.start()");
		
	}

	@Override
	public void drive() {
		System.out.println("Hero Honda Bike.drive()");
		
	}

	@Override
	public void park() {
		System.out.println("Hero Honda Bike.park()");
		
	}
	

}
