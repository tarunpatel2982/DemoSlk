package com.slk.task1_1_1;

public class AccessMofifierPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA classA = new ClassA();
		System.out.println(classA.data);//Compile Time Error  
		classA.msg();//Compile Time Error 
	}

}
