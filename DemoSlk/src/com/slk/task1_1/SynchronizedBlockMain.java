package com.slk.task1_1;

public class SynchronizedBlockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final Table2  table2 =new Table2();
		SynchronizedBlock1 synchronizedBlock1 = new SynchronizedBlock1(table2);
		SynchronizedBlock2 synchronizedBlock2 =new SynchronizedBlock2(table2);
		
		synchronizedBlock1.start();
		synchronizedBlock2.start();

	}

}
