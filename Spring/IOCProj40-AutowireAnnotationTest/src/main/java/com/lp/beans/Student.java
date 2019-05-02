package com.lp.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	// Fields
	private String sname;
	private int regNo;
	@Autowired
	@Qualifier("course1")
	private Course course;

	private Date dob;

	// setters Methods

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	@Autowired
	@Qualifier("dt2")
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSname() {
		return sname;
	}

	public int getRegNo() {
		return regNo;
	}

	public Course getCourse() {
		return course;
	}

	public Date getDob() {
		return dob;
	}

	// toString For printing values
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", regNo=" + regNo + ", course=" + course + ", dob=" + dob + "]";
	}

}
