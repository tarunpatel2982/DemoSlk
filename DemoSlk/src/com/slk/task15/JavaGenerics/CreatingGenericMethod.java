package com.slk.task15.JavaGenerics;

public class CreatingGenericMethod {

	
	//creating generic Method Example 
	
	public static <E> void printArray(E [] elements)
	{
		for (E e : elements) {
			System.out.println("Array Element  : " + e);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Integer[] intArray = { 10, 20, 30, 40, 50 };  
	        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
		
	        System.out.println( "Printing Integer Array" );  
	        printArray( intArray  );   
	        
	        System.out.println( "Printing Character Array" );  
	        printArray( charArray );   
	  
	}

}
