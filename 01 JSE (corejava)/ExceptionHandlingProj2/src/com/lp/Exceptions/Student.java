package com.lp.Exceptions;

public class Student {
	private int flo;
	private int sle;
	private int tlh;
	private int math;
	private int science;
	private int socialSc;
	
	public Student() {
		System.out.println("Student.Student(0-param)");
	}

	public int getFlo() {
		return flo;
	}

	public void setFlo(int flo) throws IllegalArgumentException{
		if(flo<0 || flo>100) {
			throw new IllegalArgumentException("Entered value is not valied");
		}else
		this.flo = flo;
	}

	public int getSle() {
		return sle;
	}

	public void setSle(int sle) throws IllegalArgumentException {
		if(flo<0 || flo>100) 
			throw new IllegalArgumentException("Entered value is not valied");
		this.sle = sle;
	}

	public int getTlh() {
		return tlh;
	}

	public void setTlh(int tlh) throws IllegalArgumentException {
		if(flo<0 || flo>100) 
			throw new IllegalArgumentException("Entered value is not valied");
		this.tlh = tlh;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) throws IllegalArgumentException {
		if(flo<0 || flo>100) 
			throw new IllegalArgumentException("Entered value is not valied");
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) throws IllegalArgumentException {
		if(flo<0 || flo>100) 
			throw new IllegalArgumentException("Entered value is not valied");
		this.science = science;
	}

	public int getSocialSc() {
		return socialSc;
	}

	public void setSocialSc(int socialSc) throws IllegalArgumentException {
		if(flo<0 || flo>100) 
			throw new IllegalArgumentException("Entered value is not valied");
		this.socialSc = socialSc;
	}
}
