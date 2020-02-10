package com.slk.task6.FileIO;

import java.io.File;
import java.io.IOException;

public class CreateFile1_And_3 {

	public static void createFileMethod() throws IOException
	{
		String pathname= "/home/SLKTECHLABS/tarun.patel/tarun.txt";
		File file = new File(pathname);
	
		if(file.createNewFile())
		{
			System.out.println("File Is Create  : " + file.getName());
		}
		else
		{
			System.out.println(	file.getName()   +" File Alrady Exist " );
		}
	}
	public static void setFilePermission() throws IOException
	{
		String pathname= "/home/SLKTECHLABS/tarun.patel/xyz.txt";
		File file = new File(pathname);
		file.createNewFile();
		boolean exists= file.exists();
		if(exists == true)
		{
			file.setExecutable(true);
			file.setReadable(true);
			file.setWritable(false);
			System.out.println("Permission Changed");
			
			System.out.println("Executable  " + file.canExecute());
			System.out.println("Read  " + file.canRead());
			System.out.println("Write  " + file.canWrite());
		}
		else
		{
			System.out.println("File not Found " );
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//createFileMethod();
		setFilePermission();
	}

}
