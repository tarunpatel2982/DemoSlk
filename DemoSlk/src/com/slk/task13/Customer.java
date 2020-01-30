package com.slk.task13;

public class Customer {

	int amount 	= 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw............");
		
		
		if(this.amount<amount)
		{
			System.out.println("Less Balance wait for deposite ....");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}this.amount-=amount;
		System.out.println("Withdrawc Completed .........");
	}
	
	synchronized void deposite(int amount)
	{
		System.out.println("Going to deposite ........");
		
		this.amount += amount;
		
		System.out.println("deposit Completed  .............");
		
		notify();
	}
}
