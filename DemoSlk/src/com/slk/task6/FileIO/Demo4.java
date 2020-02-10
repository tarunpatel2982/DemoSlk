package com.slk.task6.FileIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo4 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fileInputStream = new FileInputStream("uv.txt");
			
			
			
			StringBuffer buffer = new StringBuffer();
			String str;
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			while ((str = bufferedReader.readLine())!=null) {
				buffer.append(str);
			}
			System.out.println("test Buffer : " + buffer);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
