package com.slk.task8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFolder {

	
	List<String>  fileList = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("uv.txt");
		String zipFileName = "demo.zip";
		
		File dir = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/projectPath");
		String zipDirName = "/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/projectPath/projectPath.zip";
		
		//zipSingleFile(file, zipFileName);
		
		ZipFolder zipFolder  = new ZipFolder();
		zipFolder.zipDirectory(dir, zipDirName);
		
		
		
	}
	
	
	private  void zipDirectory(File dir ,String zipDirName)
	{
		try {
			populateFilesList(dir);
		
			FileOutputStream fileOutputStream = new FileOutputStream(zipDirName);
			ZipOutputStream  zipOutputStream =new ZipOutputStream(fileOutputStream);
			
			for(String filePath: fileList)
			{
				
				ZipEntry entry = new ZipEntry(filePath.substring(dir.getAbsolutePath().length()+1,filePath.length()));
				
				zipOutputStream.putNextEntry(entry);
				FileInputStream fileInputStream = new FileInputStream(filePath);
				byte []  buff = new byte[1024];
				int len;
				while((len =fileInputStream.read(buff))>0)
				{
					zipOutputStream.write(buff, 0, len);
					
					//System.out.println((char)len);
				}
				
				zipOutputStream.closeEntry();
				zipOutputStream.close();
				fileInputStream.close();
				fileOutputStream.close();
				System.out.println( "test Zipping : " + filePath);
			}
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private  void populateFilesList(File dir)throws IOException
	{
		File[] files =dir.listFiles();
		for(File file :  files)
		{
			 if(file.isFile()) 
			 {
				 fileList.add(file.getAbsolutePath());
			 }
			  else
			  {
				  populateFilesList(file);
			  }
		}
	//	System.out.println("Test File List : " + fileList);
	}
	private static void zipSingleFile(File file,String zipFileName)
	{
		try {
				FileOutputStream fileOutputStream = new FileOutputStream(zipFileName);
				ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
				
				ZipEntry zipEntry = new ZipEntry(file.getName());
				//System.out.println("test : " + file.getAbsolutePath());
				
				zipOutputStream.putNextEntry(zipEntry);
				
				FileInputStream fileInputStream = new FileInputStream(file);
				byte[] buffer = new byte[1024];
				int len;
				while ((len = fileInputStream.read(buffer))>0) {
					zipOutputStream.write(buffer, 0, len);
					System.out.println("Compress File in Zip Format ...................");
				}
				zipOutputStream.closeEntry();
				zipOutputStream.close();
				fileInputStream.close();	
				
				fileOutputStream.close();
				System.out.println( "   " + file.getCanonicalPath()+ " is zipped  to :  " + zipFileName);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
