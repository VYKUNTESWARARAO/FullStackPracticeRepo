package com.vyku.sbeans;

import org.springframework.stereotype.Component;

@Component("food")
public interface Food 
{
	public String vegFood();
	public String nonVegFood();
}
