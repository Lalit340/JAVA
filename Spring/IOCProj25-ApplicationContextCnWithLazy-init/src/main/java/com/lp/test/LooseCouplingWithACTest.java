package com.lp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.beans.FlipKart;

public class LooseCouplingWithACTest {

	
	public static void main(String[] args) {
	    ApplicationContext  ac=null;
		FlipKart kart=null;
		
		// create  IOC Container
		ac=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
		//load target class cfg
        kart=ac.getBean( "fkt" ,FlipKart.class);
      //invoke b.method
      		System.out.println(kart.shopping(new String[] {"long kurta","dandiya sticks","rold gold ","kolhapuri"}));

	}

}
