package com.slk.task4.NestedClasses;

public class AnonymousDemo implements Age{

	
	//this is inner class
	@Override
	public void getAge() {
		// TODO Auto-generated method stub
		System.out.println("Age is :" + x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnonymousDemo a = new AnonymousDemo();
		a.getAge();
	}

	

}
