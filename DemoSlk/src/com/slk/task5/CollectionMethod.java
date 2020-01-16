package com.slk.task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionMethod {
	
	public CollectionMethod()
	{
		
	}
	public static void sortMethodExample()
	{
		Employee employee1 = new Employee(5, "tarun", "Patel", 25);

		Employee employee2 = new Employee(4, "Uv", "Patel", 55);

		Employee employee3 = new Employee(6, "lalu", "Patel", 40);

		Employee employee4 = new Employee(3, "Mins", "Patel", 22);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		
		System.out.println("<<========================>> Unsorted ArrayList  <<=======================>>");
		
		System.out.println(employees);
		
		System.out.println("<<========================>> sorted ArrayList  <<=======================>>");
		
		Collections.sort( employees);
		System.out.println(employees);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionMethod.sortMethodExample();
	}

}
