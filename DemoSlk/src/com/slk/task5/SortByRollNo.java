package com.slk.task5;

import java.util.Comparator;

public class SortByRollNo implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		// TODO Auto-generated method stub
		return o1.rollNo- o2.rollNo;
	}

}
