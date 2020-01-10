package com.slk.task3;

public class MethodOverridingWithUnCheckedException extends Parrent {
	
	//Rules  of Exception 
	
	//Super  class  method does   not declared an Exception and subclass override method can not checked exception but can declare 
	//Unchecked 
	public void show()throws ArithmeticException
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrent parent = new MethodOverridingWithUnCheckedException();
		parent.show();
	}

}
