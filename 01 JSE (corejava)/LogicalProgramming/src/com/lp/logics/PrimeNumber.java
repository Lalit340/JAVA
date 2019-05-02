package com.lp.logics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int a, i, b = 0;
		Scanner sc = null;
		// create scanner obj.
		sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		a = sc.nextInt();
		if (a >=2) {

			for (i = 2; i < a; i++) {
				if (a % i == 0)
					b = b + 1;

			} // for
			if(b==0) 
				System.out.println(a + " is  a prime num.");
			else
			System.out.println(a + " is not a prime num.");

		} else 
			System.out.println(a + " is not a prime num.");
	}// main

}// class