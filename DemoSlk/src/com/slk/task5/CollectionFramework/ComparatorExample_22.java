package com.slk.task5.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student2> Student1= new ArrayList<Student2>();
		Student1.add(new Student2(111, "bbbb", "london")); 
		Student1.add(new Student2(131, "aaaa", "nyc")); 
		Student1.add(new Student2(121, "cccc", "jaipur")); 
		
		
		System.out.println("============UnSorted ======================");
		
		for(int i=0;i<Student1.size();i++)
		{
			System.out.println( "  " + Student1.get(i));
		}
		
		Collections.sort(Student1,new SortByRollNo());
		System.out.println("============Sorted by Roll No ======================");
		
		for(int i=0;i<Student1.size();i++)
		{
			System.out.println( "  " + Student1.get(i));
		}
		
		
		Collections.sort(Student1,new SortByName());
		System.out.println("============Sorted by Name ======================");
		
		for(int i=0;i<Student1.size();i++)
		{
			System.out.println( "  " + Student1.get(i));
		}
	}

}
