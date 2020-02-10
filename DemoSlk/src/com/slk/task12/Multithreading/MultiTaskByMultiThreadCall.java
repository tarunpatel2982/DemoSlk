package com.slk.task12.Multithreading;

public class MultiTaskByMultiThreadCall extends Thread {
	
	
	@Override
	public void run()
	{
			for (int i = 1; i <=10 ; i++)
			{
			
				System.out.println("Second Thread Name : " + Thread.currentThread().getName());
				
				System.out.println("Second Thread value : " + i);
				

			}
		
	}

//	public static  synchronized void run2()
//	{
//		for (int i = 1; i <=5 ; i++) 
//		{
//			
//			System.out.println("Second Thread Name : " + Thread.currentThread().getName());
//			
//			System.out.println("Second Thread value : " + i);
//			
//		}
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadOne threadOne = new ThreadOne();
		MultiTaskByMultiThreadCall threaSecond = new MultiTaskByMultiThreadCall();
		
		threadOne.start();
		threadOne.setName("Thread One ");
	//	threaSecond.run2();
		threaSecond.start();
		threaSecond.setName("Thread Two");
	}

}
