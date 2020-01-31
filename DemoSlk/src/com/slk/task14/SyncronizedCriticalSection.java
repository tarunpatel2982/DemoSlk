package com.slk.task14;

public class SyncronizedCriticalSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoSum t= new TwoSum();
		
		
	
		Thread t1= new Thread()
				
				{
					public void run() {
						
						t.add(10, 15);
					}
				};
				t1.start();
				Thread t2= new Thread()
				
				{
					public void run() {
						
						t.add(1, -1);
					}
				};
				t2.start();
	}

}
