package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("card")
public class Card implements IPayment {

	@Override
	public String doPayment(int orderid,double billAmt) 
	{
	  return "You have Paid through ===>Card<=== the item having Ordered Id:: "+orderid+" and Bill Amt ::"+billAmt;
	}
	}
				