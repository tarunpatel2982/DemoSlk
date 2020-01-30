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
		IntruptingThread intruptingThread = new IntruptingThread();
		intruptingThread.start();
		
		
		try
		{
			intruptingThread.interrupt();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Handlaed");
		}

	}

}
