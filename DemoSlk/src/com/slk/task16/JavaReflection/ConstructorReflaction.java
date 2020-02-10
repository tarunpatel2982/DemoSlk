package com.slk.task16.JavaReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.rmi.RemoteException;
import java.sql.SQLException;

public class ConstructorReflaction {

	
	public ConstructorReflaction(int no ) throws ClassCastException,ArithmeticException
	{ 
		
	}
	
	public ConstructorReflaction(int no , String Name  )throws RemoteException ,SQLException
	{ 
		
	}
	
	public ConstructorReflaction(int no, String Name  ,String Adress ) throws InterruptedException
	{ 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class conObj = ConstructorReflaction.class;
		
		Constructor[]  conList  = conObj.getConstructors();
		
		
		for (Constructor constructor : conList) {
			System.out.println("Get Constructor Name  : " + constructor.getName());
			
			
			
			
			int accessModifier  = constructor.getModifiers();
			System.out.println(" Get AccessModifier : " + Modifier.toString(accessModifier));
			
			
			Class [] paraList = constructor.getParameterTypes();
			System.out.println("Parametter List ");
			
			for (Class  constructor2 : paraList) {
				
				System.out.println(" " + constructor2.getName() );
			}
			
			
			
			Class [] exceptionList = constructor.getExceptionTypes();
			System.out.println("Exception  List ");
			
			for (Class  constructor3 : exceptionList) {
				
				System.out.println(" " + constructor3.getName() );
			}
			System.out.println();
			
			System.out.println(".............................................................................");
		}
	}

}
