package com.Lp.collection;

import java.util.ArrayList;

public class ArrayListTest05 {
      
	  static ArrayList<Object> al=new ArrayList<>();
	
	static void addIfUnique(Object obj) {
		if(!al.contains(obj)) {
			al.add(obj);
		}
	}
	public static void main(String[] args) {
		addIfUnique("a");
		addIfUnique(10);
		addIfUnique("b");
		addIfUnique("a");
		addIfUnique(10);
		addIfUnique('c');
		addIfUnique('c');
		System.out.println(al);

	}

}
