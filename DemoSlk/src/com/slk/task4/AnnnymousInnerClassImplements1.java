package com.slk.task4;

public class AnnnymousInnerClassImplements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Runnable r= new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Child Thread");
			}
		};
		Thread t= new Thread(r);
		t.start();
		System.out.println("Main Thread");
		
	}

}
