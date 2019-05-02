package com.lp.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.lp.Controller.MainController;
import com.lp.vo.EmployeeVo;

public class NestedBeanTest {
	public static void main(String[] args) {
		System.out.println("Main Started");
		DefaultListableBeanFactory pfactory=null;
		XmlBeanDefinitionReader pReader=null;
		//Clhild cfg
		DefaultListableBeanFactory cfactory=null;
		XmlBeanDefinitionReader cReader=null;
		MainController cont=null;
		List<EmployeeVo> listVo=null;
		
		//parent container creation
		pfactory=new DefaultListableBeanFactory();
		pReader=new XmlBeanDefinitionReader(pfactory);
		pReader.loadBeanDefinitions("com/lp/cfgs/Bussiness-Layed.xml");
		//Child container creation
		cfactory=new DefaultListableBeanFactory(pfactory);
		cReader=new XmlBeanDefinitionReader(cfactory);
		cReader.loadBeanDefinitions("com/lp/cfgs/Presentation-Layed.xml");
		//get bean configur class
		cont=cfactory.getBean("controller",MainController.class);
		
		try {
			//invoke method
			listVo=cont.getEmpbyDept(30);
			for(EmployeeVo vo:listVo) {
				System.out.println(vo);
			}
		}
		catch(Exception e) {
		//	e.printStackTrace();
			System.out.println("Internal Problem::"+e.getMessage());
		}
		System.out.println("Main Ended");
	}//main

}//class
