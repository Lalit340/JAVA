package com.lp.test;

import java.util.Scanner;

public class PassWordTest {

	public static void main(String[] args) {
		String pwd=null;
		char ch[];
		Scanner sc=null;
		//create Scanner object
		sc=new Scanner(System.in);
		//reading input from keyword
		System.out.println("Enter a Valied password with in 8-16 digit & contains one special char,uppercase latter & one number ::");
		pwd=sc.nextLine();
		//trim() method for not allow space in first or last
		pwd=pwd.trim();
		//convert to char array
		//ch=pwd.toCharArray();
		//If Condition
		if(pwd.length()<8 || pwd.length()>16) {
			System.out.println("Password Should be  8-16 digits");
		}
		else {
			System.out.println("Hi");
		}//If
		
	}//Main
}//Class
