package com.slk.task13.Synchronization;

public class SynchronizedBlock2 extends Thread{
	Table2 t;
	public SynchronizedBlock2(Table2 t) {
		this.t=t;
	}
	public void run()
	{
		t.printValue(100);
	}

}
