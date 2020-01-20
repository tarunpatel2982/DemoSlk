package com.slk.task6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStream {

	public static void writeInBuffer() throws FileNotFoundException,IOException
	{
		FileOutputStream fileOutputStream =new FileOutputStream(new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new1.txt"));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		String s = "Hey Hello java................";
		byte b[]=s.getBytes();
		bufferedOutputStream.write(b);
		bufferedOutputStream.flush();
	}
	public static void fileOutPutStreamWriterClass() throws FileNotFoundException,IOException
	{
		FileOutputStream fileOutputStream =new FileOutputStream(new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new1.txt"));
		String s = "Hello Tarun Patel " ; 
		
		byte b[]=s.getBytes();
		fileOutputStream.write(b);
		fileOutputStream.flush();
		
		
	}
	public static void witerByte() throws FileNotFoundException,IOException
	{
		FileOutputStream fileOutputStream =new FileOutputStream(new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new1.txt"));
		fileOutputStream.write(65);
		fileOutputStream.close();
		System.out.println("Done");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			writeInBuffer();
			//fileOutPutStreamWriterClass();
			witerByte();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
