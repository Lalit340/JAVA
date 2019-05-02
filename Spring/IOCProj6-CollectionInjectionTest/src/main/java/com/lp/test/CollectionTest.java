package com.lp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.beans.CollegeList;
import com.lp.beans.ColorSetTest;
import com.lp.beans.StudentArray;
import com.lp.beans.TeacherSubMapTest;

public class CollectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		StudentArray array = null;
		CollegeList list = null;
		ColorSetTest set = null;
        TeacherSubMapTest map=null;
        
		// create ioc container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/lp/cfgs/applicationContext.xml");
		// Load class
		array = factory.getBean("stud", StudentArray.class);
		System.out.println(array);

		System.out.println("=========================================");
		list = factory.getBean("clg", CollegeList.class);
		System.out.println(list + "        " + list.getClass());

		System.out.println("=========================================");
		set = factory.getBean("clr", ColorSetTest.class);
		System.out.println(set + "        " + set.getClass());

		System.out.println("=========================================");
		map = factory.getBean("teach", TeacherSubMapTest.class);
		System.out.println(map+ "        " + map.getClass());
	}

}