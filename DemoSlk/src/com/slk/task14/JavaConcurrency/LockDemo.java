package com.slk.task14.JavaConcurrency;

public class LockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 final Worker worker1 = new Worker("Worker 1 ", true);
	        final Worker worker2 = new Worker("Worker 2", true);

	        final CommonResource1 s = new CommonResource1(worker1);

	        new Thread(() -> {
	            worker1.work(s, worker2);
	        }).start();

	        new Thread(() -> {
	            worker2.work(s, worker1);
	        }).start();
	}

}
