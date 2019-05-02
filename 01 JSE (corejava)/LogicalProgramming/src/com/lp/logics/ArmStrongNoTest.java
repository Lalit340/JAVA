package com.lp.logics;

import java.util.Scanner; 

public class ArmStrongNoTest {

	public static void main(String[] args) {
		// fields
		long n, m, mul = 1, r, sum = 0;
		int c = 0, i;
		Scanner sc = null;
		// create scanner object
		sc = new Scanner(System.in);
		// read input values
		System.out.println("Enter a number ::");
		n = sc.nextLong();
		m = n;
		// 1st while loop
		while (n != 0) {
			c++;
			n = n / 10;
		}
		System.out.println(c);
		// asign m value to n
		n = m;
		System.out.println(n);
		// 2nd while loop
		while (n != 0) {
			r = n % 10;
			mul = 1;
			// inner loop
			for (i = 1; i <= c; i++) {
				mul = mul * r;
				System.out.println(mul);

			}
			sum = sum + mul;
			n /= 10;
		} // while
			// if condition
		if (m == sum)
			System.out.println(m + " is a armstrong number" + sum);
		else
			System.out.println(m + " this is not an armstrong number" + sum);
	}// main

}// class
