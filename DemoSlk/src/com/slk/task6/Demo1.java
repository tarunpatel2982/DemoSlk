package com.slk.task6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Demo1 {

	public static void copyMultipleFile()
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter the Number Of File Created :");
			int n=Integer.parseInt(bufferedReader.readLine());
			System.out.println("test" + n);
			
			String fileName[] =new String[n];
			System.out.println("Enter File name : ");
			System.out.println("Enter First File name this copy : ");
			for(int i=0;i<n;i++)
			{
				fileName[i]= bufferedReader.readLine();
				System.out.println("Enter File name : ");
				
			}
			
			
			for(int j=0;j<n-1;j++)
			{
				copyFile(fileName[j], fileName[j+1]);
			}
			System.out.println("File copy");
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void copyFile(String sFile,String dFile)
	{
		File file1= new File(sFile);

		File file2= new File(dFile);
		
		
		try {
			file1.createNewFile();
			file2.createNewFile();
			System.out.println("Test file  1 : " + file1.getPath());
			System.out.println("Test file  2 : " + file2.getAbsolutePath());
			InputStream inputStream = new FileInputStream(file1);
			OutputStream outputStream = new FileOutputStream(file2,true);
			
			byte[] buf=new byte[1024];
			int len;	
			while ((len = inputStream.read(buf))> 0) {
				outputStream.write(buf, 0,len);
				
				
			}
			inputStream.close();
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Io " + e.getMessage());
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		copyMultipleFile();
	}

}
