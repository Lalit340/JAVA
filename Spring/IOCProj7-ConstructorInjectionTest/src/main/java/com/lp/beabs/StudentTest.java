package com.lp.beabs;

public class StudentTest {
	private int sid;
	private String name;
	private String course;
	private double fee;
	public StudentTest(int sid, String name, String course, double fee) {
		System.out.println("StudentTest.StudentTest(---)");
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "StudentTest [sid=" + sid + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}

}
