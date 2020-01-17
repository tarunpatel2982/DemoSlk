package com.slk.task5;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample_3 {
	
	
	
	
	public  static void ListIteratorAllMethod()
	{
		System.out.println("List Iterator All method");
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("A");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		ListIterator<String> listIterator= list.listIterator();
		System.out.println("Previous Index  : " + listIterator.previousIndex());
		listIterator.next();
		System.out.println("Previous Index  : " + listIterator.previousIndex());
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Next Index  : " + listIterator.nextIndex());
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Forwprd direcion");
		
		while (listIterator.hasNext()) {
			
			System.out.println(listIterator.next() + ",");
			
		}
		System.out.println("----------------------------------------------------------");
		
		
		System.out.println("Backword direcion");
		
		while (listIterator.hasPrevious()) {
			
			System.out.println(listIterator.previous() + ",");
			
		}
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Iteration of specfic postion");
		listIterator = list.listIterator(2);
		while (listIterator.hasNext()) {
			
			System.out.println(listIterator.next() + ",");
			
		}
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("=== >>> Update list object");
		
		list.set(1, "K");
		System.out.println(list);
		
		System.out.println("Previous Index  : " + listIterator.previousIndex());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListIteratorExample_3.ListIteratorAllMethod();
	}

}
