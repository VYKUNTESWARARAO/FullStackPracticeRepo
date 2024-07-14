package com.vyku.comps;

import java.util.Arrays;
import java.util.Random;

public class Amazon
{
	private Courier courier;
	public void setCourier(Courier courier) 
	{
		System.out.println("Amazon.setCourier()");
		this.courier=courier;
	}
	
	
	// shopping method
	public String shopping(String items[],double prices[]) 
	{
		//Calculate Bill Method
		double billAmt=0.0;
		for(double p:prices) 
		{
			billAmt=billAmt+p;
		}
		//generate Random Order id
		int oid=new Random().nextInt(1000);
		
		//deliver the products using courier
		String msg=courier.deliver(oid);
		
		return Arrays.toString(items)+"\n.....Bill Amount....."+"\n"+
		Arrays.toString(prices)+"===> Total :: "+billAmt+"\n ===>"+msg;
		
	}
	

}
