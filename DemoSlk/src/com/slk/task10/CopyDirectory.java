package com.slk.task10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File srcFolder = new  File("emptyDirectory");
		
		File destFolder = new File("UnZipFile");
		
		if(!srcFolder.exists())
		{
			
			System.out.println("Directory Not Exists : ");
			
		}else
		{
			try {
				
				
				copyFolder(srcFolder ,destFolder);
				
				
			} catch (Exception e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
		}
		System.out.println("Done ");
		
	}

	private static void copyFolder(File srcFolder, File destFolder) {
		// TODO Auto-generated method stub
		
		if(srcFolder.isDirectory())
		{
		
			if(!destFolder.exists())
			{
				destFolder.mkdir();
				System.out.println("Directory Copied From :" + srcFolder + "  to  " + destFolder);
				
			}
			else
			{
				//list all directory content
				
				String []files = srcFolder.list();
				
				for(String file:files)
				{
					File srcFile=  new File(srcFolder,file);
					File destFile = new File(destFolder , file);
//					System.out.println("test : " + srcFolder);
//					System.out.println("test 	: " + destFolder);
//					System.out.println("path    " + destFile);
					copyFolder(srcFile, destFile);
				}
			}
			
		}
		else
		{
			try {
				FileInputStream fileInputStream = new FileInputStream(srcFolder);
				
				FileOutputStream fileOutputStream = new FileOutputStream(destFolder);
				
				byte [] buffer = new byte[1024];
				int len;
				//copy the file content in bytes
				
				while ((len=fileInputStream.read(buffer))>0){
					fileOutputStream.write(buffer,0,len);
				}
				fileInputStream.close();
				fileOutputStream.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
