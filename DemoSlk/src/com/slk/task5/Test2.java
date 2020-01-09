package com.slk.task5;

import java.util.Comparator;

public class Test2 implements Comparator<Test1>{

	@Override
	public int compare(Test1 o1, Test1 o2) {
		// TODO Auto-generated method stub
		
		if(o1.getKey1() > o2.getKey1())
		{
			return 1;
		}
		else
		{
			return -1;
			
		}
	
	}

}
