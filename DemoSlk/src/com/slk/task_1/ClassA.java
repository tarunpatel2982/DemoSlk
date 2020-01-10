package com.slk.task_1;

public class ClassA {

	ThisKeywordObject obj;

	public ClassA(ThisKeywordObject obj) {

		this.obj = obj;
		// TODO Auto-generated constructor stub

		obj.display();
	}
	

	public void dispB() {
		System.out.println("disp() method of ClassA");
	}
}
