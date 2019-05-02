package com.Lp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.Lp.bean.WishMessageGenerator;

public class SetterMethodTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
        WishMessageGenerator generator=null;
        //Locate and hold the value
        res=new FileSystemResource("src/com/Lp/cfgs/ApplicationContext.xml");
        //create IOC Container
        factory=new XmlBeanFactory(res);
        generator=(WishMessageGenerator)factory.getBean("wmg");
      
        //get target class object
        System.out.println("say Message::"+generator.sayHello("Lalit"));
	}

}
