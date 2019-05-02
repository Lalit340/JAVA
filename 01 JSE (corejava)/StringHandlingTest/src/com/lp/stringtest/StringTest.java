package com.lp.stringtest;

public class StringTest {
	public static void main(String[] args) {
		String s1="hi";
		s1.concat(" HLW");
		System.out.println(s1);
		
		String  s2="hlo";
		 s2=s2.concat(" HRU");
		System.out.println(s2);
		
		
		String  s3=s1.concat(s2);
		System.out.println(s3);
			
	}

}
