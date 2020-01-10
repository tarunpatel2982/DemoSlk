package com.slk.task1_1;

public class MyThread2 extends Thread {

	Table t;
	public MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printValue(100);
	}
}
