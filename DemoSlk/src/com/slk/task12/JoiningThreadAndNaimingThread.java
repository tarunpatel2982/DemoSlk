package com.slk.task12;

public class JoiningThreadAndNaimingThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <=5 ; i++) {
			
			
			///this is naming thread 
			System.out.println("Name Of thread  : " + Thread.currentThread().getName());
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoiningThreadAndNaimingThread thread1= new JoiningThreadAndNaimingThread();

		JoiningThreadAndNaimingThread thread2= new JoiningThreadAndNaimingThread();

		JoiningThreadAndNaimingThread thread3= new JoiningThreadAndNaimingThread();
		
		
		
		thread1.start();
		
		///set thread name
		thread1.setName(" Thread 1");

		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		thread2.setName(" Thread 2");
		thread3.start();
		thread3.setName(" Thread 3");
	}

}
