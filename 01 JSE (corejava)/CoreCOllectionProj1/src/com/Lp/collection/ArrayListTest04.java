package com.Lp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest04 {

	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<>();
		 al.add("a");
		 al.add("b");
		 al.add("d");
		 al.add("a");
		 System.out.println(al);
		 System.out.println();
		 List<String> syncList=Collections.synchronizedList(al);
		 System.out.println(syncList);
		 syncList.add("c");
		 System.out.println();
		 System.out.println(al);
		 System.out.println(syncList);
		 //sorting collections
		 Collections.sort(al);
		 System.out.println();
		 System.out.println(al);
		 System.out.println(syncList);
	}

}
