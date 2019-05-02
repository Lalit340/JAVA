package com.lp.Exceptions;

public class Calculater {

	public static void main(String[] args) {
           try {
        	   int res=Addition.add(10, 20 );
        	   System.out.println("Result is ::"+res);
           }
           catch(IllegalArgumentException ild) {
        	   System.out.println("Error rise ::"+ild.getMessage());
           }

	}

}
