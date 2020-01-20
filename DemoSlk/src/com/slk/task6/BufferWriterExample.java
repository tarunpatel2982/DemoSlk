package com.slk.task6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {
	
	public static void bufferWriterExample()throws FileNotFoundException,IOException
	{
		FileWriter fileWriter = new FileWriter(new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/new12.txt"));
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("Hello Hey  How are You" );
		bufferedWriter.newLine();
		bufferedWriter.write("Hello Hey  How are You" );
		bufferedWriter.close();
		System.out.println("Done ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			bufferWriterExample();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
