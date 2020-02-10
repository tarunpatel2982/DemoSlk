package com.slk.task12.Multithreading;

public class CreatingThreadUsingRunnableInterface_1  implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreatingThreadUsingRunnableInterface_1 creatingThreadUsingRunnableInterface_1= new CreatingThreadUsingRunnableInterface_1();
		Thread t1= new Thread(creatingThreadUsingRunnableInterface_1);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running thread Using Implement Runnable Interface ");
	}

}
