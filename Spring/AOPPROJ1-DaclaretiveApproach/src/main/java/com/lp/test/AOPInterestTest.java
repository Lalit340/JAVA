package com.lp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.target.BankService;

public class AOPInterestTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		//create container
		ctx=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
        //get  bean id object
		proxy=ctx.getBean("proxy" ,BankService.class);
		//invoking methods
		System.out.println(proxy.calcSimpleInterest(3, 24, 10000));
	}

}
