package com.slk.task3.ExceptionHandling;



public class CustomeUnCheckedException {

	
	static void compute(int a)throws UnCheckedException
	{
		if (a > 10)
		{
			throw new UnCheckedException(a);
		}
		else 
		{
			System.out.println("no error in prog . no exception caught");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			compute(5);
			compute(12);
		} catch (UnCheckedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
