package com.slk.task6;

import java.io.File;

public class GetFileSize_15 {

	public static long simleCheckFileSize(String fileName)
	{
		File file = new File(fileName);
		
		
		if(!file.exists() && file.isFile())
		{
			System.out.println("File Does Not Exists \n");
			return -1;
		}
		else
		{
			return file.length();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long size=	simleCheckFileSize("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/bFile.txt");
		System.out.println("File Size  : " + size);
		
	}

}
