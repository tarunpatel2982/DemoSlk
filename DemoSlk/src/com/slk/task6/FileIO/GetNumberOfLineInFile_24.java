package com.slk.task6.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetNumberOfLineInFile_24 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/countline.txt");
		file.createNewFile();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		int line= 0 ;
		
		while (bufferedReader.readLine()!=null) {
			line++;
			
		}
		System.out.println("Count Line on File : " + line);
		//bufferedReader.close();
	}

}
