package com.lp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.service.BankLoan;

public class MethodReplacer {

	public static void main(String[] args) {
		ApplicationContext cxt=null;
		BankLoan bank=null;
		//create container object
		cxt=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
		//get service class obj
		bank=cxt.getBean("bank",BankLoan.class);
		//invoke method
		System.out.println(bank.calcLoanInterest(70000, 12));
	}

}
