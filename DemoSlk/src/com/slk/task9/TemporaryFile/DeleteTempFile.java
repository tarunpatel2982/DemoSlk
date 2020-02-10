package com.slk.task9.TemporaryFile;

import java.io.File;
import java.io.IOException;

public class DeleteTempFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File deleteTempFile = File.createTempFile("deleteFile",".tmp");
			
			System.out.println("Create temp File name : " + deleteTempFile.getAbsolutePath()); 
			
			 deleteTempFile.deleteOnExit();
			System.out.println("Delete temp File :  "  );
//			deleteTempFile.delete();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
