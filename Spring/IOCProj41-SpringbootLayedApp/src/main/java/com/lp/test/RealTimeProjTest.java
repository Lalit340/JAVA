package com.lp.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.lp.Controller.ConfigApp;
import com.lp.Controller.MainController;
import com.lp.vo.StudentVo;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@Import(value = ConfigApp.class)
public class RealTimeProjTest {

	public static void main(String[] args) {
		System.out.println("RealtimeDITest:: start of main()");
		Scanner sc = null;
		String sno = null, sname = null, m1 = null, m2 = null, m3 = null;
		StudentVo vo = null;
		ApplicationContext ctx = null;
		MainController controller = null;
		String result = null;
		// read inputs
		sc = new Scanner(System.in);
	/*	System.out.println("Enter Sno::");
		sno = sc.next();*/
		System.out.println("Enter name::");
		sname = sc.next();
		System.out.println("Enter marks1::");
		m1 = sc.next();
		System.out.println("Enter marks2::");
		m2 = sc.next();
		System.out.println("Enter marks3::");
		m3 = sc.next();
		// create StudentVO class object
		vo = new StudentVo();
	//	vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);

		// create IOC container
		ctx = SpringApplication.run(RealTimeProjTest.class, args);
		// get Controller class object
		controller = ctx.getBean("mainStd", MainController.class);
		try {
			// invoke method
			result = controller.generateResult(vo);
			System.out.println("Result is :::" + result);
			// close stream
			((ConfigurableApplicationContext) ctx).close();
		} // try
		catch (Exception e) {

			if (((SQLException) e).getErrorCode() == 1) {
				System.out.println("Inter problem -->User Already registered");
			} else if (((SQLException) e).getErrorCode() == 12899) {
				System.out.println("Internal Problem---> Values are larger than colum size");
			} else {
				System.out.println("Internal problem");

			}

		} // catch

		System.out.println("RealtimeDITest:: end of main()");
	}// main

}// class
