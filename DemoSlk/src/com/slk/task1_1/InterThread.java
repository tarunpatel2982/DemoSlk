package com.slk.task1_1;

public class InterThread {
	
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Going Withdraw.....");
		
		if(this.amount<amount)
		{
			System.out.println("Low balnce  Wiat for it");
			try
			{
				wait();
			}catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
		this.amount -=amount;
		System.out.println("Withdraw Complate");
		
	}
	
	synchronized void deposit(int amount){  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposit completed... ");  
		notify(); 
		} 



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final InterThread interThread = new InterThread();
		 new Thread()
		 {
			 public void run()
			 {
				 interThread.withdraw(15000);
			 }
		 }.start();
		 new Thread()
		 {
			 public void run()
			 {
				 interThread.withdraw(10000);
			 }
		 }.start();
		
	}		

}
