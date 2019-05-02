package com.lp.beans;

import java.util.Date;

public class PlanRemainder {
       private Date date;

	public PlanRemainder(Date date) {
		System.out.println("PlanRemainder::1-param PlanRemainder()");
		this.date = date;
	}

	@Override
	public String toString() {
		return "PlanRemainder [date=" + date + "]";
	}
	
}
