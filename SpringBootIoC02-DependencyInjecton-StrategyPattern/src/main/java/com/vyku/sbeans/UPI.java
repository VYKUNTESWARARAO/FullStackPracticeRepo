package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPI implements IPayment {

	@Override
	public String doPayment(int orderid,double billAmt) 
	{
	  return "You have Paid through ===>UPI<=== the item having Ordered Id:: "+orderid+" and Bill Amt ::"+billAmt;
	}
	}
				