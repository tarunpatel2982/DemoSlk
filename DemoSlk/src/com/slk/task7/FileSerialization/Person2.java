package com.slk.task7.FileSerialization;

import java.io.Serializable;

public class Person2 implements Serializable{
	
	private String personName;
	private int personAge;
	
	public Person2()
	{
		
	}
	
	public Person2(String personName , int personAge)
	{
		setPersonName(personName);
		setPersonAge(personAge);
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

//	@Override
//	public String toString() {
//		return "Person2 [personName=" + personName + ", personAge=" + personAge + "]";
//	}
//	

	
}
