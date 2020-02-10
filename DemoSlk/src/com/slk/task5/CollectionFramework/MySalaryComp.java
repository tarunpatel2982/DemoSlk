package com.slk.task5.CollectionFramework;

import java.util.Comparator;

public class MySalaryComp  implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		 if(o1.getSalary() > o2.getSalary()){
	            return 1;
	        } else {
	            return -1;
	        }
	}
	

}
