package com.slk.task3;

import java.io.IOException;

public class ExceptionPropgation {

	public void first() throws IOException
	{
		
        throw new IOException("device error"); 
	}
	public void second() throws IOException
	{
		
		
		first();
	}
	public void three()
	{	
		try
		{
			second();
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropgation exceptionPropgation= new ExceptionPropgation();
		exceptionPropgation.three();
		
	}

}
