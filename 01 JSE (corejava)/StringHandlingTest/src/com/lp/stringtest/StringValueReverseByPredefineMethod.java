package com.lp.stringtest;

import java.util.Scanner;

public class StringValueReverseByPredefineMethod {

	public static void main(String[] args) {
	    String str=null,result=null;  
		Scanner sc=null;
	    //create the scanner object
		sc=new Scanner(System.in);
        System.out.println("Enter a string value::");
        str=sc.nextLine();
        System.out.println(str);
        //invoking the static method of StringWords  class
        result=StringWordsReverse.reverseStringWords(str);
        //printing the values
        System.out.println("Originally passed value  ::"+str);
        System.out.println("REverse string value ::"+result);
	}

}
