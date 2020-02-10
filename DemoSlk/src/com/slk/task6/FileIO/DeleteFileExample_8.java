package com.slk.task6.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteFileExample_8 {
	public static void deleteFile()
	{
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/app.txt");
		if(file.delete())
		{
			System.out.println("File is Deleted   :" + file.getName());
			
		}
		else
		{
			System.out.println("File Not Found : " + file.getName());
		}
	}

	public static void cerateFile()throws IOException
	{
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/app.txt");
		if(file.createNewFile())
		{
			System.out.println("File is Created " + file.getName());
		}
		else
		{
			System.out.println("File Already Exist");
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		deleteFile();
		cerateFile();

	}

}
