package com.lp.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterEligibility implements InitializingBean , DisposableBean {
	private String name;
	private int age;
	private String addr;
	private Date checkDate;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//my init method for checking
	public void myInit() {
		System.out.println("VoterIllegibility.myInit()");
		if(name==null ||age<=0)
			throw new IllegalArgumentException("name and age is mandotary");
	}
     //b.logic for the program
	public String checkingVoterEligible() {
		System.out.println("chexkingVoterEligible method Execute");
		checkDate=new Date();
		if(age<18)
			return "Mr./Miss "+name+" u r not eligible for voting"+checkDate;
		else
			return "Mr./Miss "+name+" u r eligible for voting"+checkDate;
	}
	public void destroy() throws Exception {
		System.out.println("VoterIllegibility.myDestroy()");
		name=null;
		age=0;
		addr=null;
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoterIllegibility.myInit()");
		if(name==null ||age<=0)
			throw new IllegalArgumentException("name and age is mandotary");
		
	}
	
	//destroy method 
	public void myDestroy() {
		System.out.println("VoterIllegibility.myDestroy()");
		name=null;
		age=0;
		addr=null;
	}
}
