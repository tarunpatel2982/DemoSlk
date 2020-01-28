package com.slk.task10;

import java.io.File;

public class TravarseDirectoryStructure {

	private static final String src1 = "UnZipFile";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File(src1);
		TravarseDirectoryStructure directoryStructure = new TravarseDirectoryStructure();
		
		directoryStructure.displayIt(file);
	}

	public  void displayIt(File file) {
		
		
		System.out.println(" check  all File : " + file.getAbsoluteFile());
		
		
		if(file.isDirectory())
		{
			File [] files = file.listFiles();
			for (File fileName : files) {
				
				System.out.println("Check File : " + fileName);
				//recursive call
				displayIt(fileName);
			}
		}
		
		
		
	}

}
