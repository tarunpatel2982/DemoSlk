package com.slk.task1_1;

public class Table2 {

	 void printValue(int a)
	{
		 synchronized (this) {
			 for(int i=1;i<=5;i++)
			 {
				 System.out.println(a*i);
				 try
				 {
					 Thread.sleep(500);
				 }catch (Exception e) {
					// TODO: handle exception
					 System.out.println(e);
				 }
			 }
			
		}
	}
}
