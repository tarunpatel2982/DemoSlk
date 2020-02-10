package com.slk.task15.JavaGenerics;

public class CreatingGerericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyGen<Integer> myGenericClass = new MyGen<Integer>();
		myGenericClass.add(2);
		myGenericClass.add(45);
		
		//myGenericClass.add("tarun"); Compile time Error 
		
		System.out.println("Get Gereric object value : "+  myGenericClass.get());
	}

}
