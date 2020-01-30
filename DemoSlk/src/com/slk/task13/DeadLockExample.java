package com.slk.task13;

public class DeadLockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "tarun";
		String b = "lalu";
		
		
		Thread thread1 = new Thread()
				{
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						synchronized ( a) {
							System.out.println("Thread 1 : locked Resourece a");
						
							
						
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						synchronized (b) {
							
							System.out.println("Thread 1 : locked Resourec b ");
						}
					}	
					}
				};
				
				
				
				Thread thread2 = new Thread()
				{
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						synchronized ( b) {
							System.out.println("Thread 2 : locked Resourece b");
						
						
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						synchronized (a) {
							
							System.out.println("Thread 2 : locked Resourec a ");
						}
					}
					}
				};
				
				
				
				thread1.start();
				thread2.start();
	}

}
