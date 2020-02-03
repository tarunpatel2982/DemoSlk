package com.slk.task15;

import java.util.ArrayList;
import java.util.List;

public class GenericListExample {

	
	public static void withoutGenericsClass()
	{
		List l =new ArrayList();
		l.add(10);
		l.add("10");
		System.out.println("==>>> Without Generics value : "+l);
		
		String j= 	(String) l.get(1);//type casting  
		System.out.println("Type casting is Allow : " + j);
	}
	
	public static void withGenericsClass()
	{
	//Type-safety: We can hold only a single type of objects in generic. It does?t allow to store other objects.
	
		List<String> list = new ArrayList<String>();
		list.add("tarun");
		list.add("lalu");
		list.add("mohan");
		System.out.println("==>>> With Generics Class Value  : "+ list);
		
		
		//Type casting is not required: There is no need to type cast the object.
		//After Generics, we don't need to typecast the object. 
		String j= 	list.get(0);
		System.out.println("===>>> after Generics, we don't need to typecast the object.  :"+ j);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		withoutGenericsClass();
		
		withGenericsClass();
	}

}
