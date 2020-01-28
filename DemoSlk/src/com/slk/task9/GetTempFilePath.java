package com.slk.task9;

import java.io.File;
import java.io.IOException;

public class GetTempFilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File getTempFilepath =  File.createTempFile("gettempFilePath", ".tmp");

				System.out.println("get Absolute Path : " +getTempFilepath.getAbsolutePath());
				
				
				
				///get  temp file path 
				
				String absolutepath =  getTempFilepath.getAbsolutePath();
				String tempFilePath = absolutepath.substring(0, absolutepath.lastIndexOf(File.separator));
				
				System.out.println("temp File apth : " + tempFilePath);
		 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
