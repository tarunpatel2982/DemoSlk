package com.slk.task12.Multithreading;

public class ThreadShedularThreadFirst  extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i = 0;i<10;i++)
	{
		System.out.println("I am in first thread ...");
		try {
			
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Exception Occured ...............");
		}
	}
	}

	
	
}
