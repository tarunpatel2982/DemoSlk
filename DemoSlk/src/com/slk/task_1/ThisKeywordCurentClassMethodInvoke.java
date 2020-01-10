package com.slk.task_1;

public class ThisKeywordCurentClassMethodInvoke {

	
	public void displayDetail()
	{
		System.out.println("Constructor value Display : " );
		

		
	}
	
	public void show()
	{
		System.out.println("====>	Using ‘this’ keyword to invoke current class method ") ;
		this.displayDetail();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywordCurentClassMethodInvoke thisKeywordCurentClassMethodInvoke=new ThisKeywordCurentClassMethodInvoke();
		thisKeywordCurentClassMethodInvoke.show();
		
	}

}
