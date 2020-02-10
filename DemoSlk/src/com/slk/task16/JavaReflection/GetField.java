package com.slk.task16.JavaReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetField {

	public static int id= 11144555;
	
	static int id2 =44444;
	
	static String name ="hello.com";
	static String name2="Hey Java ";
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		GetField getFieldObj= new GetField();
		Class classobj = getFieldObj.getClass();
		
		
		Field [] fields = classobj.getDeclaredFields();
		
		for (Field field : fields) {
			
			System.out.println("Get Field Name : " + field.getName());
			
			System.out.println("Data Type Of Variable : " + field.getType());
			
			
			int fieldAccessModifier= field.getModifiers();
			System.out.println("Access Modifier of the Variables :"+Modifier.toString(fieldAccessModifier));
			
			
			System.out.println("Get Value of the variable :" + field.get(field));
			
			System.out.println();
			
			System.out.println("------------------------------------------------------------------------");
		}
		
		
		
	}

}
