package com.lp.stringtest;

public class StringWordsReverse {

	public static String reverseStringWords(String s) {
		int i ;
		String  results = null;
		// reverse the sring obj.
		 String stringWords[] = s.split(" ");

		results = "";
         System.out.println(stringWords.length);
		// Executing for loop for reversing the words
		for (i = stringWords.length - 1; i >= 0; i--) {
			results = results + stringWords[i] + " ";
		}

		return results;
	}

}
