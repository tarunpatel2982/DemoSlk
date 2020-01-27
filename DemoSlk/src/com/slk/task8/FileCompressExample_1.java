package com.slk.task8;

import java.io.BufferedOutputStream;
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
			File file = new File("Deflater.java");
			file.createNewFile();
			FileInputStream readData = new FileInputStream(file);
			
			FileOutputStream writeData= new FileOutputStream("def.txt");
			
			DeflaterOutputStream compresser = new DeflaterOutputStream(writeData);
			 
			 
			int i;
			while ((i=readData.read())!=-1) {
				writeData.write((byte)i);
				writeData.flush();
			}
			readData.close();
			writeData.close();
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
//			File filetext = new File();
//			filetext.createNewFile();
			FileInputStream readData = new FileInputStream("inf.txt");
			
//			File file = new File();
//			file.createNewFile();
			FileOutputStream writeData = new FileOutputStream("Inflater.java");
			InflaterInputStream deCompresser = new InflaterInputStream(readData);
			
			
			int i ; 
			while ((i=deCompresser.read())!=-1) {
				writeData.write((byte)i);
				System.out.println(" test  : " + (byte)i);
				writeData.flush();
			}
			readData.close();
			writeData.close();	
			deCompresser.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	fileCompressDefletar();
		fileCompressInflater();
	}

}
