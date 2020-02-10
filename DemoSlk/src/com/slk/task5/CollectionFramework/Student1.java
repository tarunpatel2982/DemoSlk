package com.slk.task5.CollectionFramework;

public class Student1 implements Comparable<Student1> {

	public String name;
	
	
	public Student1(String name)
	{
		this.name = name;
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
		
	}

}
