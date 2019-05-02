package com.lp.beans;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class PersonDetails {
	
	//Fields (Variables)
	private String name;
	private int       age;
	private char gender;
	private int[] marks;
	private String[] subjects;
	private URL fb;
	private Date dob;
	private URI link;
	private File img;
	
	//Setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	public void setFb(URL fb) {
		this.fb = fb;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setLink(URI link) {
		this.link = link;
	}
	public void setImg(File img) {
		this.img = img;
	}
	//toString() method for displaying
	@Override
	public String toString() {
		return "PersonDetails [name=" + name + ", age=" + age + ", gender=" + gender + ", marks="
				+ Arrays.toString(marks) + ", subjects=" + Arrays.toString(subjects) + ", fb=" + fb + ", dob=" + dob
				+ ", link=" + link + ", img=" + img + "]";
	}//toString

}//class
