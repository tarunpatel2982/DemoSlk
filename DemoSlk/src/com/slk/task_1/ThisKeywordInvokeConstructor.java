package com.slk.task_1;

public class ThisKeywordInvokeConstructor {

	
	String valueA;
	String valueB;
	

	
	
	//default  constructor  
	public ThisKeywordInvokeConstructor()
	{
		this("Tarun ","Patel ");
		
	      System.out.println("Inside  default constructor \n"); 
	      
	} 
	
	public ThisKeywordInvokeConstructor(String a , String b) {
		
		this.valueA=a;
		this.valueB=b;
        System.out.println("Inside parameterized constructor"); 
        
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywordInvokeConstructor thisKeywordInvokeConstructor = new ThisKeywordInvokeConstructor();
		
	}

}
