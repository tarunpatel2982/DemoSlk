package com.slk.task_1;

public class MethodOverloading {

	//Method Overloading 
	
	
	//Number Of Parameter Method overloading 
	public void dispDetail(char c)
	{
		System.out.println("First  method dispDetail call   :   " + c );
	}
	public void dispDetail(char c ,int num )
	{
		System.out.println("Second  method dispDetail call  :   " + c + "   ...."+  num);
	}


	//Sequence of data type Method overloading 
	public void showDetail(char a , int no)
	{
		System.out.println("first  of method  showDetail  ");
	}
	public void showDetail(int no , char a)
	{
		System.out.println("second  of method  showDetail");
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading methodOverloading = new MethodOverloading();
		
		 methodOverloading.dispDetail('a');
		 methodOverloading.dispDetail('b',10);
		 
		 System.out.println("\n");
		 
		 methodOverloading.showDetail('a',40);
		 
		 methodOverloading.showDetail(50,'b');
		 
	}

}
