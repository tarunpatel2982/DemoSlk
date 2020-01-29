package com.slk.task12;

public class ThreadOne extends Thread{
	@Override
	public void run() 
	{

		
		for (int i = 1; i <=5; i++) 
		{
			System.out.println("Current Thread Name : " + Thread.currentThread().getName());
			System.out.println("Thread One value  : " + i);
			try 
			{
				Thread.sleep(1500);
			} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
		
		}
	}
		

}
