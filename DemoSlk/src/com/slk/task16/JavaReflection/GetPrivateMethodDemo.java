package com.slk.task16.JavaReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetPrivateMethodDemo {

	public void printAllPrivateMethod(Book book) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		Method[] methods = book.getClass().getDeclaredMethods();
		for (Method method : methods) {
			if(Modifier.isPrivate(method.getModifiers()))
			{
				method.setAccessible(true);
				Object[] args =null;
				Object ob = method.invoke(book, args);
				
				
				System.out.println(method.getName() + "   " + ob);
			}
		}
	}
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub

		Book book = new Book("Spring Security", 15, 6);
		GetPrivateMethodDemo ob = new GetPrivateMethodDemo();
		
		//print all private methods and their return value
				ob.printAllPrivateMethod(book);
				System.out.println("-----------------------");
				//print private method return value by method name
	}

}
