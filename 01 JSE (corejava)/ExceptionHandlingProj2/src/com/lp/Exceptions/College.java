package com.lp.Exceptions;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		try {
			Student s1=new Student();
			System.out.println("Entered 1st student marks::");
			System.out.println("Enter FLO mark::" );
			s1.setFlo(scn.nextInt());
			System.out.println("Enter SLE mark::" );
			s1.setSle(scn.nextInt());
			System.out.println("Enter TLH mark::" );
			s1.setTlh(scn.nextInt());
			System.out.println("Enter Math mark::" );
			s1.setMath(scn.nextInt());
			System.out.println("Enter Science mark::" );
			s1.setScience(scn.nextInt());
			System.out.println("Enter Social mark::" );
			s1.setSocialSc(scn.nextInt());
			
			System.out.println("1st student marks::" );
			System.out.println("FLO mark::"+s1.getFlo() );
			System.out.println("SLE mark::"+s1.getSle() );
			System.out.println("TLH mark::"+s1.getTlh());
			System.out.println("math mark::"+s1.getMath() );
			System.out.println("Science mark::" +s1.getScience());
			System.out.println(" Social mark::"+s1.getSocialSc() );
	    	}
		catch(IllegalArgumentException el){
			System.out.println("Exception rise in ::"+el.getMessage());
		}
	}//main
}//class
