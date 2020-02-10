package com.slk.task11.ConsoleIO;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.slk.task3.ExceptionHandling.TryCatch;

public class GetTheStanderdInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		try {
			
			
			 
			while (true) {
				
				System.out.println("Enter Value : ");
				
				String input = br.readLine();
				
				if("hey".equals(input))
				{
					System.out.println("Exit  .....");
					System.exit(0);
				}
				
				System.out.println("Input  " + input);
				
				System.out.println("..............................\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	


}
