package com.slk.task13.Synchronization;

public class StaticSyncronizationBlockExample {

	public  synchronized  static void printValue(int n)
	{
		for (int i = 1; i <=6; i++) {
			System.out.println("Name : " + Thread.currentThread().getName());
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("....................................Test value  : " +  i*n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread thread0= new Thread()
				{
					public void run() {
					StaticSyncronizationBlockExample.printValue(5);	
					}
				};
				
				thread0.start();
				
		Thread thread1 = new Thread()
				{
					@Override
					public void run() {
						// TODO Auto-generated method stub
						StaticSyncronizationBlockExample.printValue(200);
					}
				};
				thread1.start();
			
	}

}
