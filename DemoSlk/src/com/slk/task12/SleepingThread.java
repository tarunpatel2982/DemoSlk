package com.slk.task12;

public class SleepingThread extends Thread{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SleepingThread thread1 = new SleepingThread();
		SleepingThread thread2 = new SleepingThread();
		
		
		thread1.start();
		thread2.start();
	}

	public void run() {
		
		
		// TODO Auto-generated method stub
	 for (int i = 1; i <=5; i++) 
	 {
		 System.out.println("Display Current Thread Name : " + Thread.currentThread().getName());
			
		//System.out.println(i);
		try 
			{
			System.out.println(i);
					Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println(e);
				
			}
		
	}
	}
}
