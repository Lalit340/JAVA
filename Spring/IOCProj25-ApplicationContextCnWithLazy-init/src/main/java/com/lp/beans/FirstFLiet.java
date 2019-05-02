package com.lp.beans;

import java.util.Date;

public class FirstFLiet implements Courier {

	public FirstFLiet() {
		System.out.println("FirstFliet: 0-param constructor");
	}
	
	public void deliver(int oid) {
		System.out.println(oid+" order is delivered to customer on "+new Date()+"by firstfliet");
	}

}
