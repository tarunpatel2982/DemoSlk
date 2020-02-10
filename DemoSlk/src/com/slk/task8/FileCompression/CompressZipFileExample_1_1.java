package com.slk.task8.FileCompression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressZipFileExample_1_1 {

	public static void fileZip()
	{
		System.out.println("--------------------Zip File -------------------------------");
		byte [] buffer =new byte[1024]; 
		
		
		try {
			
			  
			 FileOutputStream 	fileOutputStream = new FileOutputStream("test.zip");
			ZipOutputStream zipOutputStream= new ZipOutputStream(fileOutputStream);
			ZipEntry zipEntry = new ZipEntry("uv1.txt");
			
			zipOutputStream.putNextEntry(zipEntry);
			
			
		
		
			FileInputStream fileInputStream = new FileInputStream("uv.txt"); 
			int len;
			while ((len =fileInputStream.read(buffer))>0) {
				System.out.println((byte)len);
				zipOutputStream.write(buffer,0,len);
			}
			fileInputStream.close();
			zipOutputStream.closeEntry();
			zipOutputStream.close();
			
			System.out.println("Done .......................");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fileZip();
		
	}	

}
