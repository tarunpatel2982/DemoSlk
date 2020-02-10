package com.slk.task10.Directory;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Single Directory
		
		System.out.println("......................... Create Single Directory ...............................");
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/createDirectory");
		
		if(!file.exists())
		{
			if(file.mkdir())
			{
				System.out.println("Create Directory  .....................");
			}
			else

			{
				System.out.println("Not created Directory .........................");
			}
		}
		
		//Create A multiple Directory .......................
		
		System.out.println(".....................Create A multiple Directory .......................");
		System.out.println();
		
		File createMultipleDirectory = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/createDirectory/sub/sub/sub/multiple");
		if(!createMultipleDirectory.exists())
		{
			if(createMultipleDirectory.mkdirs())
			{
				System.out.println("Create Multiple Directories ..............");
			}
			else
			{
				System.out.println("Not Create Multiple Directories ..............");
			}
		}
	}

}
