package com.slk.task3;

import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		try
		{	
			int a = 50;
				System.out.println(a +"  Divide  value : " );

				int val=Integer.parseInt(input.nextLine());
				
				int divideval=a/val;
				
				System.out.println(a+ " Divide "+ val + " =" + divideval);
				
				
				System.out.println(" === >>>. Second example  ==>>	Enter Value");
				int b=Integer.parseInt(input.nextLine());
				int c= 5;
				int d=5;
				int x= b / (c-d);
				
				
			
			
			
		}catch(ArithmeticException e)
		{
		  System.out.println(e);	
		}
			catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("NumberFormatException");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
