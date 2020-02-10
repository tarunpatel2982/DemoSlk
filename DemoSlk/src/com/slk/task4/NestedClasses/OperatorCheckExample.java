package com.slk.task4.NestedClasses;

import java.util.Scanner;

public class OperatorCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Two Value Of Check Operator ");
		System.out.println("Enter First Value :");
		Scanner sc = new Scanner(System.in);
		int firstValue= sc.nextInt();
		
		System.out.println("Enter First Value :");
		int secondValue= sc.nextInt();
		
		System.out.println("1. <=");

		System.out.println("2. >=");

		System.out.println("3. <");

		System.out.println("4. >");
		
		System.out.println("Chose Oprator ");
		
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
				if(firstValue <= secondValue)
				{
					System.out.println("true <=");
					
				}
				else
				{
					System.out.println("false <=");
					
				}
			
			break;

		case 2:
			if(firstValue >= secondValue)
			{
				System.out.println("true >=");
				
			}
			else
			{
				System.out.println("false >=");
				
			}
		
		break;
		case 3:
			if(firstValue < secondValue)
			{
				System.out.println("true <");
				
			}
			else
			{
				System.out.println("false <");
				
			}
		
		break;
		case 4:
			if(firstValue > secondValue)
			{
				System.out.println("true >");
				
			}
			else
			{
				System.out.println("false >");
				
			}
		
		break;
		
		}
		
	}

}
