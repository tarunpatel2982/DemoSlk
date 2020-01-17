package com.slk.task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class mergingCollectionExample21 {
	
	public static Set<Integer> mergeSetMethodExample(Set<Integer> a ,Set<Integer> b)
	{
		return new HashSet<Integer>()
				{
			{
				addAll(a);
				addAll(b);
			}
				};
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>  integers = new HashSet<Integer>();
		integers.addAll(Arrays.asList(new Integer[] {1,2,3,5,2,6,4,1,7,6}));
		
		
		Set<Integer>  integers2 = new HashSet<Integer>();
		integers2.addAll(Arrays.asList(new Integer[] {7,8,5,2,4,6,3,7}));
		
		
		System.out.println("Set 1 : " + integers);
		
		System.out.println( "Set 2 : " + integers2);
		
		
		System.out.println("Merged Set : " + mergeSetMethodExample(integers, integers2));
	}

}
