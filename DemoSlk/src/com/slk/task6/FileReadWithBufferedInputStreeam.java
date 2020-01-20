package com.slk.task6;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadWithBufferedInputStreeam {
	
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
				
				fileInputStream.close();
				bufferedInputStream.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileReadBufferReadInputStreeam();
	}

}
