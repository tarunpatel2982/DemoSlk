package com.slk.task13.Synchronization;

public class Thread1 extends Thread {
	
	PrintDemo p ;
	public Thread1(PrintDemo p ) {
		// TODO Auto-generated constructor stub
		this.p =p ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		p.printValue(100);
	}

}
