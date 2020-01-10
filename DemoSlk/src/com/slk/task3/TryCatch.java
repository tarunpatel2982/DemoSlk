package com.slk.task3;

public class TryCatch {

	
	public void arithmeticException()
	{
		try
		{
			//arithmeticException  
			int data = 100/0;
			System.out.println();
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	public void  nullPointerException()
		{
			try
			{
				String s= null;
				System.out.println(s.length());
	
			}catch(NullPointerException n)
			{
				System.out.println(n);
			}
		}
	public void  numberFormatException()
	{
		try
		{
			String s= "tarun";
			int a =Integer.parseInt(s);
			System.out.println(a);

		}catch(NumberFormatException n)
		{
			System.out.println(n);
		}
	}
	public void  arrayIndexOutOfBoundsException()
	{
		try
		{
			int a[]= new int[5];
			a[10]=50;
			System.out.println(a[10]);

		}catch(ArrayIndexOutOfBoundsException n)
		{
			System.out.println(n);
		}
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			TryCatch tryCatch = new TryCatch();
			tryCatch.arithmeticException();
			tryCatch.nullPointerException();
			tryCatch.numberFormatException();
			tryCatch.arrayIndexOutOfBoundsException();
			
		
	}

}
	