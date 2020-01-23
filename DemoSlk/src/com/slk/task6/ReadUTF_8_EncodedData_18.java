package com.slk.task6;

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
		   
		         String str;
		   
		         while ((str = in.readLine()) != null) {
		             System.out.println(str);
		         }
		   
		                 in.close();
	}

}
