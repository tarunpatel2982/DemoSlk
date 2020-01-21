package com.slk.task5;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample_6_1 {

	public static void treeSetUsingComparator()
	{
		 TreeSet<Integer> tree_set = new TreeSet<Integer>(); 
		  
	        // Adding elemetns to the set 
	        tree_set.add(20); 
	        tree_set.add(24); 
	        tree_set.add(30); 
	        tree_set.add(35); 
	        tree_set.add(45); 
	        tree_set.add(50); 
	  
	      System.out.println("Tree Set values are: "+ tree_set); 
	  
	      // Creating a comparator 
	      Comparator comp = tree_set.comparator(); 
	        
	      // Displaying the comparator values 
	      System.out.println("Since the Comparator value is: "+ comp); 
	      System.out.println("it follows natural ordering"); 
	}
	public static void simpleNaturalOrder()
	{
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		//treeSet.add(null);//null value not acceptable 
		//Heterogeneous not acceptable
		//duplicate value no acceptable 
		treeSet.add(80);
		treeSet.add(200);
		treeSet.add(10);
		treeSet.add(11);
		treeSet.add(300);
		treeSet.add(0);
		treeSet.add(101);
		
		
		System.out.println(treeSet);
	}
	public static void comparatorUsingReverseOrder()
	{
		//sorting using comparator 
		TreeSet<Integer> treeSet = new TreeSet<Integer>(Comparator.reverseOrder());
		
		treeSet.add(80);
		treeSet.add(200);
		treeSet.add(10);
		treeSet.add(11);
		treeSet.add(300);
		treeSet.add(0);
		treeSet.add(101);
		System.out.println(treeSet);
		///check size 
//		System.out.println("Find Size Tree Set : " + treeSet.size());
//		
//		///check contain method 
		int val=11;
//		if(treeSet.contains(val))
//		{
//			System.out.println("Element Avilabel :" + val);
//			
//		}else
//		{
//			System.out.println("Not avilabele this value : " + val );
//		}
//		// find element in tree set 
//		
//		System.out.println("Find First element : " + treeSet.first());
//
//		System.out.println("Find Last element : " + treeSet.last());
		
		//higher and lover element check
		
		System.out.println("element just less than " +" : " + treeSet.higher(val));
		System.out.println("element just greater than " +" : " + treeSet.lower(val));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simpleNaturalOrder();
		comparatorUsingReverseOrder();
		 
	}

}
