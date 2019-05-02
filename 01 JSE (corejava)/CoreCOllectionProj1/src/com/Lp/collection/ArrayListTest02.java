package com.Lp.collection;

import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
		
		ArrayList <Object> al=new ArrayList<>();
		
		System.out.println(al.size());
		System.out.println(al);
        
		al.add("a");
        al.add('c');
        al.add(new Sample(15,5));
        al.add(5);
        al.add(new StringBuffer("Hi"));
        al.add(new Sample(1,5));
        al.add(new Sample(8,7));
        
        System.out.println(al.size());
		System.out.println(al);
		
		System.out.println(al.contains(5));
		System.out.println(al.contains(new Sample(15,5)));
		System.out.println(al.contains(new StringBuffer("Hi")));
		System.out.println();
		System.out.println(al.size());
		System.out.println(al);
		System.out.println();
		
		System.out.println(al.remove(new Sample(1,5)));
		System.out.println(al.remove(new Integer(5)));
		System.out.println(al.remove(new StringBuffer("Hi")));
		
		System.out.println();
		System.out.println(al.size());
		System.out.println(al);
	}

}
