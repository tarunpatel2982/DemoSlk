package com.slk.task8.FileCompression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class CompressAFileInGZIPFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String sourceFilePath ="/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/uv.txt";
//		
//		String destinationZipFilePath="/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/uv.gzip";
//		
//		CompressAFileInGZIPFormat compressAFileInGZIPFormat = new CompressAFileInGZIPFormat();
//		compressAFileInGZIPFormat.gZipFile(sourceFilePath, destinationZipFilePath);
		gZipFile();
		
		
		deCompressGZIPFile();
		
	}
	
	
	public static void gZipFile( )
	{
		byte[] b = new byte[1024];
		try {
			
			FileInputStream fileInputStream = new FileInputStream("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/uv.txt");
			
			FileOutputStream fileOutputStream = new FileOutputStream("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/uv.gz");
			GZIPOutputStream gzipOutputStream = new GZIPOutputStream(fileOutputStream);
			
			
			int byteRead;
			
			while ((byteRead = fileInputStream.read(b))!=-1) {
				gzipOutputStream.write(b,0,byteRead);
				
				//System.out.println((int)byteRead);
			}
			
//			fileInputStream.close();
			gzipOutputStream.finish();
//			gzipOutputStream.close();
			fileOutputStream.close();
			fileInputStream.close();
			
			System.out.println("Success Fully Compressed . ......................");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void deCompressGZIPFile()
	{
		try {
			FileInputStream fileInputStream = new FileInputStream("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/uv.gz");
			
			GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
			
			FileOutputStream fileOutputStream = new FileOutputStream("ungzip.txt");
			byte [] buffer = new byte[1024];
			int len;
			while ((len = gzipInputStream.read(buffer))!=-1) {
				
				fileOutputStream.write(buffer,0,len);
				
			}
			
			fileOutputStream.close();
			gzipInputStream.close();
			fileInputStream.close();
			
			System.out.println("File UnCompressed -------------------------------------");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
