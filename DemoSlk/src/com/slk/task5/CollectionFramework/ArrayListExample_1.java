package com.slk.task5.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample_1 {

	
	public static void arrayListAddRemove()
	{
		int i = 1;
		
		
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add("tarun");
		arrayList.add("lalu");
		arrayList.add("tarun");
		arrayList.add("jiten");
		arrayList.add("miten");
		arrayList.add("ritesh");
		arrayList.add("jaymin");
		arrayList.add(i);
		arrayList.add(true);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(1, "tarun");
		
		
		//arrayList Allow Duplicate value
		//Allow Null Value
		
		System.out.println( "===>>> Original List === >>");
		
		//Array List maintatain  Insertion Order
						
		for(Object str:arrayList)
		{
			System.out.println(str);
		}
		
		
		
		arrayList.remove("jiten");

		arrayList.remove("miten");
		System.out.println("=== >>>Remove for Array list ===>>");
		for(Object str:arrayList)
		{
			System.out.println(str);
		}
		
		arrayList.add(0, "UV");
		System.out.println("===>> Add New Object");
		for(Object str:arrayList)
		{
			System.out.println(str);
		}
		
		arrayList.remove(2);
		System.out.println("===>>> Remove index wise object");
		for(Object str:arrayList)
		{
			System.out.println(str);
		}
		
		
		arrayList.set(0, "Urvesh");
		System.out.println("===>>> Update Element using set method");
		for(Object str:arrayList)
		{
			System.out.println(str);
		}
		int pos = arrayList.indexOf("tarun");
		System.out.println("===>>> return index of the object");
		System.out.println(pos);
		
		Object st= arrayList.get(0);
		System.out.println("===>>> return object of the index");
		System.out.println(st);
		
		
		int numberofitems= arrayList.size();
		System.out.println("===>>> return	number of element of list");
		System.out.println(numberofitems);
		
		
		System.out.println(" === >contains() check object present or not");
		
		
		System.out.println(arrayList.contains("tarun"));
		System.out.println(arrayList.contains("UV"));
		
		
	}
	public static void sortData()
	{
		System.out.println("======================  Sorted data ===========================================");
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);
	    
	    
	    Collections.sort(myNumbers);
	    for(int i : myNumbers)
	    {
	    	System.out.println(i);
	    }
	    
	    
	    System.out.println("====>>> String sortd");
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    Collections.sort(cars);  // Sort cars
	    for (String i : cars) {
	      System.out.println(i);
	    }
	}
	
	public static void arrayListAddAllRemoveAll()
	{
		  System.out.println("====>>>Add  Alll ");
		  
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	   
	    ArrayList<String> cars2= new ArrayList<String>();
	    cars.add("Eco");
	    
	   cars.addAll(cars2);
	      System.out.println(cars);
	      
	      System.out.println("====>>> Remove Alll ");
	      ArrayList<String> alphabets = new ArrayList<String>();
	      alphabets.add("a");
	      alphabets.add("h");
	      alphabets.add("A");
	      alphabets.add("b");
	      alphabets.add("A");
	         
	        System.out.println(alphabets);
	         
	        alphabets.removeAll(Collections.singleton("A"));
	         
	        System.out.println(alphabets);
	        
	        
	        
	        System.out.println("=>>>> Reauin() method ");
	    
	        ArrayList<String> alphabets1 = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));
	         
	        System.out.println(alphabets1);
	         
	        alphabets1.retainAll(Collections.singleton("A"));
	         
	        System.out.println(alphabets1);
	}
	
	public static void convertToArray()
	{
		ArrayList<String> list = new ArrayList<>(2);
        
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        
         
        //Convert to object array
        Object[] array = list.toArray();
         
        System.out.println( Arrays.toString(array) );
 
        //Iterate and convert to desired type
        for(Object o : array) {
            String s = (String) o;
             
            System.out.println(s);
        }
	}
	
	public static void arrayListInAddHashMap()
	{
		ArrayList<String> arrayList = new ArrayList<String>();
			arrayList.add("tarun");
			arrayList.add("Ten");
			arrayList.add("Rohit");
			
			System.out.println("Test 1 : " + arrayList);
			
			HashMap<String,Integer> hashMap = new HashMap<>();
			hashMap.put("mohan",4);
			hashMap.put("jitesh",6);
			hashMap.put("AJ",1);
			
			arrayList.addAll(hashMap.keySet());
			System.out.println("Test 2 : " + arrayList);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample_1.arrayListAddRemove();
		ArrayListExample_1.sortData();
		ArrayListExample_1.arrayListAddAllRemoveAll();
		ArrayListExample_1.convertToArray();
		
		arrayListInAddHashMap();
	}

}


