package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.beans.Car;

public class BeanInheritanceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Car carH=null;
		Car carR=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/lp/cfgs/applicationContext.xml");
		//load bean class 
		carH=factory.getBean("mncar" ,Car.class);
		System.out.println(carH);
        System.out.println("===================================================");
        
		carR=factory.getBean("mmcar" ,Car.class);
		System.out.println(carR);
	}

}
