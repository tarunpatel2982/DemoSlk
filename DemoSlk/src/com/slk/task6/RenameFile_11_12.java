package com.slk.task6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class RenameFile_11_12 {

	public static void renameFileExample() throws IOException
	{
		File oldFile= new File("newFile.txt");
		//oldFile.createNewFile();
		File newFile= new File("oldFile.txt");
		
		if(oldFile.renameTo(newFile))
		{
			System.out.println("Rename file : " + newFile.getName());
		}
		else
		{
			System.out.println("this file Not Rename : " + oldFile.getName());
		}
	}
	
	public static void copyFileExample() throws IOException
	{
		File aFile= new File("aFile.txt");
		aFile.createNewFile();
		File bFile= new File("bFile.txt");
		bFile.createNewFile();
		
		InputStream fileInputStream = new FileInputStream(aFile);
		OutputStream outputStream = new FileOutputStream(bFile);
		
		byte []buffer = new byte[1024];
		
		int length;
		while ((length = fileInputStream.read(buffer))> 0) {
			outputStream.write(buffer, 0,length);
			
		}
		fileInputStream.close();
		outputStream.close();
		
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("bFile.txt"));
		
		String red;
		while ((red = bufferedReader.readLine())!= null) {
			System.out.println("File name: " + bFile.getName());
			System.out.println("Print  : " + red);
			
		}
		
		
	}
	public static void moveFileAnothrDirectory()throws IOException
	{
		File file= new File("Move.txt");
		
		file.createNewFile();
		
		if(file.renameTo(new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/projectPath/" + file.getName())));
		{
			System.out.println("File Moved ");
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubs

//		renameFileExample();
		copyFileExample();
		moveFileAnothrDirectory();
	}

}
