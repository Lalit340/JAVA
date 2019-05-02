package com.Lp.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetCollectionAddTest01 {

	public static void main(String[] args) {
		HashSet <Object> hs=new HashSet<>();
		
		hs.add("a");
		hs.add("c");
		hs.add(5);
		hs.add("a");
		hs.add("b");
		hs.add(null);
		hs.add('c');
		hs.add(10);
		System.out.println(hs);
		System.out.println(hs.contains("a"));
		System.out.println(hs.remove("b"));
		System.out.println();
		System.out.println(hs);
		
		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		
		lhs.add("a");
		lhs.add("c");
		lhs.add(5);
		lhs.add("a");
		lhs.add("b");
		lhs.add(null);
		lhs.add('c');
		lhs.add(10);
		
		lhs.add(true);
		lhs.add(new Sample(5,6));
		lhs.add(new Sample(5,6));
		lhs.add(new Sample(7,8));
		System.out.println();
		System.out.println(lhs);
		System.out.println(lhs.contains("a"));
		System.out.println();
		System.out.println(lhs);
		
		lhs.remove("a");
		System.out.println();
		System.out.println(lhs);
	}

}
