package com.Lp.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest06 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("d");
		al.add("a");
		al.add("a");
		al.add(new Employee(101, "hari", "clerk", 5000));
		al.add(new Employee(101, "Ram", "dao", 10000));

		System.out.println(al);
		System.out.println();
		removeDuplicates(al);
		long time = System.nanoTime();
		System.out.println(time);
		System.out.println(al);

	}

	static void removeDuplicates(List<Object> list) {
		// approach-1::with LinkedhashSet objects
		
		/*
		 * LinkedHashSet <Object> lhs=new LinkedHashSet<>(list); list.clear();
		 * list.addAll(lhs);
		 */
		

		// Approach -2:: for loop
		/*
		 * for(int i=0;i<list.size();i++) { Object obj1=list.get(i);
		 * 
		 * for(int j=i+1;j<list.size();j++) { Object obj2=list.get(j);
		 * 
		 * if(obj1.equals(obj2)) { list.remove(j); j--; } } }
		 */

		// Approach-3:: Iterator operation
		ListIterator<Object> li = list.listIterator();
		int i = 0;
		while (li.hasNext()) {
			Object obj1 = li.next();

			ListIterator<Object> li1 = list.listIterator(++i);
			while (li1.hasNext()) {
                System.out.println(list);
				Object obj2 = li1.next();
                System.out.println(obj1+"   "+obj2);
				if (obj1.equals(obj2)) {
					li1.remove();

				}
			}
			li=list.listIterator(i);
		}
	}

}
