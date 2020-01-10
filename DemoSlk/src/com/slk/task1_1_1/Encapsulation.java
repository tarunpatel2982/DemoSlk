	package com.slk.task1_1_1;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulate encapsulate= new Encapsulate();
		
		//Student set Value
		encapsulate.setStudRollNo(11708105);
		encapsulate.setStudName("Tarun");
		encapsulate.setStudAge(22);
		
		
		//student get value
		System.out.println("Student Roll No : " + encapsulate.getStudRollNo());
		System.out.println("Student Name    : " + encapsulate.getStudName());

		System.out.println("Student Age     : " + encapsulate.getStudAge());
	}
	

}
