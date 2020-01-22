package com.slk.task6;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ConvertFileToByteArray {

	
	public static void convertFileToByteArray() throws IOException
	{
		String path= System.getProperty("user.dir") +"/new.txt";
		System.out.println(path);

		byte[] encode = Files.readAllBytes(Paths.get(path));
		
		System.out.println("test : " +Arrays.toString(encode));
	}
	public static void convertByteArrayToFile() throws IOException
	{
		String path= System.getProperty("user.dir") +"/new.txt";
		String path1= System.getProperty("user.dir") +"/new1.txt";
		
		
		byte[] encode= Files.readAllBytes(Paths.get(path));
		System.out.println("test 2: " +encode);
		Files.write(Paths.get(path1), encode);
		
		File f = new File(path1);
		FileReader f1 = new FileReader(f);
		int i = -1;
		while ((i = f1.read()) != -1) {
			System.out.println((char)i);
			
		}
		
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		convertFileToByteArray();
		convertByteArrayToFile();
	
		
	}

}
