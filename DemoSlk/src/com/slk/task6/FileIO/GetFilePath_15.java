package com.slk.task6.FileIO;

import java.io.File;
import java.io.IOException;

public class GetFilePath_15 {

	
	public static void getAbsuluteFilePath() throws IOException
	{
		System.out.println("---------------------------------------------------getAbsuluteFilePath ----------------------------------");
		File file = new File("tarun.txt");
		
		file.createNewFile();
		
		String path = file.getAbsolutePath();
		System.out.println(" path  : " + path);
		
		String filepath= path.substring(0,path.lastIndexOf(File.separator));
		System.out.println("File Path : " + filepath);
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		getAbsuluteFilePath();
	}

}
