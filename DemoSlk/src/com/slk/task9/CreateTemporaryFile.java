package com.slk.task9;

import java.io.File;

public class CreateTemporaryFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
	
			
			File temp =  File.createTempFile ("tempFile",".tmp");
			System.out.println( "temp  File : " + temp.getAbsolutePath());
		
		} catch (Exception e) {
		
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
