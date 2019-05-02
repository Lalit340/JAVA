package com.lp.logics;

import java.util.Random;
import java.util.Scanner;

public class HarmonicFactTest {

	public static void main(String[] args) {
		int n=0;
		double result=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no ::");
		n=sc.nextInt();
		 Random rd=new Random(10);
		 System.out.println(rd);

		while(n>0) {
			result=result+(double)1/n;
			n--;
			System.out.println(result);
		}
	}

}
