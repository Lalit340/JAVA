package com.lp.beans;

import java.util.Calendar;

public class PersonImf {
	private long adharNo;
	private String name;
	private double age;
	private Mobile mob;
	private Calendar cal;
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public void setMob(Mobile mob) {
		this.mob = mob;
	}
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	@Override
	public String toString() {
		return "PersonImf [adharNo=" + adharNo + ", name=" + name + ", age=" + age + ", mob=" + mob + ", cal=" + cal
				+ "]";
	}

}
