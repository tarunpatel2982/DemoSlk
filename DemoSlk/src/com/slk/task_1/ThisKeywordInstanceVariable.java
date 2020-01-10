package com.slk.task_1;

public class ThisKeywordInstanceVariable {

	
	
	String valueC;
	String valueD;
	
	
	public ThisKeywordInstanceVariable(String valueC , String valueD) {
			
			this.valueC=valueC;
			this.valueD=valueD;
		}
	
	public void displayDetail()
	{
		System.out.println("Constructor value Display : " + valueC + " " + valueD);
		
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordInstanceVariable thisInstanceVariable = new ThisKeywordInstanceVariable("tarun " , "Patel");
		thisInstanceVariable.displayDetail();

	}

}
