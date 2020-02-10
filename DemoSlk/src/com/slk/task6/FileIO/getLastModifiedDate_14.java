package com.slk.task6.FileIO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class getLastModifiedDate_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/append.txt");
		System.out.println( " last modified file date  : " + file.lastModified());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY HH:mm:ss");
		System.out.println("Last modified File  Format : " + simpleDateFormat.format(file.lastModified()) );
	}

}
