package com.lp.beans;

public class Student {
       private int sno;
       private String sname;
       private Course coure;
	public Student() {
		System.out.println("Student.Student(0-param)");
	}
	
	public int getSno() {
		return sno;
	}

	public String getSname() {
		return sname;
	}

	public Course getCoure() {
		return coure;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setCoure(Course coure) {
		this.coure = coure;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", coure=" + coure + "]";
	}
    
}
