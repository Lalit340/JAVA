package com.lp.logics;

import java.util.Scanner;

public class OperatorsTest {

	public static void main(String[] args) {
		double val1, val2;
		String op = null;
		Scanner sc = null;
		// create scanner object
		sc = new Scanner(System.in);
		// read out value
		System.out.println("Enter an Operator ::");
		op = sc.nextLine();
		if (op.equals("+") || op.equals("-")|| op.equals("*")||op.equals("/")||op.equals("%")) {
		System.out.println("Enter two numbers::");
		val1 = sc.nextDouble();
		val2 = sc.nextDouble();
		
			switch (op) {
			case "+":
				System.out.println("Sum of two nos ::" + (val1 + val2));
				break;
			case "-":
				System.out.println("Sub of two nos ::" + (val1 - val2));
				break;
			case "*":
				System.out.println("Mul of two nos ::" +(val1*val2));
				break;
			case "/":
				System.out.println("Div of two nos ::" +(val1/val2));
				break;
			case "%":
				System.out.println("Mod of two nos ::" +(val1%val2));
				
			}

		} else
			System.out.println("Invalid Operator");

	}

}
