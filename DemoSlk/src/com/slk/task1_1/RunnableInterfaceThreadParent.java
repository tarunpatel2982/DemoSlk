package com.slk.task1_1;

public class RunnableInterfaceThreadParent implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("A= "+ i);
		}
		
	}

}
