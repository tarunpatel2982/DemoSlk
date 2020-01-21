package com.slk.task6;

import java.io.File;

public class FindFileCertainExtensionOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String workingdirectory = "/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/deletefile/" ;
		String findExtension =".txt";
		
		FileFilter fileFilter = new FileFilter(findExtension);
		File fileDirecory = new File(workingdirectory);
		String [] listofFile = fileDirecory.list(fileFilter);
		
		if(listofFile.length == 0 ) 
		{
			System.out.println("Not File in this Directory : " + workingdirectory);
			
			return;
		}

		for(String file: listofFile)
		{
			String displayfile = new StringBuffer(file).toString();
			System.out.println( " File name : " +  displayfile);
			
		}
	}

}
