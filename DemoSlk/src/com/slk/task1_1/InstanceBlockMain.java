package com.slk.task1_1;

public class InstanceBlockMain extends InstanceBlockA {
	
	public InstanceBlockMain()
	{
		super();
		System.out.println("Child Class Constructor Invoked");
	}
	{
		System.out.println("Instance block invoded");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceBlockMain instanceBlockMain = new InstanceBlockMain();
	}

}
 