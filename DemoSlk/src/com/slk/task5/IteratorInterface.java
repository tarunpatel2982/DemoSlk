package com.slk.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorInterface {
	
	
	
	
	
	
	public static void IteratorInterfaceAllMethod()
	{
		ArrayList<String> list = new ArrayList<>();
        
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		 
		Iterator<String> iterator = list.iterator();
		 
		while(iterator.hasNext()) {
		    System.out.println( iterator.next() );
		    String value=iterator.next();
		    if(value.equals("B"))
		    		{
		    			iterator.remove();
		    		}
		    
		}
		System.out.println(list);
		
	}
	
	public static void  hashSetIterateExample()
	{
		System.out.println("hashSetIterateExample() ===>>>");
		HashSet<String>  hashSet = new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		System.out.println(hashSet);
		
		Iterator<String> iterator= hashSet.iterator();
		while (iterator.hasNext())
		{
			String st =  iterator.next();
			System.out.println(st);
			
			if(st.equals("B"))
			{
				iterator.remove();
			}
			
		}
		
		System.out.println(hashSet);
	}
	public static void hashMapKeysIteratorExample()
	{
		System.out.println("====>>>> hashMapKeysIteratorExample");
		HashMap<Integer, String> map= new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		System.out.println(map);
		Iterator<String> iterator = map.values().iterator();
		
		while (iterator.hasNext()) {
			//String string = (String) iterator.next();
			System.out.println(iterator.next());
		}

//		Iterator<String> iterator= map.containsKey(key).iterator();
	}
	public static void forEachRemaniningExample()
	{
		System.out.println("===>>> forEachRemaniningExample");
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("tar");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		
		arrayList.iterator().forEachRemaining(System.out::println);
	}
	
	public static void IteratorAllMethod()
	{
		System.out.println("===> hashMap Iterator ");
		HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
		hashMap.put(1, "A");
		hashMap.put(2, "b");
		hashMap.put(3, "c");
		hashMap.put(4, "d");
		System.out.println(hashMap);
		
		Iterator<Integer> iterator= hashMap.keySet().iterator(); 
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
			System.out.println("key "+ integer + " value " + hashMap.get(integer));
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IteratorInterface.IteratorInterfaceAllMethod();
		IteratorInterface.hashSetIterateExample();
		IteratorInterface.hashMapKeysIteratorExample();
		IteratorInterface.forEachRemaniningExample();
	}

}
