package com.slk.task7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class WriteAnObjectToFile_1 {

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Person person =new Person();
		person.setName("tarun");
		person.setAge(25);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Create value of create object :");
//		int val = scanner.nextInt();
//		Adress adress =null;
//		for(int i=1;i<=val;i++)
//		{
//			System.out.println("Enter Name Of Person : ");
//			 String name = scanner.next();
//			System.out.println("Enter Person Age : ");
//			int age = scanner.nextInt();
//			adress = new Adress(name,age) ;
//		}
		
	
		
		System.out.println();
		//for(int i=0;i<)
		
		WriteAnObjectToFile_1 writeAnObjectToFile_1 = new WriteAnObjectToFile_1();

		writeAnObjectToFile_1.serializeAdress(person);
		
	}
	
	private final static String filepath ="/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/uv.txt";
	public void serializeAdress(Person adress) 
	{
		
		
		
		ObjectOutputStream objectOutputStream;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(filepath));
			
			objectOutputStream.writeObject(adress);
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Successfully  Write Object in file");
		
		
		
	}

}
 