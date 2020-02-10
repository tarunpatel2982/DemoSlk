package com.slk.task4.NestedClasses;

public class TestNestedInterface extends ONN {

	@Override
	void show() {
		System.out.println("Hiiii");
		
	}

	
	
	public static void main(String[] args) {
		ONN oo =new TestNestedInterface();
		
		oo.show();
		System.out.println(oo.one());
		System.out.println(oo.two());
		
	}
	
	

	

}


abstract class ONN{
	public String one() {
		return "hiii";
	}
	public String two() {
		return "Byyy";
	}
	
	abstract void show();
}
