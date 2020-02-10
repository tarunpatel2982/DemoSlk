package com.slk.task12.Multithreading;

public class ThreadSchedularSecondThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadShedularThreadFirst threadFirst= new ThreadShedularThreadFirst();
		threadFirst.start();
		
		ThreadSchedularSecondThread secondThread = new ThreadSchedularSecondThread();
		secondThread.start(); 
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	

		for (int i = 0; i < 10; i++) {
			System.out.println("I am second thread .............");
		}
	}
}
