package com.lp.logics;

public class StarPattern1stProg {

	public static void main(String[] args) {

		int i = 0, j = 0;
		for (i = 1; i <= 10; i++) {
			
			for (j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

}