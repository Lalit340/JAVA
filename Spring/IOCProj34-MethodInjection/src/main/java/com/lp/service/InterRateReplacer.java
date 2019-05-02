package com.lp.service;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class InterRateReplacer implements MethodReplacer {
	private double rate;
	
	public InterRateReplacer() {
		System.out.println("0-param Constructor of interRateReplacer()");
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("InterRateReplacer.reimplement()");
		double pAtm=0,time=0;
		//set the values of operations
		pAtm=(Double) args[0];
		time=(Double) args[1];
		return pAtm*time*rate/100;
	}

}
