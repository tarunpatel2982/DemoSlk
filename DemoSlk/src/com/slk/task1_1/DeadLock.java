package com.slk.task1_1;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final String resource1 ="tarun" ;
		final String resource2 ="patel" ;
		
		
		Thread thread1 =new  Thread()
				{
				public void run()
				{
					synchronized(resource1)
					{
							System.out.println("Thread1 : lock resource 1");
						
						
						try
						{
							Thread.sleep(100);
						}catch(Exception e)
						{
							System.out.println(e);
						}
						synchronized (resource2) {
						
							System.out.println("Thread1 : lock resource 2");
							
						}
					}
				}
				};
		
				Thread thread2 =new  Thread()
				{
				public void run()
				{
					synchronized(resource2)
					{
						System.out.println("Thread2 : lock resource 2");
					
					
						try
						{
							Thread.sleep(100);
						}catch(Exception e)
						{
							System.out.println(e);
						}
						synchronized (resource1) {
						
							System.out.println("Thread2 : lock resource 1");
							
						}
					}
				}
				};
	thread1.start();
	thread2.start();
	}
	

}
