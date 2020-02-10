package com.slk.task5.CollectionFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapExample_10 {

	
	public static void allMethod()
	{
		LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1,  "A");
		linkedHashMap.put(2,  "B");
		linkedHashMap.put(3,  "C");
		linkedHashMap.put(4,  "D"); 
		 
		linkedHashMap.forEach((key, value) -> {
		    System.out.println("Key:"+ key + ", Value:" + value);
		});
		
		
		System.out.println("====================containsValue()==============");
		System.out.println("Check value : " + linkedHashMap.containsValue("B") );
		System.out.println("Check value : " + linkedHashMap.containsValue("b") );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMapExample_10.allMethod();
	}

}
