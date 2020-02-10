package com.slk.task14.JavaConcurrency;

public class RaceConditionAndCriticalSection {

	private int count= 10 ;
	
	public void increment()
	{
		count++;
		
		System.out.println(Thread.currentThread().getName() +  " value " + count);
	}
	
	public void decrement()
	{
		count--;
		System.out.println(Thread.currentThread().getName() +  " value " + count);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RaceConditionAndCriticalSection r = new RaceConditionAndCriticalSection();
		
			new Thread()
			{
				public void run() {
					r.increment();
				}
			}.start();
			
			new Thread()
			{
				public void run() {
					r.decrement();
				}
			}.start();
			
			
	}

}
