package com.lp.logics;

import java.util.Scanner;

public class PrintingStarTypeTest {
	
	public static void printStar(int no) {
		
		int i,j;
		// for printing star type first loop for Printing size
		for(i=0;i<=no;i++) {
			
			// second loop for printing values
			for(j=0;j<no-i;j++) {
				//print values
				System.out.print("");
			}
			//for ending line 
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ::");
		int n=sc.nextInt();
       printStar(n);
	}

}
