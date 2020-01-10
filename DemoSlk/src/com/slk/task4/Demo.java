package com.slk.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Demo  {

	public static void readFile() throws IOException,FileNotFoundException
	{
		//FileReader file = new FileReader("/home/SLKTECHLABS/tarun.patel/eclipse-workspace/tarun.txt" );
		//FileReader file = new FileReader("/home/SLKTECHLABS/tarun.patel" );
		
		
		//System.out.println(file);
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(	inputStreamReader);
		
		String st ="fkXj";

		//for loop using buffer reader 
		
//		for (st = bufferedReader.readLine();st != null;st =bufferedReader.readLine())
//		{
//			System.out.println(st);
//		}
//		
//		
//		
		//while loop short method read file using buffer reader 
		while (!st.equals("stop")) {
			
			System.out.println("Enter data");
			st = bufferedReader.readLine();
			System.out.println(st);
		}
		//While loop using buffer reader 
		//		while (st != null)
//		{
//			System.out.println(st);
//			
//			st= bufferedReader.readLine();
//		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Demo.readFile();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e	);
		}
	}

}
