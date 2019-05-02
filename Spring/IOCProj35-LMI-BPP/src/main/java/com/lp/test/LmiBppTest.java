package com.lp.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.service.RegistrationService;

public class LmiBppTest {

	public static void main(String[] args) {
		ApplicationContext cxt=null;
		RegistrationService service=null;
		
		//create IOC container 
		cxt=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
		//get the bean class obj.
		service=cxt.getBean("regService" , RegistrationService.class);
		//invoke the implemented methods
		service.insertStudentBo(101,"raja","java");
		System.out.println(".................................................");
		service.insertStudentBo(1012,"rani","UI dev");
		System.out.println("==================================");
		service.insertEmployeeBo(456,"rakesh","programmer");
		System.out.println(".................................................");
		service.insertEmployeeBo(457,"raja","tester");
		System.out.println(".................................................");

		

	}

}
