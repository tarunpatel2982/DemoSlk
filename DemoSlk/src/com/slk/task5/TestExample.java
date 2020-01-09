package com.slk.task5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class TestExample  {

	public static void maintainOrderdHashMap()
	{
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(4, "Two");
		hashMap.put(4, "One");
		hashMap.put(4, "Four");
		hashMap.put(4, "Four");
		hashMap.put(3, "Three");
		hashMap.put(4, "vbv");
		hashMap.put(1, "vc");
		System.out.println("==================Insertion Orderd ===================");
		
//			Iterator<Integer> iterator = hashMap.keySet().iterator();
//			
//			while (iterator.hasNext()) {
//				Integer integer = (Integer) iterator.next();
//				String val = hashMap.get(integer);
//				System.out.println("Key   :  " +integer + "  value : " + val);
//				
//			}
		
		System.out.println(hashMap);
	}
	
	public static void addValueUsingForLoop()
	{
		System.out.println("\n");
		System.out.println("============================Run Time add Value Using For Loop=======================================================");
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(3, "jiten");
		hashMap.put(4, "mahek");
		
		System.out.println(hashMap);
		Iterator<Integer> it = hashMap.keySet().iterator();
		for(int  i=0; i<hashMap.size();i++)
		{
			hashMap.put(2, "tarun");
			hashMap.put(1, "a");
		}
		System.out.println(hashMap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExample.maintainOrderdHashMap();
		//TestExample.addValueUsingForLoop();
	}
	
	
	

}
