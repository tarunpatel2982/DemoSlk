package com.slk.task6.FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IfFileExists_17 {

	public static void isFileExistExample() throws IOException
	{
		File file= new File("tarun1.txt");
		//file.createNewFile();
		
		
		System.out.println("If File Is Exist Or Not  : " + file.exists());
		
	}
	public static void isFileExistMethod2() throws IOException
	{
		final Path path =Files.createTempFile("tarun", ".txt");
		
		System.out.println(" test  : "+ Files.exists(path));
		
		
		System.out.println("test 2 : "+ Files.notExists(path));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		isFileExistExample();
		isFileExistMethod2();
	}

}
