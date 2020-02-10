package com.slk.task3.ExceptionHandling;

public class MethodOverridingException5 extends Parrent2{

	
	//Example in case subclass overridden method declares subclass exception
	public void parrent2()throws ArithmeticException 
	{
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Parrent2 parrent2 = new MethodOverridingException5();
		try {
			parrent2.parrent2();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
