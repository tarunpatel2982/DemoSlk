package com.slk.task6;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class FileHiddenExample_17 {

	
	
	public static String toString(DosFileAttributes dosFileAttributes)
	{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(b)
		return stringBuilder.toString(); 
	}
	public static void makeHiddenFile() throws IOException
	{
		
		String paString = "/home/SLKTECHLABS/tarun.patel/git/DemoSlk/countline.txt";
		File file = new File(paString);
		
		
		
		
		Path filePath = Paths.get("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/countline.txt");
		//System.out.println("Get Path : " + filePath);
		
		
		 DosFileAttributes attr = Files.readAttributes(filePath, DosFileAttributes.class);
		  
	    //  System.out.println(filePath.getFileName() + " Hidden attribute is " + attr.isHidden());
	   
	      Files.setPosixFilePermissions(filePath, true)''
	     // Files.getFileAttributeView(filePath, true,LinkOption.NOFOLLOW_LINKS);
	      //System.out.println("test : " + attr.isHidden());
	  
	      //attr = Files.readAttributes(filePath, DosFileAttributes.class);
          
	      //System.out.println(filePath.getFileName() + " Hidden attribute is " + attr.isHidden());
	      
	      
	      if(file.isHidden())
	      {
	    	  System.out.println("File Hidden");
	      }
	      else
	      {
	    	  System.out.println("File not Hidden");
	      }
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path filePath = Paths.get("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/countline.txt");
		 
		makeHiddenFile();
		
	}

}
//Anonymous