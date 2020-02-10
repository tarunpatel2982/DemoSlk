package com.slk.task6.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ReadUTF_8_EncodedData_18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fileDir = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/utf8.txt");
		
		 BufferedReader in = new BufferedReader( new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
		   
		 System.out.println(in);
		         String str;
		   
		         while ((str = in.readLine()) != null) {
		             System.out.println(str);
		         }
		   
		                 in.close();
		                 
		                 
//		                 java.util.Locale हिन्दी = new java.util.Locale("hi", "IN");
//		                 int लंबाई = 20;
//		                 int चौड़ाई = 10;
//		                 int क्षेत्रफल;
//		                 			क्षेत्रफल = लंबाई * चौड़ाई;
//		                 System.out.printf(हिन्दी, " क्षेत्रफल  :     %d", क्षेत्रफल);
	}

}
