package com.vyku.test;

import com.vyku.comps.Amazon;
import com.vyku.factory.AmazonFactory;

public class StrategyPatternTest {

	public static void main(String[] args)
	{
		Amazon amg=AmazonFactory.getInstance("dtdc");
		
		String resultMsg=amg.shopping(new String[] {"shirts","pants","shoes"},new double[]{2000.0,2200.0,1000.0});
		
		System.out.println(resultMsg);
		

	}

}
