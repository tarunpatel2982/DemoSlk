package com.slk.task1_1;

public class SipmleThread extends Thread {

	public void run()
	{
		System.out.println("Thread is run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SipmleThread sipmleThread= new SipmleThread();
		sipmleThread.start();

	}

}
