package com.slk.task1_1;

public class DaemonThread extends Thread{
	
	public DaemonThread(String name)
	{
		super(name);
	}
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Demon Thread");
			
		}
		else
		{
			System.out.println("User Thread");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread d1= new DaemonThread("t1");

		DaemonThread d3= new DaemonThread("t2");

		DaemonThread d2= new DaemonThread("t3");

		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.setDaemon(true);
		d3.start();
	}

}
