package com.slk.task9.TemporaryFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritedataTempFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File writeData= File.createTempFile("writeDataTempFile",".tmp");
			
			
			System.out.println( "File name : " + writeData.getAbsolutePath());
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeData));
			
			bufferedWriter.write("HeY temporary File Created ....");
			
			bufferedWriter.close();
			
			
			System.out.println("Successfully Write data" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
