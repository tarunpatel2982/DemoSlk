package com.slk.task3.ExceptionHandling;

public class MethodOverridingException3 extends Super {

	//Example in case subclass overridden method declares same exception
	
	public void sup() throws ArithmeticException
	{
		
	System.out.println("Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super super1 = new MethodOverridingException3();
		try
		{
			super1.sup();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
