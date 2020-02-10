package com.slk.task5.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample14_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Emp14> listEmp14s = new ArrayList<Emp14>();
		listEmp14s.add(new Emp14("tarun", 45000, 45));
		listEmp14s.add(new Emp14("rock", 58000, 10));
		listEmp14s.add(new Emp14("mins", 7200, 20));
		
		
		System.out.println("Before Sorting : " + listEmp14s);
		System.out.println( " -------------------=====================----------------------------------=======================---------------------------------------------------");
		Collections.sort(listEmp14s);
		System.out.println("After Sorting  : " + listEmp14s);
	}

}
