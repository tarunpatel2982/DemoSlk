package com.slk.task6;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHiddenExample {

	
	public static void makeHiddenFile() throws IOException
	{
		String pathname= "tarun1.txt";
		File file = new File(pathname);
		//file.createNewFile();
		Path path = FileSystems.getDefault().getPath(pathname);
		
		Files.setAttribute(path, "dos:hidden", true);
		System.out.println(file.getAbsolutePath());
		
		
		boolean check = file.isHidden();
		System.out.println(" test " + file.isHidden());
		if(check)
		{
			System.out.println("File Hidden : " + file);
		}else
		{
			System.out.println("File not Hidden : " + file);
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		makeHiddenFile();
	}

}
