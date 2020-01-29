package com.slk.task12;

public class MultitaskByAnnonmousClassExtendsThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Thread thread1 = new Thread()
				{
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						System.out.println("Thread Name : " + Thread.currentThread().getName());
					}
				};
				
				
		Thread thread2 = new Thread()
				{
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("Thread Name  : " + Thread.currentThread().getName());
					}
				};
				
				
				thread1.start();
				thread1.setName("Thread One ");
				
				thread2.start();
				thread2.setName("Thread Two ");
	}

}
