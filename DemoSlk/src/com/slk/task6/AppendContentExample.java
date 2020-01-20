package com.slk.task6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendContentExample {

	public static void appendString(String fileName , String str) throws IOException
	{
		
		BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(fileName ,true));
		bufferedWriter.write(str);
		bufferedWriter.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String fileName = "/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/append.txt";
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
		
		bufferedWriter.write("hello tarun \n");

		bufferedWriter.close();
		
		String str ="New Content Append";
		appendString(fileName, str);
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/append.txt"));
		String myString;
		while ((myString= bufferedReader.readLine())!=null) {
			System.out.println("--  " + myString);
		}
	}

}
