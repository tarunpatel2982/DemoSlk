package com.slk.task16.JavaReflection;

import java.lang.reflect.Field;

public class CreateDynamicFieldINClass {
	public static void setInstanceValue(final Object classInstance, final String fieldName, final Object newValue)
			throws SecurityException, NoSuchFieldException, ClassNotFoundException, IllegalArgumentException,
			IllegalAccessException {
		// Get the private field
		final Field field = classInstance.getClass().getDeclaredField(fieldName);
		// Allow modification on the field
		field.setAccessible(true);
		// Sets the field to the new value for this instance
		field.set(classInstance, newValue);

	}

	public static void main(String[] args) throws SecurityException, NoSuchFieldException, ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException {

		// final Field field = (Field)
		// CreateDynamicFieldINClass.setInstanceValue("CreateDynamicFieldINClass",
		// "hi","Hi");

		CreateDynamicFieldINClass kk = new CreateDynamicFieldINClass();

		CreateDynamicFieldINClass.setInstanceValue(kk.getClass(), "One", "hii");

		final Field field = kk.getClass().getDeclaredField("One");

		System.out.println(field.get("One"));

	}

}
