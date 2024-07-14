package com.vyku.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("shopping")
public class Shopping 
{
	@Autowired
	@Qualifier("paymode")
	private IPayment iPayment;
	
	//b.method
	public String buy(String items[],double prices[]) 
	{
		double billAmt=0.0;
		for(double price : prices) 
		{
			billAmt=billAmt+price;
			
		}
		String imethod=iPayment.doPayment(new Random().nextInt(100000), billAmt);
		System.out.println();
		System.out.println();
		System.out.println(imethod);
		
		return "items ::::: "+Arrays.toString(items)+ " prices for them are :::::"+ Arrays.toString(prices)+
				"======>Total BillAmt ==> "+billAmt;
		
	}
	
	

}
