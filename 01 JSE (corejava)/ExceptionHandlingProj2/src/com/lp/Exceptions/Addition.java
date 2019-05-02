package com.lp.Exceptions;

public class Addition {
	
	public static int add(int a ,int b)  throws IllegalArgumentException {
		
		if(a<0 || b<0) {
	    	throw new  IllegalArgumentException("the no. is not a positive num.");
			
		}
		else
			return a+b;
			
	}

}
