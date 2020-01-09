package com.slk.task5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	
	public static void hashMapPut() {
		System.out.println("===========================================================================");
		
		HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1,  "A");
        map.put(2,  "B");
        map.put(3,  "C");
         
        System.out.println("Origenal hashMap :"+map);
        
       // String getValue= map.get(2);
        System.out.println("The value is : "+ map.get(2));
        
        
        System.out.println("Remove HashMap Pair by key value : " + map.remove(3));
        System.out.println("Updated HashMap "+map);
    	System.out.println("===========================================================================");
    	
	}
	
	public static void IteratorUsed()
	{
		System.out.println("===========================================================================");
		HashMap<Integer, String> map = new HashMap<>();
		 
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		 
		System.out.println("//Iterate over keys");
		
		Iterator<Integer> iterator = map.keySet().iterator();
		
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			String value = map.get(integer);
			System.out.println("Iterator Key " + integer + "   Iterator value : " + value);
			
		}
		
		System.out.println("//Iterator key Pair ");
		
		Iterator<Entry<Integer, String> > iterator2 = map.entrySet().iterator();
		while (iterator2.hasNext()) {
			
			Entry<Integer, String> entry =  iterator2.next();
			
			System.out.println("Iterator key  : " + entry.getKey() + " Iterator Value  "+ entry.getValue());
		}
		
		
		
		
	}
	public static void collectionAllMEthodExample()
	{
		System.out.println("===========================================================================");
		HashMap<Integer, String> map = new HashMap<>();
		 
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		 
		Set<Integer> integers = map.keySet();
		
//		int a = map.get(1).hashCode();
//		System.out.println( "aaaaaaaaa  " + a );
		Collection<String> collection= map.values();
		
		System.out.println("key "+integers);
		System.out.println("Value : "+ collection);
		
		
		System.out.println("===============Clone()===========================");
		
		HashMap<Integer, String> map2 = (HashMap<Integer, String>)map.clone();
		System.out.println("Clone object  : " + map2);
	
		System.out.println("===================Size()================================");
		
		System.out.println("Map2 Size : " + map2.size());
		
		System.out.println("===================Clear()================================");
		
		map2.clear();
		System.out.println("Map 2 clear: " +  map2);
		
		
		System.out.println("===================putAll()================================");
		
		map2.putAll(map);
		System.out.println("Allj value Inserted in map2 : " +  map2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapExample.hashMapPut();
		HashMapExample.IteratorUsed();
		HashMapExample.collectionAllMEthodExample();
	}

}
