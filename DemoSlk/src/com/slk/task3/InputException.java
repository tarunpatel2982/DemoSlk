package com.slk.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner input = new Scanner(System.in);
		    while (true) {
		        System.out.println("Insert amount:");
		        try {
		             input.nextDouble();
		        }
		        catch (InputMismatchException e) {
		        	System.out.println(e);
		            input.nextLine();
		        }
		    }

	}

}
