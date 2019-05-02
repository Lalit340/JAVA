package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.beans.Vehicle;

public class DependencyLookupTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
	    Vehicle vehicle=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/lp/cfgs/applicationContext.xml");
		System.out.println("IOC container of Client App is created");
		//get Target class object
		vehicle=factory.getBean("vehicle",Vehicle.class);
		//invoke methods
		vehicle.journey(" hyd"," warangal");
		vehicle.entertainment();
		vehicle.soundHorn();
		
	}

}
