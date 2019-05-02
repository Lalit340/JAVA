package com.lp.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lp.beans.VoterEligibility;

public class TestBeanLifeCycle {
    private static ApplicationContext cxt;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cxt=new ClassPathXmlApplicationContext("com/lp/cfgs/applicationContext.xml");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		((AbstractApplicationContext) cxt).close();
	}

	@Test
	public void testWithInvalidAge() {
		VoterEligibility voter=null;
		String actualResult=null,expectedResult=null;
		voter=cxt.getBean("voter",VoterEligibility.class);
		actualResult=voter.checkingVoterEligible();
		expectedResult="Mr./Miss Raja u r not eligible for voting";
		System.out.println(expectedResult+"   "+actualResult);
		assertTrue("test1",actualResult.contains(expectedResult));
	}
	@Test
	public void testWithValidAge() {
		VoterEligibility  voter=null;
		String actualResult=null,expectedResult=null;
		voter=cxt.getBean("voter1",VoterEligibility .class);
		actualResult=voter.checkingVoterEligible();
		expectedResult="Mr./Miss Raja u r eligible for voting";
		assertTrue("test2",actualResult.contains(expectedResult));
	}
	
	@Test(expected=Exception.class)
	public void testWithNegetiveAge() {
		VoterEligibility  voter=null;
		String actualResult=null,expectedResult=null;
		voter=cxt.getBean("voter2",VoterEligibility .class);
		actualResult=voter.checkingVoterEligible();
		fail("Exception is expected here ,but not raised");
	}
	
	@Test(expected=Exception.class)
	public void testWithNoName() {
		VoterEligibility voter=null;
		String actualResult=null,expectedResult=null;
		voter=cxt.getBean("voter3",VoterEligibility.class);
		actualResult=voter.checkingVoterEligible();
		fail("Exception is expected here ,but not raised");
	}
}
