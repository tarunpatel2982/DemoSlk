package com.slk.task13.Synchronization;

public class PrintDemo extends Thread {

	public synchronized void printValue(int val) 
	{
		for (int i = 1; i <=5; i++) {
			
			System.out.println("Print Value  : " + i*val);
			
			
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
