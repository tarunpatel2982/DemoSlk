package com.slk.task1_1_1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] car= {"volvo", "bmw", "ford","suzuki"};
		
		//single array value print
		System.out.println(car[1]);
		
		
		//change array elements
		car[0]="opel";
		System.out.println(car[0]);
		
		//print array length

		System.out.println("array length "+ car.length);
		
		
		//for loop using array 
		
		for(int i=0;i<car.length;i++)
		{
			System.out.println("array value print using for loop : "+ i + " "+ car[i]);
		}
		
		
		
		
		int[][] myNumber= {{1,2,3,4},{5,6,7}};
		
		System.out.println(" ===>>  length of two dimensional array :");
		for(int i=0;i<myNumber.length;i++)
		{
			
			for(int j=0 ;j<myNumber[i].length;j++)
			{	
			System.out.print(myNumber[i][j]);
			}
			System.out.println();
		}
		
		
		
		System.out.println(" ===>>  here we are going to declare, instantiate, initialize and traverse an array.:");
		
		/// Let's see the simple example of java array, where we are going to declare, instantiate, initialize and traverse an array.
		int a[]=new int[5];//declaration and instantiation  	
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
		 
		
		
	}

}
