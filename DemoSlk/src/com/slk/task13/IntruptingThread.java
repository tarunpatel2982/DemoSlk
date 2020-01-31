package com.slk.task13;

import javax.management.RuntimeErrorException;

public class IntruptingThread extends Thread{
	
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			System.err.println("task");
		}catch (Exception e) {
			
			throw new RuntimeException("Thread  ==>Intruptrd...." + e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntruptingThread intruptingThread0 = new IntruptingThread();
		IntruptingThread intruptingThread1 = new IntruptingThread();
		intruptingThread0.start();
		intruptingThread1.start();
		
		System.out.println("Check Intrupt : " + intruptingThread0.isInterrupted());
		System.out.println("Check Intrupt : " + intruptingThread1.isInterrupted());
		intruptingThread0.interrupt();
		
		System.out.println("Check Intrupt : " + intruptingThread0.isInterrupted());
		System.out.println("Check Intrupt : " + intruptingThread1.isInterrupted());
		

		

	}

}
