package com.slk.task13.Synchronization;

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Customer customer = new Customer();
		
		new Thread()
		{
			public void run() {
				customer.withdraw(15000);
			}
			
		}.start();
		
		new Thread()
		{
			public void run() {
				customer.deposite(20000);
			}
		}.start();
	}

}
