package com.vyku.comps;

public class BlueDart implements Courier 
{

	@Override
	public String deliver(int oid) {
		
		return oid +" order delivered by using BlueDart Courier Service";
	}
	

}
