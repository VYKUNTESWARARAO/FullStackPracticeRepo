package com.vyku.factoryPattern;

import com.vyku.comps.Bike;
import com.vyku.comps.HeavyDuty;
import com.vyku.comps.SportsBike;
import com.vyku.comps.StandardBike;

public class BikeFactory 
{
	
	public static Bike orderBike(String type) 
	{
		 Bike bike=null;
		 if(type.equalsIgnoreCase("heavyduty")) 
		 {
			 bike =new HeavyDuty(); 
		 }
		 else if(type.equalsIgnoreCase("sportsbike")) 
		 {
			 bike=new SportsBike();
		 }
		 else if(type.equalsIgnoreCase("Standardbike")) 
		 {
			 bike=new StandardBike();
		 }
		 else
			 throw new IllegalArgumentException("Invalid Input");
		 return(bike);	
	}
}
