package com.slk.task13.Synchronization;

public class CheckAccessMethodExample extends Thread {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println(Thread.currentThread().getName() + "Finish Executing....");
	}
	
	
	public static void main(String[] args) throws InterruptedException,SecurityException {
		// TODO Auto-generated method stub

		CheckAccessMethodExample checkAccessMethodExample0 = new CheckAccessMethodExample();

		CheckAccessMethodExample checkAccessMethodExample1 = new CheckAccessMethodExample();
		
		checkAccessMethodExample0.start();
		checkAccessMethodExample1.start();
		
		
		
		//check for access permission of current running thread 
		checkAccessMethodExample0.checkAccess();
		System.out.println(checkAccessMethodExample0.getName()+ "hash access");
		
		

		checkAccessMethodExample1.checkAccess();
		System.out.println(checkAccessMethodExample1.getName()+ "hash access");
		
	}

}
