package com.Lp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.Lp.bean.WishMessageGenerator;

public class BeanTest {

	public static void main(String[] args) {
		
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
        //Hold and Load  resource path
		res= new FileSystemResource("src/com/Lp/cfgs/ApplicationContext.xml");
		System.out.println("hi");
		//create IOC container
		factory=new XmlBeanFactory(res);
		System.out.println("he");
		generator=(WishMessageGenerator)factory.getBean("wmg");
		//invoke b-methods
		System.out.println("WishMessage::"+generator.sayHello("LALIT"));
		
	}

}
