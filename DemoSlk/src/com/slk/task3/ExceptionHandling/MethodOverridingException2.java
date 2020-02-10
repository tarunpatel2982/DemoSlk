package com.slk.task3.ExceptionHandling;

public class MethodOverridingException2 extends Super {

	//Rule: If the superclass method declares an exception,
	//subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception. 
	public void sup() throws Exception
	{
		System.out.println("Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super super1 = new MethodOverridingException2();
		try
		{
			super1.sup();
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
