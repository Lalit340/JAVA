package com.lp.logics;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class GreatestComonDivTest {

	public static void main(String[] args) {
		int a=0,b=0,n=0;
		int hcf=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two numbers ::");
		a=sc.nextInt();
		b=sc.nextInt();
		
		n=Math.min(a, b);
		
		for(int i=2;i<=n;i++) {
			while(a%i==0 && b%i==0) {
				hcf=hcf*i;
				a=a/i;
				b=b/i;
			}
			
		}
   System.out.println("GCD of two no. is "+hcf);

	}

}
