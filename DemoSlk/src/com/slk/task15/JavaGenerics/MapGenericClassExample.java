package com.slk.task15.JavaGenerics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapGenericClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(1,"vijay");  
		map.put(4,"umesh");  
		map.put(2,"ankit");
		
		  
		//Now use Map.Entry for Set and Iterator  
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		
		
		Iterator<Map.Entry<Integer, String>> itr =set.iterator(); 
		while(itr.hasNext()){  
		Map.Entry e=itr.next();//no need to typecast  
		System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println("----------------------------------------------------------------");
		Iterator<Integer> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
			
			System.out.println("Key of iterator : " + integer);
			
		}
		
		
		System.out.println("----------------------------------------------------------------");
		Iterator<String> sIterator = map.values().iterator();
		while (sIterator.hasNext()) {
			
			
			
			System.out.println("Value of iterator : " +sIterator.next());
			
		}
	}

}
