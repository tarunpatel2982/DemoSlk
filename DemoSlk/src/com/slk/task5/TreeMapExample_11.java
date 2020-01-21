package com.slk.task5;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Tarun");
		treeMap.put(6, "jiten");
		treeMap.put(2, "ketan");
		
		;
		
		System.out.println("column  : " + treeMap.ceilingKey(6) + " : value : " +treeMap.get(6));
		System.out.println("column  : " + treeMap.ceilingKey(1) + " : value : " +treeMap.get(2));
		System.out.println("column  : " + treeMap.ceilingKey(2) + " : value : " +treeMap.get(1));
		
		
		Iterator<Integer> iterator = treeMap.keySet().iterator();
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println("key : " + integer + " Value  : " + treeMap.get(integer));
			
		}
		
		System.out.println("Remove Value Using Key : " + treeMap.remove(6));
		System.out.println( "Updated TreeMap : " + treeMap);
		
		
		System.out.println("Contains Value Method  : " + treeMap.containsValue("tarun"));
		
		System.out.println("ceilingKey Method  : " + treeMap.ceilingKey(1));
		
		System.out.println( "Updated TreeMap : " + treeMap);
		
	}

}
