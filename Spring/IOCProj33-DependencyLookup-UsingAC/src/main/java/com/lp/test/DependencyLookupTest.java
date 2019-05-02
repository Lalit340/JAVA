package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.beans.Vehicle;

public class DependencyLookupTest {
	public static void main(String[] args) {
		ApplicationContext cxt=null;
	    Vehicle vehicle=null;
		//create IOC container
	   cxt=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
		System.out.println("IOC container of Client App is created");
		//get Target class object
		vehicle=cxt.getBean("vehicle",Vehicle.class);
		//invoke methods
		vehicle.journey(" hyd"," warangal" ,cxt);
		vehicle.entertainment();
		vehicle.soundHorn();
		
	}

}
