package com.slk.task13;

public class SuspendThreadExample extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		try {
			sleep(500);
			
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println(i);
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuspendThreadExample s1= new SuspendThreadExample();

		SuspendThreadExample s2= new SuspendThreadExample();

		SuspendThreadExample s3= new SuspendThreadExample();
		
		
		s1.start();
		s2.start();
		
		//suspend second thread  that will be thread stop
		s2.suspend();
		s3.start();
		
		//resume thread that thread will be started
		s2.resume();
	}

}
