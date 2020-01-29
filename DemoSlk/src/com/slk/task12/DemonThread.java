package com.slk.task12;

import java.io.BufferedReader;

public class DemonThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Demon Thread Name  : " + Thread.currentThread().getName());
			
			
		}else
		{
			System.out.println("User Thread Name  : " + Thread.currentThread().getName());
		
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemonThread thread0= new DemonThread();

		DemonThread thread1= new DemonThread();

		DemonThread thread2= new DemonThread();
		

		thread0.setDaemon(true);
		
		thread0.start();
		thread1.start();
		thread2.setDaemon(true);
		thread2.start();
	}

}
