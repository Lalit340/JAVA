package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.beabs.StudentTest;

public class ConstructorINGTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         DefaultListableBeanFactory factory=null;
         XmlBeanDefinitionReader reader=null;
         StudentTest test=null;
         //create IOC container
         factory= new DefaultListableBeanFactory();
         reader=new XmlBeanDefinitionReader(factory);
         reader.loadBeanDefinitions( "com/lp/cfgs/applicationContext.xml");
         //load bean class
         test=factory.getBean( "std",StudentTest.class);
         System.out.println(test);
	}

}
