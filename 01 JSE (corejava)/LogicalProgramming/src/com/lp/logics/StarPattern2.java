package com.lp.logics;

public class StarPattern2 {

	public static void main(String[] args) {
		int i=0,j=0;
		for(i=10;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}