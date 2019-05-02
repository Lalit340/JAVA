package com.lp.ClientTest;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lp.controller.MainController;
import com.lp.vo.StudentVO;

public class RealTimeLayedprojTest {

	public static void main(String[] args) {
		System.out.println("START-RealTimeLayedprojTest.main(-)");
		String sno=null,sname=null,m1=null,m2=null,m3=null;
		Scanner sc=null;
		StudentVO vo=null;
		BeanFactory factory=null;
		MainController controller=null;
		String result=null;
		
		//reading input values
		sc=new  Scanner(System.in);
		System.out.println("Enter SNO::");
		sno=sc.next();
		System.out.println("Enter sname::");
		sname=sc.next();
        System.out.println("Enter m1::");
        m1=sc.next();
        System.out.println("Enter m2::");
        m2=sc.next();
        System.out.println("Enter m3::");
        m3=sc.next();
        //create vo object
        vo=new StudentVO();
        vo.setM1(m1);
        vo.setM2(m2);
        vo.setM3(m3);
        vo.setSname(sname);
        vo.setSno(sno);
        //create IOC container obj
        factory=new XmlBeanFactory(new ClassPathResource("com/lp/cfgs/ApplicationContext.xml"));
        //get controller class
        controller=factory.getBean("controller",MainController.class);
        try {
        	//invoke controller method
        	result=controller.generateResult(vo);
        	   System.out.println("result is::"+result);
           }//try
        catch(Exception e) {
        	e.printStackTrace();
			/*if( ((SQLException)e).getErrorCode()==1) {
				System.out.println("Inter problem -->User Already registered" );
			}
			else if(((SQLException)e).getErrorCode()==12899){
				System.out.println("Internal Problem---> Values are larger than colum size");
			}
			else {
				System.out.println("Internal problem");
			}
*/		}//catch
        System.out.println("END-RealTimeLayedprojTest.main(-)");
	}

}
