package com.slk.task6;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Path p = Paths.get("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/asd.txt");

			Files.delete(p);
			
			

		} catch (NoSuchFileException e1) {
			e1.getMessage();
			System.out.println("...................NoSuchFileException ......................");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (DirectoryNotEmptyException e2) {

			System.out.println("...........DirectoryNotEmptyException.............");
			e2.getMessage();
			e2.printStackTrace();

		} catch (IOException e) {
			System.out.println("...............IOException ..................");
			e.getMessage();
			e.getMessage();
		}
	}

}
