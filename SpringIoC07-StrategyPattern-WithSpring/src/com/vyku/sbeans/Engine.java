package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component
public interface Engine 
{
	public void start();
	public void going();
	public void end();
}
