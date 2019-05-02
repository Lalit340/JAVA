package com.lp.logics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n, m, q, a = 0;
		Scanner sc =null;
		//create scanner obj.
		sc=new Scanner(System.in);
		System.out.println("Enter a no. ::");
		n = sc.nextInt();

		m = n;

		while (n > 0) {
			q = n % 10;
			a = a * 10 + q;
			n = n / 10;
		}

		if (a == m) {
			System.out.println(m + " this num is palindrome");
		} else {
			System.out.println(m + " this num is not a palindrome");
		}
	}

}
