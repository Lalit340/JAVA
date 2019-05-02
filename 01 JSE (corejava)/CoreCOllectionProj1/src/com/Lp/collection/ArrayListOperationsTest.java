package com.Lp.collection;

import java.util.ArrayList;

public class ArrayListOperationsTest {

	public static void main(String[] args) {
		ArrayList<Object> al1=new ArrayList<>();
           
		al1.add(5);
		al1.add("a");
		al1.add(7.4);
		al1.add('d');
		System.out.println(al1.size());
		System.out.println(al1);
		
		ArrayList<Object> al2=new ArrayList<>();
		
		al2.add("a");
		al2.add("b");
		al2.add('d');
     	al2.add(al1);
		al2.addAll(al1);
		al2.add(10);
		
		System.out.println();
		System.out.println(al2.size());
		System.out.println(al2);
		
    	System.out.println(al2.contains(al1));
		System.out.println(al2.containsAll(al1));
		System.out.println();
		System.out.println(al2.size());
		System.out.println(al2);
		System.out.println();
		System.out.println(al1.size());
		System.out.println(al1);
		
		 	System.out.println(al2.remove(al1));
			System.out.println(al2.removeAll(al1));
			System.out.println();
			System.out.println(al2.size());
			System.out.println(al2);
			System.out.println();
			System.out.println(al1.size());
			System.out.println(al1);
			
	/*//		al1.clear();
			System.out.println();
			System.out.println(al2.size());
			System.out.println(al2);
			System.out.println();
			System.out.println(al1.size());
			System.out.println(al1);*/
	}

}
