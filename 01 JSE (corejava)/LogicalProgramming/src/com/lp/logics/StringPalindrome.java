package com.lp.logics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String s=null,revStr=null;
		char[] ch;
		Object o;
		int i=0;
		Scanner sc=null;
		//create scanner object
		sc=new Scanner(System.in);
        System.out.println("Enter a string ::");
        s=sc.nextLine();
        //trim string object
        s=s.trim();
        
        ch=s.toCharArray();
        
        for(i=ch.length;i>=0;i--) {
        	o=ch[i];
        	revStr=revStr+Arrays.toString(o);
        }
        
        if(s.equals(revStr))
        System.out.println(s+" is palindrome string "+revStr);
        else
        	System.out.println(s+" not a p[alindrome");
	}

}