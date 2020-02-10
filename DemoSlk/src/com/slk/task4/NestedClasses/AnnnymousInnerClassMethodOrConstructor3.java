package com.slk.task4.NestedClasses;

public class AnnnymousInnerClassMethodOrConstructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread(new Runnable()
				
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("Child");
					}
					
				});
		t.start();
		System.out.println("main");
				
	}

}
