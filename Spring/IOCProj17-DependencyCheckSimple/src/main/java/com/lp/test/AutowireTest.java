package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.beans.PersonImf;

public class AutowireTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonImf per=null;
		
		// create  IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions( "com/lp/cfgs/applicationContext.xml");
		//load target class cfg
		per=factory.getBean( "pfm" ,PersonImf.class);
		//invike method
	    System.out.println(per);
	}

}
