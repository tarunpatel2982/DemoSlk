package com.slk.task5;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;

public class InsertionInCollectionExample16 {
	
	public static void addAndAddAllMethodExample()
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A"); 
		list.add("Computer"); 
		list.add("Portal"); 
		list.add("for"); 
		list.add("Geeks"); 
		Collection<String> copy = new LinkedList<String>();
		
		
		System.out.println("The Linked List is : " + list);
		
		copy.addAll(list);
		System.out.println("The New List is : " + copy);
		
		
		list.addAll(2, copy);
		System.out.println("Append list index 2 : " + list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addAndAddAllMethodExample();
	}

}
