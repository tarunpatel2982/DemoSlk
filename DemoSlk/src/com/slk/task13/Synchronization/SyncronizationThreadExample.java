package com.slk.task13.Synchronization;

public class SyncronizationThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PrintDemo printDemo = new PrintDemo();
		Thread1 thread1 = new Thread1(printDemo);
		Thread2 thread2 = new Thread2(printDemo);
		
		thread1.start();
		
//		try {
//			thread1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		thread2.start();
		
	}

}
