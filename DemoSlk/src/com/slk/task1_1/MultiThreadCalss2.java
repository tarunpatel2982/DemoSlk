package com.slk.task1_1;

public class MultiThreadCalss2 extends Thread{
int i;
	public void run() {
		for ( i=1 ; i<=10 ; i++)
		{
			//sleep method in java
			try {Thread.sleep(500);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("I == "  + i);
		}
	}
}
