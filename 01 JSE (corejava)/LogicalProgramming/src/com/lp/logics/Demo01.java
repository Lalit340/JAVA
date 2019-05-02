package com.lp.logics;

public class Demo01 {
	
	static void m1() {
		System.out.println("static method()");
		
	}
	public void m2() {
		System.out.println("non-static method()");
		
	}

	public static void main(String[] args) {
		System.out.println("Demo01.main()");

		  m1();
	}

}
