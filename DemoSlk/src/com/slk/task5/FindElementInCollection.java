package com.slk.task5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindElementInCollection extends CollectionMethod{
	
	public FindElementInCollection()
	{
		System.out.println("hii");
		super();
	}
	public static void findMaxElementExample()
	{
		List<Integer> integers = Arrays.asList(31,50,14,56,41,78,32);
		Integer maInteger = Collections.max(integers);
		
		System.out.println("maximum Value : " + maInteger);
	}
	public static void findMinElementExample()
	{
		List<Integer> integers = Arrays.asList(31,50,14,56,41,78,32);
		Integer maInteger = Collections.min(integers);
		
		System.out.println("Minimum Value : " + maInteger);
	}

	
	public static void indexOfSubListExample() {
		List<Integer> source = Arrays.asList(91,92,93,94,95,96,97,98,99);
		List<Integer> target = Arrays.asList(94,95,96,97,98);
		
		int startingIndex= Collections.indexOfSubList(source, target);
		System.out.println("starting INdex Position : "+startingIndex);
		
	}

	public static void lastIndexOfSubListExample() {
		List<Integer> source = Arrays.asList(18,33,22,33,34,96,97,98,99);
		List<Integer> target = Arrays.asList(96,97,98);
		
		int lastIndex= Collections.lastIndexOfSubList(source, target);
		System.out.println("last INdex Position : "+lastIndex);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMaxElementExample();
		findMinElementExample();
		indexOfSubListExample();
		lastIndexOfSubListExample();
		
		
	
	}

}
