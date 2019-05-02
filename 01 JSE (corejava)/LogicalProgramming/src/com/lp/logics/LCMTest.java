package com.lp.logics;

import java.util.Scanner;

public class LCMTest {

	public static void main(String[] args) {
		int a=0,b=0,gcf=1;
		double lcf=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no ::");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0)
				gcf=i;
		}
          lcf=(a*b)/gcf;
          System.out.println(" LCM of "+a+" and "+b+" is "+lcf);
	}

}
