package com.slk.task13.Synchronization;

public class SynchronizedBlock1 extends Thread {
	
	
	Table2 t;
	public SynchronizedBlock1(Table2 t) {
		this.t=t;
	}
	public void run()
	{
		t.printValue(5);
	}


}
