package com.slk.task5.CollectionFramework;

public class Employee implements Comparable<Employee>{
	
	private int id =-1;
	private String firstName=null;
	private String lastName= null;
	private int age=-1;
	public Employee(int id, String firstName, String lastName, int age) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
//		System.out.println("===>>> o.id :: " + o.id);
//		
//		System.out.println("==>>> this.id :: " + this.id );
		return this.id -o.id;
	}
	
	
	

}
