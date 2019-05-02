package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.beans.TravelAgents;

public class AutowireTestbyName {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		TravelAgents agent=null;
		
		// create  IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions( "com/lp/cfgs/applicationContext.xml");
		//load target class cfg
		agent=factory.getBean( "agent" ,TravelAgents.class);
		//invike method
		agent.executeAgent();
	}

}
