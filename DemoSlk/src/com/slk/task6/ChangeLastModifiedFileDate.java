package com.slk.task6;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class ChangeLastModifiedFileDate {
	public static final String path = "";
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk//DemoSlk/countline.txt");
		file.createNewFile();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Original Last Modified DATE : " + simpleDateFormat.format(file.lastModified()));
		
		String changeDate ="01/31/2020";
		
		Date newDate;
		try {
			
			newDate = simpleDateFormat.parse(changeDate);
			file.setLastModified(newDate.getTime());
			System.out.println("Latest Modified date : " + simpleDateFormat.format(file.lastModified()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
