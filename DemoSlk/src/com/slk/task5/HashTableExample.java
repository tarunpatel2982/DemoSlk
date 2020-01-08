package com.slk.task5;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	public static void hashTableExample()
	{
		System.out.println("---------------------------------------------------");
		
		
		Hashtable hashtable = new Hashtable();
		
		hashtable.put("1","One");
		hashtable.put("2","Two");
		hashtable.put("3","Three");
		 
		Enumeration e =hashtable.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
//		System.out.println(hashtable);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableExample.hashTableExample();
	}

}
