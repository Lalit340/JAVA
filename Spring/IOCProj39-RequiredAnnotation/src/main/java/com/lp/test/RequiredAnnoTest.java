package com.lp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.beans.Student;

public class RequiredAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
        Student stud=null;
		
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
		//get Bean Class object
		stud=ctx.getBean("std" ,Student.class);
		
		System.out.println(stud);
	}

}
