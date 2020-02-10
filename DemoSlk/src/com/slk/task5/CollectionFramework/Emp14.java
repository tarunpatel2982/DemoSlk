package com.slk.task5.CollectionFramework;

public class Emp14 implements Comparable<Emp14>{

	private String empName;
	private int salary,age;
	
	public Emp14(String empName, int salary, int age) {
		
		this.empName = empName;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public int compareTo(Emp14 o) {
		// TODO Auto-generated method stub
		return o.salary - this.salary;
	}

	@Override
	public String toString() {
		return String.format("%s , %d ,%d", empName, salary,age);
	}
	
	
}
