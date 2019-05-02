package com.lp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.beans.PersonDetails;

public class PropertyEditorTest {

	public static void main(String[] args) {
	    ApplicationContext ctx=null;
	    PersonDetails details=null;
	    
	    //create IOC container obj.
	    ctx=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
	    //get the bean object
	    details=ctx.getBean("details",PersonDetails.class);
	    //display the values
	    System.out.println(details);

	}

}
