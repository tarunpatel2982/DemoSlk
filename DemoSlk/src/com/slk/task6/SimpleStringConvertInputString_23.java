package com.slk.task6;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class SimpleStringConvertInputString_23 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String s= "Hello I am tarun Patel";
		InputStream inputStream = new ByteArrayInputStream(s.getBytes());
		System.out.println("Convert String :===>>> " + inputStream);
		
//		byte[] buffer= new byte[inputStream.available()];
//		System.out.println(buffer);
//		
//		System.out.println("test : " + Arrays.toString(buffer));
		DataInputStream dataInputStream = new DataInputStream(inputStream);
		byte[] buffer= new byte[inputStream.available()];
		dataInputStream.readFully(buffer);
		String s1 = new String(buffer , 0 , buffer.length);
		System.out.println(s1);

	}

}
