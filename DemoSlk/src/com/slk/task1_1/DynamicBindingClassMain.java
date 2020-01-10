package com.slk.task1_1;

public class DynamicBindingClassMain extends DynamicBindingClassA{

	public void show()
	{
		System.out.println("Child class ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicBindingClassA dynamicBindingClassMain2 = new DynamicBindingClassA();
		DynamicBindingClassA dynamicBindingClassMain = new DynamicBindingClassMain();
		
		dynamicBindingClassMain.show();
		dynamicBindingClassMain2.show();

	}

}
