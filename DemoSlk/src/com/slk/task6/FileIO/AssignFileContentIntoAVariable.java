package com.slk.task6.FileIO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AssignFileContentIntoAVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fileDir = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/utf8.txt");
		
		try {
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileDir));
			
			byte[] dataBytes =new byte[dataInputStream.available()];
			dataInputStream.readFully(dataBytes);
			dataInputStream.close();
			
			String coString = new String(dataBytes , 0 ,dataBytes.length);
			System.out.println(coString);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
