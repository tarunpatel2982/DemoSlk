package com.slk.task1_1;

public class CurrentThreadMethod extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentThreadMethod currentThreadMethod = new CurrentThreadMethod();
		currentThreadMethod.start();
		CurrentThreadMethod currentThreadMethod2 = new CurrentThreadMethod();
		currentThreadMethod2.start();
		

	}

}
