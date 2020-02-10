package com.slk.task12.Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPooling implements Runnable {

	private String msg;
	public ThreadPooling(String msg) {
		this.msg= msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thred Name : " + Thread.currentThread().getName()+ "   (start)  message : " +msg);

		  System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
		
	}
	
	private void processmessage()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable r = new ThreadPooling(" " + i);
			executorService.execute(r);
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {
			
			System.out.println("Finish All Thread");
		}
		
	}

	

}
