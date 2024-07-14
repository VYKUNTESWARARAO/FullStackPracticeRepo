package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("netbanking")
public class NetBanking implements IPayment {

	@Override
	public String doPayment(int orderid,double billAmt) 
	{
	  return "You have Paid through ===>NetBanking<=== the item having Ordered Id:: "+orderid+" and Bill Amt ::"+billAmt;
	}
	}
				