package com.slk.task1_1;

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
