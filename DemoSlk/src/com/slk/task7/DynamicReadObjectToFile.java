package com.slk.task7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DynamicReadObjectToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DynamicReadObjectToFile dynamicReadObjectToFile = new DynamicReadObjectToFile();
		ArrayList<Person2> person2 = dynamicReadObjectToFile.deserlizePerson("uv.txt");
		
		System.out.println("Person Name : " + person2);
		
	}

	public ArrayList<Person2> deserlizePerson(String fileName)
	{
		ArrayList<Person2> person2 = null;
		
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
			
			person2 = (ArrayList<Person2>)objectInputStream.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return person2;
	}
}
