package com.slk.task_1;


public class ThisKeywordObject {
///this keyword using as an argument in constructor call
	

	int x = 5;
	public ThisKeywordObject() {
	
		ClassA classA=new ClassA(this);
	}
		public void display() 
		{
			System.out.println("Call a thiskeyword class and display method value : " + x);
		}
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		ThisKeywordObject thisKeywordObject = new ThisKeywordObject();
		// TODO Auto-generated method stub

	}

}
