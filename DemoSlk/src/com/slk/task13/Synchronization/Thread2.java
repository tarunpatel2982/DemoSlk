package com.slk.task13.Synchronization;

public class Thread2 extends Thread{
	
	
	PrintDemo p;
	public Thread2(PrintDemo p) {
		// TODO Auto-generated constructor stub
		
		this.p =p ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		p.printValue(5);
	
	}

}
