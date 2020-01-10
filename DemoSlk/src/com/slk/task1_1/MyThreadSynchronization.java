package com.slk.task1_1;

public class MyThreadSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table table = new Table();
		MyThread1 myThread1 = new MyThread1(table);
		MyThread2 myThread2 = new MyThread2(table);
		myThread1.start();
		myThread2.start();
	}

}
