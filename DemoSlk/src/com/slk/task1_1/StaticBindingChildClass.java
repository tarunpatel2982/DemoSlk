package com.slk.task1_1;

public class StaticBindingChildClass extends StaticBindingSuperClass {


	public static void show()
	{
		System.out.println("Child class 1 ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBindingSuperClass staticBindingClassA = new StaticBindingSuperClass();
		
		StaticBindingSuperClass staticBindingChildClass =new StaticBindingChildClass();
		staticBindingClassA.show();
		staticBindingChildClass.show();
		
	}

}
