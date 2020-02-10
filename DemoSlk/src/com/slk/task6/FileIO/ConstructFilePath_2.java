package com.slk.task6.FileIO;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class ConstructFilePath_2 {

	public static void fileSepratorNotUsedIt()
	{

		String fileName= "new.txt";
		String createFilePath ="";
			
		String userHomeDirectory= System.getProperty("user.dir");
		System.out.println("Display User Home Directory :   "+userHomeDirectory);
		
		String userOperatingSystem = System.getProperty("os.name").toLowerCase();
		String userOperatingSystem1 = System.getProperty("os.name").toUpperCase();
		
		System.out.println("OS name  to LowerCase  : " +userOperatingSystem);

		System.out.println("OS name  to UpperCase  : " +userOperatingSystem1);
		
		if(userOperatingSystem.contains("linux"))
		{
			createFilePath =userHomeDirectory + "/" + fileName; 
		}
		else {
			createFilePath = userHomeDirectory +"{smth_else}" + fileName;
		}
		System.out.println("File Path to Created :" +createFilePath);
		
		
		
		File file = new File(createFilePath);
		try {
			if(file.createNewFile())
			{
				System.out.println("New File Create In user Directory : "  );
			}
			else
			{
				System.out.println("File Already Exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void usingFileSreprator()
	{
		System.out.println("----------------------------------------------usingFileSreprator key ----------------------------------------------- ");
		String fileName= "new1.txt";
		String createFilePath ="";
			
		String userHomeDirectory= System.getProperty("user.dir");
		System.out.println("Display User Home Directory :   "+userHomeDirectory);
		
		String userOperatingSystem = System.getProperty("os.name").toLowerCase();
			
		if(userOperatingSystem.contains("linux"))
		{
			createFilePath =userHomeDirectory + File.separator + fileName; 
		}
		else {
			createFilePath = userHomeDirectory +"{smth_else}" + fileName;
		}
		System.out.println("File Path to Created :" +createFilePath);
		
		
		
		File file = new File(createFilePath);
		try {
			if(file.createNewFile())
			{
				System.out.println("New File Create In user Directory : "  );
			}
			else
			{
				System.out.println("File Already Exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileSepratorNotUsedIt();
		usingFileSreprator();
	}

}
