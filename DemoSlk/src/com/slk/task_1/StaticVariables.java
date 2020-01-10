package com.slk.task_1;

public class StaticVariables {

	static
	{
		System.out.println("Static block execute");
	}
	
	//static variable
	static int a = m1() ;
	
	//static blocks
	
	static int m1()
	{
		System.out.println("Static method call ");
		return 20;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" value of a : " + m1());
		
	}

}
