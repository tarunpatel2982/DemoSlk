package com.slk.task6;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {

	public static void createFileMethod() throws IOException
	{
		String pathname= "E://MCA-6//new.txt";
		File file = new File(pathname);
		if(file.createNewFile())
		{
			System.out.println("File Is Create  : " + file.getName());
		}
		else
		{
			System.out.println("File Alrady Exist " );
		}
	}
	public static void setFilePermission() throws IOException
	{
		String pathname= "E://MCA-6//new.txt";
		File file = new File(pathname);
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

		createFileMethod();
		setFilePermission();
	}

}
