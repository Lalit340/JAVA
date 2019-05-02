package com.lp.beans;

import java.util.Date;

public class  Course {
	private String cname;
    private double fees;
    private Date date;
    
	public Course(String cname, double fees, Date date) {
		System.out.println("Course.Course(3-param)");
		this.cname = cname;
		this.fees = fees;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Course [cname=" + cname + ", fees=" + fees + ", date=" + date + "]";
	}
}
