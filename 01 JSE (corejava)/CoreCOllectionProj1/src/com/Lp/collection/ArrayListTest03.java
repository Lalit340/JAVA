package com.Lp.collection;

import java.util.ArrayList;

public class ArrayListTest03 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();

		System.out.println(al.size());
		System.out.println(al);

		al.add(new Employee(102, "hari", "clerk", 5000));
		al.add(new Employee(103, "Ram", "dao", 10000));
		al.add(new Employee(101, "suresh", "manager", 7000));

		System.out.println();
		System.out.println(al.size());
		System.out.println(al);
		System.out.println();
		
		System.out.println(al.contains(new Employee(101, "suresh", "manager", 7000)));
		
		System.out.println();
		System.out.println(al.size());
        System.out.println(al);
            
        System.out.println(al.remove(new Employee(103, "Ram", "dao", 10000) ));

    	System.out.println();
		System.out.println(al.size());
        System.out.println(al);
	}

}
