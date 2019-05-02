package com.lp.beans;

import java.util.Arrays;

public class Student {
	private String[] students;
	
	public Student() {
		System.out.println("Student.Student(0-param cons)");
	}

	public void setStudents(String[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Student (students=" + Arrays.toString(students) + ")";
	}

}
