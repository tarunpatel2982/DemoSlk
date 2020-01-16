package com.slk.task5;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudentComparator> studentComparators= new ArrayList<StudentComparator>();
		studentComparators.add(new StudentComparator(111, "bbbb", "london")); 
		studentComparators.add(new StudentComparator(131, "aaaa", "nyc")); 
		studentComparators.add(new StudentComparator(121, "cccc", "jaipur")); 
		
		
		System.out.println("============UnSorted ======================");
		
		for(int i=0;i<studentComparators.size();i++)
		{
			System.out.println( "  " + studentComparators.get(i));
		}
		
		Collections.sort(studentComparators,new SortByRollNo());
		System.out.println("============Sorted by Roll No ======================");
		
		for(int i=0;i<studentComparators.size();i++)
		{
			System.out.println( "  " + studentComparators.get(i));
		}
		
		
		Collections.sort(studentComparators,new SortByName());
		System.out.println("============Sorted by Name ======================");
		
		for(int i=0;i<studentComparators.size();i++)
		{
			System.out.println( "  " + studentComparators.get(i));
		}
	}

}
