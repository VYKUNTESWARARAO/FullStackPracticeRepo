package com.vyku.comps;

public class Vehicle 
{
	private Engine Engine;
	public void setEngine(Engine engine) 
	{
		this.Engine=engine;
	}
	
	public String vehicleSelling(int count,String color) 
	{
		int hp=Engine.horsePower();
		int mlg=Engine.mileage();
		int ms=Engine.maxSpeed();
		
		return "You have ordered "+ count + color+" having HorsePower "+   hp+"Watts  Mileage "+mlg+"kms  MaxSpeed of "+ms+"kmph ";
		
	}
	
	
	
	

}
