package com.Lp.collection;

import java.util.Vector;

public class Test01VectorDemo {

	public static void main(String[] args) {
		
		Vector<Object> v=new Vector<>();
		System.out.println("capacity::"+v.capacity());
		System.out.println("size::"+v.size());
		System.out.println("elements::"+v);
		
		v.add("a");
		v.add(20.0);
		v.add(true);
		v.add(false);
		v.add(null);
		v.add(100);
		v.add("hello");
		v.add(10);
		v.add('a');
		v.add(null);
		System.out.println("capacity::"+v.capacity());
		System.out.println("size::"+v.size());
		System.out.println("elements::"+v);
		v.add(200);
		System.out.println("capacity::"+v.capacity());
		System.out.println("size::"+v.size());
		System.out.println("elements::"+v);
	}

}
