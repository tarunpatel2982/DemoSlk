package com.slk.task4.NestedClasses;

public class NestedInterfaceWithInClass {
	
	interface Message
	{
		void show();
	}
	
	public static void main(String[] args) {
		new  Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hiiiii");
				
			}
		}).start();
	}

}
