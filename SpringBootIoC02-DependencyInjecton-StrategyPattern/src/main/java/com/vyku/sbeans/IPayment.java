package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("payment")
public interface IPayment
{
	public String doPayment(int orderid,double prices);

	

	
}
