package com.vyku.comps;

public class SportsBike implements Bike
{
	@Override
	public void start() {
		System.out.println("BMW Bike.start()");
		
	}

	@Override
	public void drive() {
		System.out.println("BMW Bike.drive()");
		
	}

	@Override
	public void park() {
		System.out.println("BMW Bike.park()");
		
	}

}
