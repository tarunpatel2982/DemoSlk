package com.slk.task7.FileSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DaynamicWriteObjectInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Person2 person2 = new Person2();
		
		ArrayList<Person2> list = new ArrayList<Person2>();
		
		list.add(new Person2("Tarun " , 10));
		list.add(new Person2("lalu " , 15));
		//System.out.println(list);
		DaynamicWriteObjectInFile daynamicWriteObjectInFile = new DaynamicWriteObjectInFile();
		daynamicWriteObjectInFile.seralizationPerson(list);
		
	}
	
	public void seralizationPerson(ArrayList<Person2> list  )
	{
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("uv.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(list);
			objectOutputStream.close();
			
		
		System.out.println("Successfully Write .............................");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
