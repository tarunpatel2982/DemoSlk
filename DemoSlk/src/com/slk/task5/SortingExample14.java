package com.slk.task5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class SortingExample14 {
	
	public static void naturalOrdaringSorting()
	{
		System.out.println("---------------------String Sorting ------------------------------------------------");
		List<String> list = Arrays.asList("Orange", "Grape", "Apple", "Lemon", "Banana");
		
		System.out.println("Before Sorting : " + list);
		
		
		Collections.sort(list);
		System.out.println("After Sorting :" +list);
		

		System.out.println("---------------------Integer list  Sorting ------------------------------------------------");
		List<Integer> integerslist= Arrays.asList(1, 6, 9, 3, 2, 0, 8, 4, 7, 5);
		
		System.out.println("Before Sorting : " + integerslist);
		
		Collections.sort(integerslist);
		System.out.println("After Sorting :" +integerslist);
		
		
		
		System.out.println("----------------------------Sorting list Date ----------------------------------- ");
		
		List<Date> listdaDates = new ArrayList<Date>();
		
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		
		try {
			listdaDates.add(dateFormat.parse("2020-01-15"));
			listdaDates.add(dateFormat.parse("2019-12-01"));
			listdaDates.add(dateFormat.parse("1995-11-20"));
		} catch (ParseException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		Iterator<Date> iterator = listdaDates.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("Before Sorting  " + iterator.next());
		}
	
		System.out.println("----------------------------------------------------------------");
		Collections.sort(listdaDates);
		
	
		Iterator<Date> iterator1 = listdaDates.iterator();
		
		while (iterator1.hasNext()) {
			System.out.println("After Sorting  " + iterator1.next());
		}
		
	}

	public static void reversingSortOrder()
	{
		System.out.println("---------------------Reverse a String  ------------------------------------------------");
		List<String> list = Arrays.asList("Orange", "Grape", "Apple", "Lemon", "Banana");
		
		System.out.println("Before Sorting : " + list);
		
		
		Collections.reverse(list);
		System.out.println("After Sorting :" +list);
		
	}
	public static void treeReverse()
	{
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("k");
		treeSet.add("u");
		treeSet.add("b");
		treeSet.add("n");
		treeSet.add("a");
		System.out.println("Tree Set : " + treeSet);
		
		
		Iterator<String> iterator = treeSet.descendingIterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println("Iterator DecendingInterator Used :  " + string);
			
		}
		
		TreeSet<String> treeSet2 = (TreeSet<String>)treeSet.descendingSet();
		System.out.println("decending set Method : "+ treeSet2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		naturalOrdaringSorting();
//		reversingSortOrder();
		treeReverse();
	}

}
