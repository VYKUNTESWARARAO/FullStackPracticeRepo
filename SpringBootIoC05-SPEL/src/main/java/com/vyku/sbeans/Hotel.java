package com.vyku.sbeans;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;



@Component("hotel")
public class Hotel 
{
	@Value("12345")
	private Integer hotelId;    //values from properties file
	
	@Value("${hotel.name}")    //values from properties file
	private String hotelName;    //values from properties file
	@Value("${hotel.addrs}")
	private String hotelAddrs;    //values from properties file
	
	@Value("${customer.name}")
	private String customerName;
	
	@Value("#{prices.idlyPrice+prices.dosaPrice}")   //SPELL ARTHEMETIC EXPRESSION
	private Double billAmt;
	
	@Value("${os.name}")
	private String osName;   //System properties
	
	@Value("${user.name}")
	private String windowUser;   //System properties
	@Value("${Path}")
	private String pathData;   //Path variable
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs
				+ ", customerName=" + customerName + ", billAmt=" + billAmt + ", osName=" + osName + ", windowUser="
				+ windowUser + ", pathData=" + pathData + "]";
	}
	
	
	
	  
	
	
}
