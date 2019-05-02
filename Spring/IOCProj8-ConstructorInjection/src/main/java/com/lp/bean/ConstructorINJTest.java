package com.lp.bean;

public class ConstructorINJTest {
	private int sno;
	private String sname;
	private String course;
	public ConstructorINJTest(int sno, String sname, String course) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}
	@Override
	public String toString() {
		return "ConstructorINJTest [sno=" + sno + ", sname=" + sname + ", course=" + course + "]";
	}

}
