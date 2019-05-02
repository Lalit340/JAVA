package com.lp.logics;

public class StringtoCharArrayTest {

	public static void main(String[] args) {
		String s1="Hello";
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			if(s1.length()%2==0)
				System.out.println(ch[i]);
			else
				System.out.println(ch[i]);
			
		}

	}

}
