package com.slk.task3.ExceptionHandling;

import java.io.IOException;

public class ThrowsKeyword {

	 void method()throws ArithmeticException {  	
		  throw new ArithmeticException("device error");  
		 }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			
			ThrowsKeyword throwsKeyword = new ThrowsKeyword();
			throwsKeyword.method();
		}catch (Exception e) {
			
		System.out.println(e);	
			// TODO: handle exception
		}
	}

}
