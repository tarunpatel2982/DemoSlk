package com.slk.task12;

public class CreatingThread_1 extends Thread {

	
	public void run()
	{
		System.out.println("Thread  id: " + Thread.currentThread().getId()+ "   is running");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CreatingThread_1 thread1 = new CreatingThread_1();
		thread1.start();
		
		System.out.println("Get thread Name : " + thread1.getName());
		System.out.println("Get thread Priority : " + thread1.getPriority());

	//	System.out.println("Get thread Name : " + thread1.getName());

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	

}
