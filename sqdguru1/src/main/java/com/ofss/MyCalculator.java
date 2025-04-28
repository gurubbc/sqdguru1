package com.ofss;

import java.util.logging.Logger;

public class MyCalculator {
	
	static Logger myLogger=Logger.getLogger("MyCalculator");
	 // Code Smell 1: Unnecessary variable
    public int add(int a, int b)
    {
       

        return a+b;
    }
	
	public int sub(int a, int b)
	{
		int result = 0;
		 // Duplicate code for unnecessary validation
        if (a > b) {
            myLogger.info("a is greater than b");
            result=a-b;
        }
        if (b > a) {
        	myLogger.info("b is greater than a");
        	result=b-a;
        }
        return result;
	}
}
