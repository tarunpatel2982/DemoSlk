package com.slk.task6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo2 {

	
	public static void copyFile(String f1 ,String f2)
	{
	
		System.out.println("test file display   " + f1 + "       File  2   " + f2);
		
		
		File file1 = new File(f1);
		
		File file2 = new File(f2);
		
		try {
			file1.createNewFile();
			file2.createNewFile();
			
			
			
			FileInputStream fileInputStream = new FileInputStream(file1);
			FileOutputStream fileOutputStream = new FileOutputStream(file2 ,true);
			byte [] buff=new byte[1024];
			int l;
			while ((l= fileInputStream.read(buff))>0) {
				
				System.out.println("Test Reader : " +(char)l);
				
				fileOutputStream.write(buff, 0, l);
				
			}
			
			
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Create File Value: " );
		
		int  val= sc.nextInt();
		String fileName[] = new String[val];
		
		System.out.println(fileName.length);
		
		System.out.println("Enter  File name");
		String name = sc.nextLine();
		
		for(int i=0;i<val;i++)
		{
			 name = sc.nextLine();
			fileName[i]= name;
			System.out.println(fileName[i]);
		}
		for (String string : fileName) {
			System.out.println("File name : " + string);
		}
		
		for(int j=0;j<val-1;j++)
		{
			System.out.println("test pass file : "+fileName[j]+  "    "+ fileName[j+1]
					);
			copyFile(fileName[j],fileName[j+1]);
		}
		
		
	}

}
