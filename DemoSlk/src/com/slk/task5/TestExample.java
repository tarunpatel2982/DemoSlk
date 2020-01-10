package com.slk.task5;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestExample {

	public static HashMap<Integer, String> sortByvalue(HashMap<Integer, String> hashmap) 
	{
		
		List<Map.Entry<Integer, String>>  list = new LinkedList<Map.Entry<Integer,String>>(hashmap.entrySet());
		
		Collections.sort(list ,new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> o1 , Map.Entry<Integer, String> o2)
			{
				
				return (o1.getValue()).compareTo( o2.getValue());
			}
		});
		
		HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>();
		for(Map.Entry<Integer, String> aa:list)
		{
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
	public static HashMap<Integer, String> sortByKey(HashMap<Integer, String> hashmap) 
	{
		
		List<Map.Entry<Integer, String>>  list = new LinkedList<Map.Entry<Integer,String>>(hashmap.entrySet());
		
		Collections.sort(list ,new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> o1 , Map.Entry<Integer, String> o2)
			{
				
				return (o1.getKey()).compareTo( o2.getKey());
			}
		});
		
		HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>();
		for(Map.Entry<Integer, String> aa:list)
		{
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
	public static void putValueUsingForLoop() {
		System.out.println("\n");
		System.out.println(
				"============================Run Time put Value Using For Loop=======================================================");
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(3, "jiten");
		hashMap.put(4, "mahek");

		System.out.println(hashMap);
		Iterator<Integer> it = hashMap.keySet().iterator();
		for (int i = 0; i < hashMap.size(); i++) {
			hashMap.put(2, "tarun");
			hashMap.put(1, "a");
		}
		System.out.println(hashMap);
	}

	public static void main(String[] args) {
	//TestExample.putValueUsingForLoop();
		
		
		
		HashMap<Integer, String>map2 =new  HashMap<Integer, String>();
		map2.put(74 ,"Math"); 
		map2.put(85 ,"Math");
		map2.put(15 ,"Structure");
		
		map2.put(10 ,"Database");
		map2.put(7 ,"Java");
	
		Map<Integer, String>	map12 =sortByvalue(map2);
		Map<Integer, String>	map3 =sortByKey(map2);
		//System.out.println(map2);
		System.out.println("===============================================================================");
		
		//System.out.println(map12);
		for (Map.Entry<Integer, String> my : map12.entrySet())
			
		{
			System.out.println("Key 1 " + "   " + my.getKey() +  "   value1 " +  my.getValue());
		}
		System.out.println("=========================================================================================");
		for (Map.Entry<Integer, String> my : map3.entrySet())
	
		{
			System.out.println("Key  " + "   " + my.getKey() +  "   value " +  my.getValue());
		}

}
}
