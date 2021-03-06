package com.slk.task6.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWithBufferReader_5 {
	
	public static void fileReaderExample()
	{
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new.txt");
		
		try {
			FileReader fileReader = new FileReader(file);
			
			System.out.println("...................................File Reader Example ..............................................................");
			int s ;
			while ((s = fileReader.read())!= -1) {
				
				System.out.print(" " + (char)s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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

		fileReaderExample();
//			bufferReaderExample();
//			readLineMethod();
//			readyMthod();	
	}

}
