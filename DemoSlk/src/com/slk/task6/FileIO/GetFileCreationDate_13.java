package com.slk.task6.FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

public class GetFileCreationDate_13 {
	
	public static void creationFileDate() throws IOException
	{
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/append.txt");
		Path filepath= file.toPath();
		BasicFileAttributes basicFileAttributes = null;
		basicFileAttributes= Files.readAttributes(filepath, BasicFileAttributes.class);
		
		long milisecond = basicFileAttributes.creationTime().to(TimeUnit.MILLISECONDS);
		
		if((milisecond > Long.MIN_VALUE ) && (milisecond <Long.MAX_VALUE))
		{
			Date creationdate = new Date(basicFileAttributes.creationTime().to(TimeUnit.MILLISECONDS));
			
			 System.out.println("File " + filepath.toString() + " created " +
	                    creationdate.getDate() + "/" +
	                    (creationdate.getMonth() + 1) + "/" +
	                    (creationdate.getYear() + 1900));
		}
	}
		public static void simpleCreationDate() throws IOException
		{
			File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/append.txt");
			Path filePath = file.toPath();
			
			BasicFileAttributes basicFileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);
			Date cDate = new Date(basicFileAttributes.creationTime().to(TimeUnit.MILLISECONDS));
			System.out.println( file.getName()  +"  File Creation Date : "+ cDate);
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY HH:mm:ss");
			System.out.println("Creation File date  : " + simpleDateFormat.format(cDate));
		//	System.out.println( file.getName()  +"  File Creation Time : "+  cDate + "     " + cDate.getHours()+ " " + cDate.getMinutes() + "  " + cDate.getSeconds());
			
			
		}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		creationFileDate();
		simpleCreationDate();
	}

}
