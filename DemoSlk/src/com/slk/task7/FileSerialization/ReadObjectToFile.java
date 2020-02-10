package com.slk.task7.FileSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class ReadObjectToFile {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private final static String filepath ="";
		
		ReadObjectToFile readObjectToFile = new ReadObjectToFile();
		Person adress =readObjectToFile.deserilizationObject("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/uv.txt");
		System.out.println("getName  :  " + adress.getName());
		System.out.println("getAge :  " + adress.getAge());
	}
	
	public Person deserilizationObject(String filepath )
	{
		
		Person person = null;
	
		try {
			
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filepath));
			
			person= (Person )objectInputStream.readObject();
				objectInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}
	

}
