package com.lp.test;

import java.util.Scanner;

public class UserNameTest {

	public static void main(String[] args) {
		String username=null;
		Scanner sc=null;
		//create scanner object
		sc=new Scanner(System.in);
		//read input from keyword
		System.out.println("Enter Valied UserName  ::");
		username=sc.nextLine();
		//using trim() method we avoid to give space values
		username= username.trim();
		//if condition for given uysername right or wrong
		if(username.isEmpty() ) {
			System.out.println(" UserName should not Allow to empty");
		}else {
			System.out.println("Wel-Come to Nearesh IT");
		}

	}

}
