package com.slk.task5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClassExample_4 {
	
	
	public static void hashSetMethod()
	{
		System.out.println("It Is used Macanisam for hasing ");
		System.out.println("------------------------------------------------");
		
		HashSet<String> hashSet = new HashSet<String>();
		//hashSet.add(null);
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Two");
		hashSet.add("Threee");
		hashSet.add("Twoe");
		hashSet.add(null);
		hashSet.add("Threev");
		System.out.println("hascode = "+hashSet.hashCode());
		//System.out.println(hashSet.);
		System.out.println(hashSet);
		
		//System.out.println("---------check if element exist");
		
		boolean  found = hashSet.contains("B");
		System.out.println("Check Element : " + found);

		
		
		System.out.println("-----Remove Element : " + hashSet.remove("E"));
		
		
		Iterator<String> iterator= hashSet.iterator();
		
		System.out.println("-------------------------------------------------");
		System.out.println("Iterator Value");
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println("value " + string);
			
		}
		
		System.out.println("------------------------------------------");
		System.out.println("isEmpth() method  : check hashset in value : " + hashSet.isEmpty());
	

		System.out.println("---------------------------------vbn---------");
		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2 = (HashSet)hashSet.clone();
		System.out.println("Clone() method   : " + hashSet2);
		

		System.out.println("------------------------------------------");
		System.out.println("Check Hashset Size  : " + hashSet.size());
		 
		System.out.println("------------------------------------------");
		hashSet.clear();
		System.out.println("Clear() method call  : " + hashSet );
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetClassExample_4.hashSetMethod();
	}

}
