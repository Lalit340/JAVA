package com.lp.logics;

public class StarPattern4 {

	public static void main(String[] args) {
		int i=0,j=0,k=0;
		for(i=1;i<=10;i++) {
			for(j=9;j>=i;j--) {
				System.out.print("_");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
