package com.slk.task8.FileCompression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class FileCompressExample_1 {

	public static void fileCompressDefletar() {
		
		try {
			 
			//DeflaterOutputStream
//			File file = new File("Deflater.java");
//			file.createNewFile();
			FileInputStream readData = new FileInputStream("Deflater.java");
			
			FileOutputStream writeData= new FileOutputStream("l.txt");
			
			DeflaterOutputStream compresser = new DeflaterOutputStream(writeData);
			 
			 
			int i;
			while ((i=readData.read())!=-1) {
				compresser.write((byte)i);
				compresser.flush();
			}
			readData.close();
			compresser.close();
			System.out.println("Sucess");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void fileCompressInflater()
	{
		
		try {
			
			FileInputStream readData = new FileInputStream("l.txt");
			
			
			InflaterInputStream deCompresser = new InflaterInputStream(readData);
			File file = new File("demo.java");
			//file.createNewFile();
			FileOutputStream writeData = new FileOutputStream(file);
			

			int j ;
			
			while ((j=deCompresser.read())!=-1) {
			
				
				writeData.write((byte)j);
				
				writeData.flush();
			}
			
			//readData.close();
			writeData.close();
			deCompresser.close();
			
			System.out.println("Done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("Check " + e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		fileCompressDefletar();
		fileCompressInflater();
	}

}
