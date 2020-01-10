package com.slk.task1_1;

public class ThreadSynchronizedannonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final Table  table = new Table();
		
		
		Thread t1=new Thread()
				{
					public void run()
					{
						table.printValue(5);
					}
				};
				
				Thread t2 =new Thread()
						{
							public void run()
							{
								table.printValue(100);
							}
						};
						t1.start();
						t2.start();
	}

}
