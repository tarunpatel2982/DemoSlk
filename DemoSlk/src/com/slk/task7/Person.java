package com.slk.task7;

import java.io.Serializable;

public class Person implements Serializable {

	 private static final long serialVersionUID = 1L;
	 private String name;
	 private int age;
	 
//	public Adress(String name, int age) {
//		
//		this.name = name;
//		this.age = age;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Override
//	public String toString() {
//		return new StringBuffer(" Name : ").append(this.name).append(" Age : " ).append(this.age).toString();
//	 
//	 
//}
}
