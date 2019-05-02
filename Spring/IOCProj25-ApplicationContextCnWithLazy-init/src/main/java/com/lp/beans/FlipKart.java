package com.lp.beans;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {
private Courier courier;
	
	public FlipKart(Courier courier) {
		System.out.println("Flipkart:1-param constructor");
		this.courier = courier;
	}
	public FlipKart() {
		System.out.println("Flipkart: 0-param constructor");
	}

	public  String shopping(String[] items) {
		System.out.println("Flipkart:: shopping(-)");
		float billAmt=0.0f;
		Random rad=null;
		int oid=0;
		//calc bill Amount
		billAmt=items.length*1000;
		//generate orderId
		rad=new Random();
		oid=rad.nextInt(10000);
	     courier.deliver(oid);
		return Arrays.toString(items)+" Bill Amount:: "+billAmt;
	}
	
}
