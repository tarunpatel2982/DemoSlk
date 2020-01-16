package com.slk.task5;

import java.util.Comparator;

public class StudentComparator{
	
	 int rollNo;
	  String name,adress;
	
	 
	 public StudentComparator(int rollNo, String name, String adress) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.adress = adress;
	}


	@Override
	public String toString() {
		return "StudentComparator [rollNo=" + rollNo + ", name=" + name + ", adress=" + adress + "]";
	}
	 
	 

}
