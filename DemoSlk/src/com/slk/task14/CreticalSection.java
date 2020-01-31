package com.slk.task14;

public class CreticalSection  {

	
	public static void add(int val)
	{
		int count= 10;
		
		count= count+ val;
		System.out.println("Thread Name "+Thread.currentThread().getName()+" Value : "+count);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread0= new Thread()
				{
					@Override
					public void run() {
						// TODO Auto-generated method stub
						add(1);
					}
				};
				
				
				
				Thread thread1= new Thread()
				{
					@Override
					public void run() {
						// TODO Auto-generated method stub
						add(-1);
					}
				};
		
				thread0.start();
				thread1.start();
		
	}

}
