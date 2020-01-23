package com.slk.task6;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class FileHiddenExample_17 {

	
	public static void makeHiddenFile(Path filePath) throws IOException
	{
		
		System.out.println("Get Path : " + filePath);
		
		
		  DosFileAttributes attr = Files.readAttributes(filePath, DosFileAttributes.class);
		  
	      System.out.println(filePath.getFileName() + " Hidden attribute is " + attr.isHidden());
	   
	      Files.setAttribute(filePath, "dos:hidden", true);
	  
	      attr = Files.readAttributes(filePath, DosFileAttributes.class);
          
	      System.out.println(filePath.getFileName() + " Hidden attribute is " + attr.isHidden());
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path filePath = Paths.get("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new1.txt");
		 
		makeHiddenFile(filePath);
	}

}
//Anonymous