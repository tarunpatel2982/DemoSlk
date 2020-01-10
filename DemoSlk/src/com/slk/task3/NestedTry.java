package com.slk.task3;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		
			try
			{
				   System.out.println("going to divide");  
				     int b =39/0;  
			}catch (ArithmeticException e) {
				System.out.println(e);
				// TODO: handle exception
			}
			try
			{
				int a[]=new int[5];  
			    a[5]=4; 
			}catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
				// TODO: handle exception
			}
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		

	}

}
