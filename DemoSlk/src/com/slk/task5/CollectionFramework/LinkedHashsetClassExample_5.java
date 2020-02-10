package com.slk.task5.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashsetClassExample_5 {

	public static void allMethod()
	{
		System.out.println("------------------------------------LinkedHashsetClassExample-----------------------------------------");
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add(null);
		linkedHashSet.add("j");
		linkedHashSet.add("C");
		linkedHashSet.add("D");
		linkedHashSet.add("E");
		linkedHashSet.add("F");
		linkedHashSet.add("F");
		linkedHashSet.add("E");
		linkedHashSet.add("F");
		linkedHashSet.add("F");
		linkedHashSet.add("E");
		linkedHashSet.add("A");
		linkedHashSet.add("F");
		//linkedHashSet.add(null);
		System.out.println("-----------Size-------------------------");
		
		//System.out.println(linkedHashSet.equals("C"));
		System.out.println(linkedHashSet);
		System.out.println("Linked Hashset Size   : " + linkedHashSet.size());
		
		
		Iterator<String> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println("Iterator value : " +  string);
		}
	
		System.out.println("value  :   " + linkedHashSet);
		
		System.out.println("Remove Element of : " + linkedHashSet.remove("F"));
		
		System.out.println("Remove Element of  : " + linkedHashSet.remove("l"));
		
		System.out.println("Check Element of avilabel :  " + linkedHashSet.contains("A"));
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Remove  all element :  " + linkedHashSet.removeAll(linkedHashSet));
		
		System.out.println(linkedHashSet.hashCode());
		System.out.println(linkedHashSet);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashsetClassExample_5.allMethod();
	}

}
