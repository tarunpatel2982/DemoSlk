package com.slk.task10.Directory;

import java.io.File;

public class CheckDirectoryIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		File file = new File("emptyDirectory");
		if(file.isDirectory())
		{
			
			if(file.list().length==0)
			{
				System.out.println("Directory Is empty ...... ");
				
			}
			else
			{
				System.out.println("Directory is not Empty");
			}
		}
		else
		{
			System.out.println("This Is a Not A Directory ");
		}
	}

}
