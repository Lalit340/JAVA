package com.lp.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	//Fields
	private String sname;
	private int regNo;
	private Course course;
	private Date doj;
	private Date dob;

	//setters & Getter Methods 
	public String getSname() {
		return sname;
	}
  
	public int getRegNo() {
		return regNo;
	}

	public Course getCourse() {
		return course;
	}

	public Date getDoj() {
		return doj;
	}

	public Date getDob() {
		return dob;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	  @Required
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	  @Required
	public void setCourse(Course course) {
		this.course = course;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}
	  @Required
	public void setDob(Date dob) {
		this.dob = dob;
	}
    //toString For printing values
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", regNo=" + regNo + ", course=" + course + ", doj=" + doj + ", dob=" + dob
				+ "]";
	}

}
