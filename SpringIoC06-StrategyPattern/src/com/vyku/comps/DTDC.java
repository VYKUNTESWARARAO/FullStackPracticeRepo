package com.vyku.comps;

public final class DTDC implements Courier
{

	@Override
	public String deliver(int oid) {
		
		return oid + " order delivered by using DTDC courier service";
	}
	

}
