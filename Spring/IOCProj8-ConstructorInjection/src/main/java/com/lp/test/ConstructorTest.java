package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.bean.ConstructorINJTest;

public class ConstructorTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		ConstructorINJTest ct=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
       reader=new XmlBeanDefinitionReader(factory);
       reader.loadBeanDefinitions("com/lp/cfgs/applicationContext.xml");
       //load constructor class
       ct=factory.getBean("cont",ConstructorINJTest.class);
       System.out.println(ct);
	}

}
