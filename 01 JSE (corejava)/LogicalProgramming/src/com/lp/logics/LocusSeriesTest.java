package com.lp.logics;

public class LocusSeriesTest {

	public static void main(String[] args) {
		int a=1,b=1,c=1;
		int d,i;
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		for(i=3;i<=10;i++) {
			d=a+b+c;
			System.out.println(d);
			a=b;
			b=c;
			c=d;
		}
	}

}
