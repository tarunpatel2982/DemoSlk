package com.slk.task6;

import java.io.File;
import java.io.IOException;

public class MakeFileReadOnly {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/hello.txt");
		file.createNewFile();
		System.out.println( " ---------------------------------Read Only -------------------------------------------------");
		file.setReadOnly();
		
		
		if(file.canWrite())
		{
			System.out.println("Wirite File");
		}else
		{
			System.out.println("Read Only");
		}
		System.out.println( " ---------------------------------Write Only -------------------------------------------------");
//		file.setWritable(true);
		if(file.canWrite())
		{
			System.out.println("Write only");
		}else
		{
			System.out.println("Read Only"); 
		}

	}

}
