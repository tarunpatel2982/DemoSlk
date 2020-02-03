package com.slk.task15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetGenericClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(Integer.valueOf(10));
		
		set.add(Integer.valueOf(11));
		
		
		for (Integer integer : set) {
			System.out.printf("Integer Value :  %d\n", integer);
		}

		
		
		Set<String> setStrings = new HashSet<String>();
		
		
		setStrings.add("Tarun " );
		setStrings.add("hello");
		
		
		Iterator<String> iterator = setStrings.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
			System.out.println("Iterator Value : " + string);
			
		}
	}

}
