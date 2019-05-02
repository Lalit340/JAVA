package com.lp.stringtest;

public class StringBufferTest {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("hi");
		System.out.println(sb1);

		StringBuffer sb2 = sb1.append(" HLO");
		sb2.append(" WRU");
		System.out.println(sb2);
		System.out.println(sb1==sb2);

		sb1.append(" HRU");
		System.out.println(sb1);

	}
}
