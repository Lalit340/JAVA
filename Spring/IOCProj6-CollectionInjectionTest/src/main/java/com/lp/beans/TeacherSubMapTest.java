package com.lp.beans;

import java.util.Map;

public class TeacherSubMapTest {
	private Map<String,String> teachers;

	public TeacherSubMapTest(Map<String, String> teachers) {
		System.out.println("TeacherSubMapTest.TeacherSubMapTest()");
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "TeacherSubMapTest [teachers=" + teachers + "]";
	}

}
