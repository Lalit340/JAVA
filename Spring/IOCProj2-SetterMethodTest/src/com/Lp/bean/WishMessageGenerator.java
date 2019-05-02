package com.Lp.bean;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String sayHello(String user) {
		int hour = 0;
		// get current object day time
		hour = date.getHours();
		// Write Wish message
		if (hour <= 12)
			return "GoodMorning::" + user;
		else if (hour <= 16)
			return "GoodAfternoon::" + user;
		else if (hour <= 20)
			return "GoodEvinning::" + user;
		else
			return "GoodNight::" + user;
	}

}
