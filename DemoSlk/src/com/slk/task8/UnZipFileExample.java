package com.slk.task8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipFileExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String zipFilePath = "/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/projectPath/projectPath.zip";
		String destDir ="/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/UnZipFile";
		
		unZipFile(zipFilePath ,destDir);
	}

	private static void unZipFile(String zipFilePath , String destDir )
	{
		File dir= new File(destDir);
		// create output directory if it doesn't exist
		if(!dir.exists())
		{
			dir.mkdirs();
		}
		
		   //buffer for read and write data to file
		try {
			FileInputStream fileInputStream = new FileInputStream(zipFilePath);
			
			byte[] buffer = new byte[1024];
			ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
			ZipEntry zipEntry = zipInputStream.getNextEntry();
			
			while (zipEntry !=null) {
				String fileName = zipEntry.getName();
				System.out.println( "test File Name : " + fileName);
				
				
				File newfile = new File(destDir +  File.separator + fileName);
				System.out.println( " Unzip to : " +newfile.getAbsolutePath() );
				
				  //create directories for sub directories in zip 
				new File(newfile.getParent()).mkdirs();
				FileOutputStream fileOutputStream = new FileOutputStream (newfile);
				
				int len;
				while ((len =zipInputStream.read(buffer))>0) {
					fileOutputStream.write(buffer, 0, len);
					
				}
				
				fileOutputStream.close();
				zipInputStream.closeEntry();
				zipEntry =zipInputStream.getNextEntry();
				
			}
			zipInputStream.closeEntry();
			zipInputStream.close();
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
