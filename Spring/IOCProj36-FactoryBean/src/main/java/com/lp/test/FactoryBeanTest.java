package com.lp.test;

import java.io.Closeable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.beans.PlanRemainder;


public class FactoryBeanTest {

	public static void main(String[] args) {
		ApplicationContext cxt=null;
		PlanRemainder rem=null;
	
		//create IOC container 
		cxt=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
		System.out.println("hi");
		//get the bean class obj.
		rem=cxt.getBean("remainder", PlanRemainder.class);
		//invoke the implemented methods
	     System.out.println("Plan Of the is::"+rem);
		
    

	}

}
