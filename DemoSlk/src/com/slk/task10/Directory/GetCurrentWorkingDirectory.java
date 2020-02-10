package com.slk.task10.Directory;

import java.nio.file.Paths;

public class GetCurrentWorkingDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Cureent Working Directory  is  : "+System.getProperty("user.dir"));
		
		
		System.out.println("JAVA 7 :  "+ Paths.get("").toAbsolutePath().toString());
		
	}

}
