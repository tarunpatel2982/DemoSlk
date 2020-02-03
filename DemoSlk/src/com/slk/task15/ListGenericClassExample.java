package com.slk.task15;

import java.util.ArrayList;
import java.util.Iterator;

public class ListGenericClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Tarun");
		arrayList.add("hello ");
		arrayList.add("my");
		
		//arrayList.add(41);
		
		String s = arrayList.get(1);//type casting is not required  
		
		System.out.println("Index 1 Value  : " + s);
		
		Iterator<String> iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
			System.out.println("ArrayList Value : " + string);
		}
	}

}
