package com.lp.beans;

public class Course {
	//Fields
	private String cname;
	private double fees;
	
	//setter methods 
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	//toString method for printing
	@Override
	public String toString() {
		return "Course [cname=" + cname + ", fees=" + fees + "]";
	}
	

}
