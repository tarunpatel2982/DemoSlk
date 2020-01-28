package com.slk.task10;

import java.io.File;

public class DeleteDirectory  {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String secFolder = "deletederectory" ;
		
		File directory = new File(secFolder);
		
		System.out.println("Check Path  : " + directory.getAbsolutePath());
		
		if(!directory.exists())
		{
			System.out.println("Directory not exists...");
			System.exit(0);
		}
		else
		{
			try {
				
				delete(directory);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	private static void delete(File file) {
		// TODO Auto-generated method stub
		if(file.isDirectory())
		{
			
			System.out.println("Check Size  : " + file.list().length);
			if(file.list().length==0)
			{
				file.delete();
				System.out.println("Derectory is Deleted : " + file.getAbsolutePath());
			}
			else
			{
				String []files =file.list();
				for (String temp : files) {
					File fileDelete =new File(file, temp);
					
					//recursive delete
					
					delete(fileDelete);
				}
				
				//check the directory is it,then directory is empty then delete it
				
				
				if(file.list().length==0)
				{
					file.delete();
					System.out.println("Directory is Deleted : " + file.getAbsolutePath());
				}
				
			}
		}
		else
		{
			file.delete();
			System.out.println("File Is Deleted : " + file.getAbsolutePath());
		}
		
		
	}

}
