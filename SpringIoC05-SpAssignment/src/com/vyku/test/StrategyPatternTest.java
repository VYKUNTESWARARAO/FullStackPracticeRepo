package com.vyku.test;

import com.vyku.comps.Vehicle;
import com.vyku.factory.VehicleFactory;

public class StrategyPatternTest 
{
	public static void main(String[] args) 
	{
		Vehicle vh=VehicleFactory.getInstance("electricalengine");
		
		String resultmsg=vh.vehicleSelling(1, "black");
		System.out.println(resultmsg);
		
		
	}

}
