package com.slk.task1_1;

import com.slk.task13.Synchronization.Table2;

public class SynchronizedBlockUsingAnnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Table2 table2 =new Table2();
		
		
		Thread t1 = new Thread()
				{
				
					public void run()
					{
						table2.printValue(5);
					}
				};
				

				Thread t2 = new Thread()
						{
						
							public void run()
							{
								table2.printValue(100);
							}
						};
						
						t1.start();
						t2.start();
	}

}
