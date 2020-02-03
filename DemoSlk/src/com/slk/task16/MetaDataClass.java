package com.slk.task16;

import java.io.Serializable;
import java.lang.reflect.Modifier;

public abstract class MetaDataClass implements Serializable,Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<MetaDataClass> mClass = MetaDataClass.class;
		System.out.println("Name Of Class is : " + mClass.getName());
		
		System.out.println("Name Of Class : " + mClass.getSimpleName() );
		
	
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("Super Class Name  : " + mClass.getSuperclass().getName());
		
		System.out.println("--------------------------------------------------------------------------------");
		Class [] classesList = mClass.getInterfaces();
		
		System.out.println("Implemented Interface are : ");
		
		for (Class class1 : classesList) {
			System.out.println(class1.getName() + "  ");
		}
		System.out.println();
	
		
		System.out.println("--------------------------------------------------------------------------------");
		
		
		int accessModifier = mClass.getModifiers();
		System.out.println("AccessModifier : "+ Modifier.toString(accessModifier));
	}

}
