package com.vyku.factory;

import com.vyku.comps.Amazon;
import com.vyku.comps.BlueDart;
import com.vyku.comps.Courier;
import com.vyku.comps.DTDC;

public class AmazonFactory
{
	public static Amazon getInstance(String courierType) 
	{
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc")) 
		{
			courier=new DTDC();
		}
		else if(courierType.equalsIgnoreCase("bluedart")) 
		{
			courier =new BlueDart();
		}
		else
			throw new IllegalArgumentException("Invalid courier type");
		Amazon amg= new Amazon();
		amg.setCourier(courier);
		
		return amg;
	}

}
