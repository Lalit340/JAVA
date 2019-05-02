package com.lp.beans;

import org.springframework.context.ApplicationContext;

public class Vehicle {
	private String beanId;

	public Vehicle(String beanId) {
		this.beanId = beanId;
		System.out.println("Viechle:0-param cosntructor");
	}

	public void entertainment() {
		System.out.println("This viechle is equipped with Xplod  DVD player");
	}

	public void soundHorn() {
		System.out.println("This viechle is equipped with skoda horn");
	}

	public void journey(String startPlace, String endPlace,ApplicationContext cxt) {
		Engine engg = null;
		
		// create IOC container
		System.out.println("IOC container of Viechle class  journey(-,-) is created");
		// perform Dependency lookup to get Dependent class obj
		engg = cxt.getBean(beanId, Engine.class);
		// use Dependent class object
		engg.start();
		System.out.println("Jounery started and going on.... from" + startPlace + " to " + endPlace);
		engg.stop();
		System.out.println("Jouney Finised at" + endPlace);
	}// method

}