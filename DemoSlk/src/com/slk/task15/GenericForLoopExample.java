package com.slk.task15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(4, "tarun");

		map.put(10, "hey");
		
		

		System.out.println(".........................................................................");
		for(Integer aKey : map.keySet()) {
		    String aValue = map.get(aKey);
		    System.out.println("Key And value of map :  " + aKey + ":" + aValue);
		}
		
		

		System.out.println(".........................................................................");
		
		for(String aValue : map.values()) {
		    System.out.println("Only Value  of map   : "+ aValue);
			}
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("tarun");

		list.add("Hello");

		list.add("UV");
		System.out.println(".........................................................................");
		for(String aString : list) {
		    System.out.println(aString);
		}
	}
}
