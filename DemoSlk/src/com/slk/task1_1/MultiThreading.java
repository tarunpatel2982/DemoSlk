package com.slk.task1_1;

public class MultiThreading extends Thread {
	int j;
	public void run() {
		for ( j=1 ; j<=10 ; j++)
		{
			System.out.println("J =="  + j);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiThreadCalss2 multiThreadCalss2 = new MultiThreadCalss2();
		MultiThreading multiThreading = new MultiThreading();
		
		multiThreadCalss2.start();
		multiThreading.start();

	}

}
