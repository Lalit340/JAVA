package com.lp.logics;

public class FibonanceSeriesTest {

	public static void main(String[] args) {
		int a=0,b=1;
		int i,c;
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<=10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
