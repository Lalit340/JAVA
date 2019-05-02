package com.Lp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Lp.bean.WishMessageGenerator;

public class CONInjectionTest {

	public static  void main(String[] args) {
		Resource res=null;
		System.out.println("hi");
		BeanFactory factory=null;
        WishMessageGenerator generator=null;
        //Locate and hold the value
        res=new ClassPathResource("com/Lp/cfgs/ApplicationContext.xml");
        //create IOC Container
       factory=new XmlBeanFactory(res);
        generator=(WishMessageGenerator)factory.getBean("wmg");
      
        //get target class object
        System.out.println("say Message::"+generator.SayHello("Lalit"));

	}

}
