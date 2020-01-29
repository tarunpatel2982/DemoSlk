package com.slk.task12;

public class ThreadPriority extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println("Running Thread Name : " + Thread.currentThread().getName());
		System.out.println("Running Thread Priority  : " + Thread.currentThread().getPriority());
		
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority threadPriority1 = new ThreadPriority();
		ThreadPriority threadPriority2 = new ThreadPriority();
		
		threadPriority1.setPriority(Thread.MAX_PRIORITY);
		threadPriority2.setPriority(Thread.MIN_PRIORITY);
		
		threadPriority1.start();
		threadPriority2.start();
	}

}
