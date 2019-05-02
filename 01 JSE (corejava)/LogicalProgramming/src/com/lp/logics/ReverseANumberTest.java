package com.lp.logics;

import java.util.Scanner;

public class ReverseANumberTest {

	public static void main(String[] args) {
		int no,revNo=0,i,a,b;
		Scanner sc=null;
		//create Scanner object
		sc=new Scanner(System.in);
		//read the input value from keyword
		System.out.println("Enter a Integer Number ::");
		no=sc.nextInt();
		b=no;
		 //for loop
		for(i=0;i<=no;i++) {
			a=no%10;
			revNo=revNo*10+a;
			no=no/10;
		}
       
		System.out.println("Original No.::"+b);
		System.out.println("Reversed No.::"+revNo);
	}

}
