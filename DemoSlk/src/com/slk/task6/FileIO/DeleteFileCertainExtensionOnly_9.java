package com.slk.task6.FileIO;

import java.io.File;
import java.io.IOException;

public class DeleteFileCertainExtensionOnly_9 {

	public static void cerateFile() throws IOException
	{
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/deletefile/tarun.txt");
		File file1 = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/deletefile/tarun1.txt");
		File file2 = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/deletefile/tarun2.txt");
		File file3 = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/deletefile/tarun3.jpg");
		
		file.createNewFile();
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		
	}
	public static void deleteTextFile() throws IOException
	{
		
		String directory="/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/deletefile/";
		String deleteExtension=".txt";
		FileFilter f =new FileFilter(deleteExtension);
		File fileDirectory = new File(directory);
		
		String [] listofFile= fileDirectory.list(f);
		
		if(listofFile.length ==0)
		{
			System.out.println("No file in this directory ");
			return;
		}
		
		//System.out.println(File.separator);
		File fileToDelete;
		for(String file11:listofFile)
		{
			String absoluteFilePath= new StringBuffer(directory).append(File.separator).append(file11).toString();
			fileToDelete = new File(absoluteFilePath);
			boolean isDeleted=fileToDelete.delete();
			System.out.println("File : " + absoluteFilePath+ "Was Deleted  : " + isDeleted);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		cerateFile();
		//deleteTextFile();

	}

}
