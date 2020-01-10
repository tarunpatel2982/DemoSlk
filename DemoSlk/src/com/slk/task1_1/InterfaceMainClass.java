package com.slk.task1_1;

public class InterfaceMainClass implements Interface1,Interface2{

	

	@Override
	public void detailShow() {
		// TODO Auto-generated method stub
		System.out.println("Interface 2 ");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

		System.out.println("Interface 1 ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMainClass interfaceMainClass = new InterfaceMainClass();
		interfaceMainClass.show();
		interfaceMainClass.detailShow();

	}
}
