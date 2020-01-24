package com.slk.task6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStringConvertSimpleString_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStream inputStream = new FileInputStream("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/bFile.txt");
			
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			StringBuffer stringBuffer = new StringBuffer();
			String str;
			while ((str =bufferedReader.readLine())!=null) {
				stringBuffer.append(str);
				
			}
			
			System.out.println("conver string  : " + stringBuffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
