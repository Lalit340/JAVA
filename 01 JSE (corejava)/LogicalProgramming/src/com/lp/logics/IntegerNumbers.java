package com.lp.logics;

import java.util.Scanner;

public class IntegerNumbers {

	public static void main(String[] args) {
		int n=0;
		String octal=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ::");
		n=sc.nextInt();
		
		octal=Integer.toBinaryString(n);
		
		System.out.println(octal);
		

	}

}