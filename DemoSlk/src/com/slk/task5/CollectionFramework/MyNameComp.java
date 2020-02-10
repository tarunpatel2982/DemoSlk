package com.slk.task5.CollectionFramework;

import java.util.Comparator;

public class MyNameComp implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
