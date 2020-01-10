package com.slk.task1_1;

public class RunnableInterfaceThread implements Runnable{

public void run() {
		
		for(int j=1;j<=10;j++)
		{
			System.out.println("B= "+ j);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableInterfaceThread runnableInterfaceThread = new RunnableInterfaceThread();
		RunnableInterfaceThreadParent runnableInterfaceThreadParent = new RunnableInterfaceThreadParent();
		
		Thread thread1= new Thread(runnableInterfaceThread);
		Thread thread2 = new Thread(runnableInterfaceThreadParent);
		thread1.start();
		thread2.start();
		
	}

}
