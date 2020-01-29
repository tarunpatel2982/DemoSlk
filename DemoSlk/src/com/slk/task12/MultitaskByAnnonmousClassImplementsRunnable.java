package com.slk.task12;

public class MultitaskByAnnonmousClassImplementsRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Runnable r1= new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread Name  : " + Thread.currentThread().getName()+ " Id  " + Thread.currentThread().getId() );
				
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				
				System.out.println("Thread Name  : " + Thread.currentThread().getName() + "  id  " + Thread.currentThread().getId() );
				
			}
		};
		
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		
		
		thread1.start();
		thread1.setName("Thread one ");
		thread2.start();
		thread1.setName("Thread two");
		
	}

}
