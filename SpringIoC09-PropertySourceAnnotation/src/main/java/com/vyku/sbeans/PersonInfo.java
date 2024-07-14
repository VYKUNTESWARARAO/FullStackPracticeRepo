package com.vyku.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")

public class PersonInfo
{
	@Value("${per.id}")
	private int person_id;
	@Value("${per.name}")
	private String person_name;
	@Value("${per.addrs}")
	private String person_Address;
	@Value("${per.phoneno}")
	private long person_phoneNum;
	
	
	
	@Override
	public String toString() {
		return "PersonInfo [person_id=" + person_id + ", person_name=" + person_name + ", person_Address="
				+ person_Address + ", person_phoneNum=" + person_phoneNum + "]";
	}
	
	
	

}
