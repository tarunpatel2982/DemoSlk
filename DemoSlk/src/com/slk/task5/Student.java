package com.slk.task5;

public class Student implements Comparable<Student> {

	public String name;
	
	
	public Student(String name)
	{
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
		
	}

}
