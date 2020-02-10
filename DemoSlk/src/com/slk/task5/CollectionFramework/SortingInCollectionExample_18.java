package com.slk.task5.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingInCollectionExample_18 {
	
	public static void arraySortingExample()
	
	{
		System.out.println(" =========================arraySortingExample===========================");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Tarun");
		arrayList.add("Patel");
		arrayList.add("Aj");
		arrayList.add("Dipak");
		Collections.sort(arrayList);
		
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println("value : " + iterator.next());
		}
	}
	public static void objectReverseOrder()
	{
		System.out.println(" =========================objectReverseOrder===========================");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Tarun");
		arrayList.add("Patel");
		arrayList.add("Aj");
		arrayList.add("Dipak");
		Collections.sort(arrayList,Collections.reverseOrder());
		
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println("value : " + iterator.next());
		}
	}

	public static void sortWrappperClassObject()
	{

		System.out.println(" =========================sortWrappperClassObject===========================");
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(Integer.valueOf(201));
		arrayList.add(Integer.valueOf(101));
		arrayList.add(100);
		
		Collections.sort(arrayList);
		
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortingInCollectionExample_18.arraySortingExample();
		SortingInCollectionExample_18.objectReverseOrder();
		SortingInCollectionExample_18.sortWrappperClassObject();
		
		System.out.println(" =========================Userdefind Class Objects===========================");
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("Tarun"));
		arrayList.add(new Student("Aj"));
		arrayList.add(new Student("Dipak"));
		arrayList.add(new Student("Mit"));
		
		Collections.sort(arrayList);
		
		for(Student s :arrayList)
		{
			System.out.println(s.name);
		}
		
		
	}

}
