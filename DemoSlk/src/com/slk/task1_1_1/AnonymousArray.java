package com.slk.task1_1_1;

public class AnonymousArray {
	
	//anonymous array to method 
	static void printArray(int arr[])
	{
		System.out.println(" anonymous array to method  using array ");
		
		for(int i=0;i<arr.length;i++)
		{
				System.out.println(arr[i]);
		}
	}
	
	
	//Java Program to return an array from the method  
	
	static int[] get()
	{
		return new int[]{1,2,3,4,5};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnonymousArray.printArray(new int[]{40,50,60,70,80,90,100});//passing anonymous array to method  
		
		int arr[]=get();
		System.out.println("==>>> Java Program to return an array from the method  ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println("==>>> Array outBound Exception  ");
		
		int arr1[]={50,60,70,80};  
		for(int i=0;i<=arr1.length;i++){  
		System.out.println(arr1[i]);  
		}  
		
	}

}
