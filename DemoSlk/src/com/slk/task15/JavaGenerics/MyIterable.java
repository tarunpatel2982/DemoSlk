package com.slk.task15.JavaGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyIterable<T> implements Iterable<T> {

	
	private List<T> list;
	 public MyIterable(T [] t) {
		 
		 list= Arrays.asList(t);
		 Collections.reverse(list);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

}
