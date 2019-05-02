package com.Lp.collection;

import java.util.LinkedList;

public class LinkedListTest01 {
	
          public static void main(String[] args) {
	              LinkedList <Object> ll=new LinkedList<>();
	           
	              System.out.println(ll.size());
	              System.out.println();
	              ll.add("a");
	               ll.add("c");
	               ll.add(10);
	     //         ll.addAll(null);
	               ll.add("b");
	               ll.add('d');
	               ll.add(true);
	               ll.add(new Student());
	               ll.add('v');
	               ll.add(10.0);
	               ll.add(20.0f);
	               ll.add(15);
	               ll.add(new Student());
                   ll.addFirst("b");
	               ll.add(10);
	               
	    //      System.out.println("capacity::"+al.capacity());
	               System.out.println(ll.size());
	               System.out.println(ll);
                
	               for(Object o : ll) {
	            	   if(o instanceof String) {
	            		   System.out.println(((String)o).toUpperCase());
	            	   } 
	            	   else if(o instanceof Integer) {
	            		   System.out.println(((Integer)o)+20);
	            	   }
	            		   
	               }
}
}
