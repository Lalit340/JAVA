package com.lp.beans;

import java.util.Random;

public class PersonalBat {
	private String make;

	public void setMake(String make) {
		this.make = make;
	}
    public static int  run() {
    	return  new Random().nextInt(200);
    	
    }

}
