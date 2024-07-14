package com.vyku.test;

import com.vyku.comps.Bike;
import com.vyku.factoryPattern.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Bike bike1=BikeFactory.orderBike("standardbike");
		bike1.start();
		bike1.drive();
		bike1.park();
		System.out.println("===============================================");
		Bike bike2=BikeFactory.orderBike("heavyduty");
		bike2.start();
		bike2.drive();
		bike2.park();
		System.out.println("===============================================");
		Bike bike3=BikeFactory.orderBike("sportsbike");
		bike3.start();
		bike3.drive();
		bike3.park();
		

	}

}
