package com.slk.task3.ExceptionHandling;

public class ThrowKeyword {

	public static  void detailStud(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Valid");
		}
		else
		{
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		detailStud(17);
		
	}

}
