package com.lp.beans;

import java.util.Arrays;
import java.util.Date;

public class StudentArray {
	private int[] marks;
	private Date[] date;
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setDate(Date[] date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "SetterINGforArray [marks=" + Arrays.toString(marks) + ", date=" + Arrays.toString(date) + "]";
	}
	

}
