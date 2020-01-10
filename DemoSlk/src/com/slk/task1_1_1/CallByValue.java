package com.slk.task1_1_1;

public class CallByValue {

	int data=50;
	public void change(int data)
	{
		this.data= data+100;//changes will be in the local variable only  
	}

	
	public void change2	(CallByValue callByValue)
	{
		data= callByValue.data+100;//changes will be in the instance variable
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValue callByValue = new CallByValue();
		System.out.println("Before Change : " + callByValue.data);
		callByValue.change(1000);
		System.out.println("After change"+ callByValue.data);
		
		
		
		System.out.println(" ==> changes will be in the instance variabl ");
		
		System.out.println("Before Change : " + callByValue.data);
		callByValue.change2(callByValue);//passing object
		System.out.println("After change"+ callByValue.data);
	
	}

}
