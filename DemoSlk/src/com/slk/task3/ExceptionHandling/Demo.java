package com.slk.task3.ExceptionHandling;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			 m();
			System.out.println("A");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("B");
			
		}finally {
			System.out.println("Finaly");
		}
		
		
	System.out.println("d");
	}
	public static void m()
	{
		throw  new RuntimeException();
	}

}
