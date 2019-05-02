package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


import com.lp.beans.Student;

public class CPNameSpaceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Student student=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/lp/cfgs/applicationContext.xml");
		//load bean class obj
		student=factory.getBean( "stud",Student.class);
		System.out.println(student);
		

	}

}
