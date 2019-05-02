package com.Lp.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest01 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();

		System.out.println(al.size());
		System.out.println();
		al.add("a");
		al.add("c");
		al.add(10);
		// al.addAll(null);
		al.add("a");
		al.add('d');
		al.add(true);
		al.add(new Student());
		al.add('v');
		al.add(10.0);

		// System.out.println("capacity::"+al.capacity());
		System.out.println(al.size());
//		System.out.println(al);

		ListIterator it = al.listIterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
			if (obj instanceof String) {
				System.out.println(((String) obj).toUpperCase());
			} else if (obj instanceof Integer) {
				System.out.println(((Integer)obj) + 20);
			}

		}
             //      System.out.println(al);
	}
}
