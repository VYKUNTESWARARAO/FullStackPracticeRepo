package com.vyku.factory;



import com.vyku.comps.DieselEngine;
import com.vyku.comps.ElectricalEngine;
import com.vyku.comps.Engine;
import com.vyku.comps.PetrolEngine;
import com.vyku.comps.Vehicle;

public class VehicleFactory
{
	public static Vehicle getInstance(String vehicleType)
	{
		Engine engine=null;
		if(vehicleType.equalsIgnoreCase("electricalengine")) 
		{
			engine = new ElectricalEngine();
		}
		else if(vehicleType.equalsIgnoreCase("dieselEngine")) 
		{
			engine =new DieselEngine();
		}
		else if(vehicleType.equalsIgnoreCase("petrolEngine")) 
		{
			engine=new PetrolEngine();
		}
		else
			throw new IllegalArgumentException();
		
		Vehicle vh=new Vehicle();
		vh.setEngine(engine);
		return vh;
		
	}

}
