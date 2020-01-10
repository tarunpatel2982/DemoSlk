package com.slk.task1_1;

public class Table {
	synchronized void printValue(int n)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(500);
				
			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
	}

}
