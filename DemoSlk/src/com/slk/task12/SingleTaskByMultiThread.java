package com.slk.task12;

public class SingleTaskByMultiThread extends Thread {

	
	///Single Task By multiThread
	@Override
	
	//this is a Single Task
	public void run() {
	
		Thread t = Thread.currentThread();
		System.out.println( t);
		System.out.println();
		System.out.println("Name Of Thread : " + Thread.currentThread().getName());
		System.out.println("Thread Check ");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this Is multiThread
		SingleTaskByMultiThread singleTaskByMultiThread1 = new SingleTaskByMultiThread();
		SingleTaskByMultiThread singleTaskByMultiThread2 = new SingleTaskByMultiThread();
		
		singleTaskByMultiThread1.start();
		singleTaskByMultiThread2.start();
		
		
	
		
		
	}

}
