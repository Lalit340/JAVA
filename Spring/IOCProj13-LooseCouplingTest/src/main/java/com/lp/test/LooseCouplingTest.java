package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.beans.FlipKart;

public class LooseCouplingTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		FlipKart kart=null;
		
		// create  IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions( "com/lp/cfgs/applicationContext.xml");
		//load target class cfg
        kart=factory.getBean( "fkt" ,FlipKart.class);
      //invoke b.method
      		System.out.println(kart.shopping(new String[] {"long kurta","dandiya sticks","rold gold ","kolhapuri"}));

	}

}
