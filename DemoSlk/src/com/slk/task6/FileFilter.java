package com.slk.task6;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter {
	
	private String fileExtension ;
	

	public FileFilter(String fileExtension) {
		
		this.fileExtension = fileExtension;
	}


	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return (name.endsWith(this.fileExtension));
	}

}
