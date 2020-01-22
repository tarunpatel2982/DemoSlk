package com.slk.task5;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample_2 {

	
	public static void addLinkedListValue()
	{
		 //Create linked list
        LinkedList<String> linkedList = new LinkedList<>();
        
        //Add elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add(null);
        linkedList.add("D");
        linkedList.add("D");
        linkedList.add(null);
        
        //linked list allow Duplicate value
        System.out.println(linkedList);
        
        System.out.println("Add value in linked list");
        linkedList.add("E");
        System.out.println(linkedList );
        
        System.out.println("Add value in linked list index wise");
        linkedList.add(2, "T");
        System.out.println(linkedList);
        
        System.out.println("Add value in linkedlis in firstnode");
        linkedList.addFirst("Tarun ");
        System.out.println(linkedList);
        
        System.out.println("Add Value in linked Lis in last node");
        linkedList.addLast("Jiten");
        System.out.println(linkedList);
        
        System.out.println("Return linked list Size");
        int a=linkedList.size();
        System.out.println(a);
        
        
        
        System.out.println("Return contain method spacify element check is avilable true or not avilable false");
        
        System.out.println("retrurn true :     "+linkedList.contains("T"));

        System.out.println("return false       " +linkedList.contains("l"));
        
        
        System.out.println("Return tru false and remove the linked list value ");
        
        System.out.println("retrurn true :     "+linkedList.contains("l"));

        System.out.println("return false       " +linkedList.remove("T"));
        
        System.out.println("return the first element of list ");
        
        System.out.println(linkedList.getFirst());
        
        System.out.println("return the last element of list ");
        
        System.out.println(linkedList.getLast());
        
        
	}
	
	public static void linkedListSorting()
	{
		LinkedList<String> linkedList = new LinkedList<>();
		 
		linkedList.add("A");
		linkedList.add("C");
		linkedList.add("B");
		linkedList.add("D");
		 
		//Unsorted
		System.out.println(linkedList);
		Collections.sort(linkedList);
		System.out.println(linkedList);
		
		
		Collections.sort(linkedList,Collections.reverseOrder());

		System.out.println(linkedList);
		
	}
	
	public static void iteratorExample()
	{
		LinkedList<String> linkedList = new LinkedList<>();
		 
		linkedList.add("A");
		linkedList.add("C");
		linkedList.add("B");
		linkedList.add("D");
		 
		System.out.println("Iterator Example ");
		Iterator<String> nIterator = linkedList.iterator(); 
		
		while(nIterator.hasNext())
		{
			System.out.println(nIterator.next());
		}
		
		nIterator.remove();
		System.out.println("After Remove() method is called : " + nIterator);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		LinkedListExample_2.addLinkedListValue();
//		LinkedListExample_2.linkedListSorting();
//		LinkedListExample_2.iteratorExample();
		
	Integer a = 20;
	
	System.out.println(a.hashCode());
	}

}
