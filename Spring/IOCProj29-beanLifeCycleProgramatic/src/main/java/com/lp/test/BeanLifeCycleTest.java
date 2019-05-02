package com.lp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.beans.VoterEligibility;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext cnt=null;
		VoterEligibility eligible=null;
		//create ioc container
		cnt=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
		
		eligible=cnt.getBean("voter" ,VoterEligibility.class);
		//invoke method
		System.out.println(eligible.checkingVoterEligible());
        // close ioc comtainer
		((AbstractApplicationContext) cnt).close();
	}

}
