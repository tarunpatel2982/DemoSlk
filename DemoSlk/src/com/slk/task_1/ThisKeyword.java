package com.slk.task_1;

public class ThisKeyword {

	//Using ‘this’ keyword to return the current class instance 
	
	//refer current class instance variables  
	
	String valueA;
	String valueB;
	
	
	//parameter wise constructor 
	
	public ThisKeyword() {
		
		valueA="tarun";
		valueB="patel";
	}
	
	
	//return current class instance
		ThisKeyword test()
		{
			return this;
		}
	
	// Method that receives 'this' keyword as parameter 
	public void displayDetail()
	{
		System.out.println("Constructor value Display : " + valueA + " " + valueB);
		

		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThisKeyword thisKeyword = new ThisKeyword();
		thisKeyword.test().displayDetail();;
		
		
		}

}
