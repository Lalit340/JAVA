package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.beans.ProfessionalCricketer;

public class InnerbeanTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		ProfessionalCricketer crick=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/lp/cfgs/applicationContext.xml");
		//load bean class obj
		crick=factory.getBean( "cricket",ProfessionalCricketer.class);
		System.out.println(crick.score());
		

	}

}
