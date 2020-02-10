package com.slk.task4.NestedClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	
	public static void insertData() throws IOException
	{
		StringBuffer stringBuffer = new StringBuffer();
	
		stringBuffer.append("atrun");
		
		stringBuffer.append("uv");
		stringBuffer.append("Lalu");
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/SLKTECHLABS/tarun.patel/tarun.txt"));
		bufferedWriter.write(stringBuffer.toString());
		
		String st = "";
		//bufferedWriter.flush();
		bufferedWriter.close();
		System.out.println("Write File");
		FileReader fileReader = new FileReader("/home/SLKTECHLABS/tarun.patel/tarun.txt");
		BufferedReader  bufferedReader = new BufferedReader(fileReader);
		
		
		for(st = bufferedReader.readLine();st !=null;st = bufferedReader.readLine())
		{
			System.out.println(st);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Demo2.insertData();
		
		
		String s1,s2,s3,s4;
		
		s1 = "Hi";
		
		s2 = s1;
		s3 = new String("Hi");
		s4 = new String(s1);
		
		
		String s111 = "Hi";
		
		System.out.println(s111.hashCode());
		
		String s2222 = new String("Hi");
		
		System.out.println(new String("Hi").hashCode());
		System.out.println(new String("Hi").hashCode());
		System.out.println(new String("Hi").hashCode());
		System.out.println(new String("Hikk").hashCode());
		
		System.out.println(s2222.hashCode());
		
		
		
		System.out.println("s1==s2 : " +(s1==s2));
		System.out.println("s1==s3 : "+(s1==s3));
		System.out.println("s1==s4 : "+(s1==s4));
		System.out.println("-----------------------------------------------");
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		System.out.println("s1.equals(s4) : "+s1.equals(s4));
		
		System.out.println("-----------------------------------------------");
		System.out.println("s3 == s1 : "+(s3 == s1));
		System.out.println("s3.equals(s1) : "+s3.equals(s1));
		
		
		System.out.println("s4 == s3 : "+(s4==s3));
		System.out.println("s4.equals(s3) : "+s4.equals(s3));
		
		
		
	}

}
