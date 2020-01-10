package com.slk.task4;

public class AnnnymousInnerClassExtends1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t1 = new Thread()
				{
					public void run()
					{
						System.out.println("child Thread");
					}
				};
				t1.start();
				System.out.println("Main Thread");

	}

}
