package com.slk.task5.CollectionFramework;

import java.util.Comparator;

public class SortByName implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
	

}
