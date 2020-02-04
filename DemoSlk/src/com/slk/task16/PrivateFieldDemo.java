package com.slk.task16;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PrivateFieldDemo {

	
	public void printAllPrivateFields(Book book) throws IllegalArgumentException, IllegalAccessException
	{
		Field[] fields = book.getClass().getDeclaredFields();
		for (Field field : fields) {
			if(Modifier.isPrivate(field.getModifiers()))
			{
				field.setAccessible(true);
				System.out.println("  " +  field.getName() +  "  " );
			}
		}
	}
	
	
	public void printFieldValue(Book book, String fieldName) throws NoSuchFieldException, 
	SecurityException, IllegalArgumentException, IllegalAccessException {
	
    Field field = book.getClass().getDeclaredField(fieldName);
        if (Modifier.isPrivate(field.getModifiers())) {
    	field.setAccessible(true);
    	System.out.println(fieldName + " : "+field.get(book));
        }
}
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		Book book = new Book("Core Java", 12, 5);
		PrivateFieldDemo p = new PrivateFieldDemo();
		p.printAllPrivateFields(book);
		System.out.println("----------------------------------------------------------------------------");
		
		p.printFieldValue(book, "bookName");
		
	}

}
