package com.slk.task6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample_5 {
	
	public static void bufferReaderExample() throws IOException
	{
		System.out.println("----------------------Simple BufferReader Example----------------------   ");
		
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		int i;
		while((i = bufferedReader.read())!=-1)
		{
			System.out.print((char)i );
		}
	}
	
	public static void readLineMethod() throws FileNotFoundException,IOException
	{
		System.out.println("----------------------Read Line Methyod Using BufferReader ---------------------- ");
		String thisLine= null;
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while((thisLine = bufferedReader.readLine())!=null)
		{
			System.out.println(thisLine);
		}
		
	}
	public static void readyMthod() throws FileNotFoundException,IOException
	{
		System.out.println("----------------------Ready() Method ---------------------- ");
		
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.println(bufferedReader.ready());
		while(bufferedReader.ready())
		{
			bufferedReader.skip(3);
			System.out.println(""+ bufferedReader.readLine());
		}
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			bufferReaderExample();
			readLineMethod();
			readyMthod();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
