package com.slk.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingListToArray {

	
	public static void convertListtoArrayofString()
	{
		System.out.println("---------------------------------------------  convertListtoArrayofString  ---------------------------------------------");
		 
		List<String> list = new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		list.add("item3");

		String[] itemsofArray=  new String[list.size()];
		
		itemsofArray =   list.toArray(itemsofArray);
		
		for(String s :itemsofArray)	
		{
			System.out.println(s);
		}
		
	}
	public static void convertListtoArrayofInteger()
	{
		System.out.println("---------------------------------------------  convertListtoArrayofInteger ---------------------------------------------");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(20);
		list.add(10);

		Integer[] itemsofArray=  new Integer[list.size()];
		
		itemsofArray =   list.toArray(itemsofArray);
		
		for(Integer s :itemsofArray)	
		{
			System.out.println(s);
		}
		
	}
	
	public static void stringArrayToList()
	{
		System.out.println("---------------------------------------------  Convert Array to ArrayList(Convert Array To Collection )  ---------------------------------------------");
		String[] strings= {"item1","Item2","Item3" , "item4"};
				
		List<String> strings2= new ArrayList<String>(Arrays.asList(strings));
		
		for(String s: strings2)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		convertListtoArrayofString();
		convertListtoArrayofInteger();
		stringArrayToList();
	}

}
