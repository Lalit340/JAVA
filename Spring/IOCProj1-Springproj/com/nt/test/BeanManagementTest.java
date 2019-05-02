package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.sbeans.WishMessageGenerator;

public class BeanManagementTest {

	public static void main(String[] args) {
		Resource res = null;
		BeanFactory fac = null;
		Date d = null;
		WishMessageGenerator generator = null;
		// Locate and Hold bean cfg file
		res = new FileSystemResource("com\\nt\\cfg\\ApplicationContext.xml");
		fac = new XmlBeanFactory(res);
		// get object from IOC container
		d = (Date)fac.getBean("dt");
		System.out.println(" d obj date:::" + d);
		System.out.println("...............................");
		generator = (WishMessageGenerator)fac.getBean("wmg");
        System.out.println("BeanManagementTest.main()::"+generator.sayHello("Lalit"));
        
	}

}
