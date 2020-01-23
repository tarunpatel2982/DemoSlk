package com.slk.task6;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadWithBufferedInputStreeam_4 {
	
	public static void fileInputStreamExample() throws IOException
	{
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new.txt");
		FileInputStream inputStream = new FileInputStream(file);
		
		int a;
		while ((a= inputStream.read()) !=-1) {
			System.out.print((char) a);
			//inputStream.close();
		}
	}
	
	public static void fileReadBufferReadInputStreeam()
	{
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new.txt");
		
		FileInputStream fileInputStream = null;
		
		BufferedInputStream  bufferedInputStream = null;
		
		try {
			fileInputStream= new FileInputStream(file);
			
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			try {
				
				while (bufferedInputStream.available()>0) {
					System.out.print((char)bufferedInputStream.read());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				//System.in.available();
				fileInputStream.close();
				bufferedInputStream.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fileInputStreamExample();
//		fileReadBufferReadInputStreeam();
	}

}
