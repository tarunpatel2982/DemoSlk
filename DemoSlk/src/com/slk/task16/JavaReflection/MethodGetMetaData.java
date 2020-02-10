package com.slk.task16.JavaReflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;

public class MethodGetMetaData {

	
	public void add(int firstElement, int secondElement ,String result)throws ClassCastException,ClassCircularityError
	{
			System.out.println("Demo Method Reflaction API ....");
	}
	
	public String serchEmp(String serching)throws SecurityException,StackOverflowError
	{
		return null;
	}
	public void delete(String deleting )
	{
		System.out.println("Demo method Reflaction api");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Class  metaDataObj= MethodGetMetaData.class;
			
			Method [] methodList = metaDataObj.getDeclaredMethods();
			
			for (Method method : methodList) {
				System.out.println("Name Of The Method  : " + method.getName());
				
				

				System.out.println("Return type  Of The Method  : " + method.getReturnType());
				int modifer = method.getModifiers();
				System.out.println(" Method AccessModifier  : " + Modifier.toString(modifer)  );
				
				
				Class []  getParameterList = method.getParameterTypes();
				System.out.println("Method Parameter Type ");
				
				for (Class paramList : getParameterList) {
					System.out.println(" " + paramList.getName()+ " ");
				}
				
				System.out.println();
				
				
				//get and print exception thrown by the Method  
				Class [] exceptionList = method.getExceptionTypes();
				System.out.println("Exception thrown by method  : ");
				for (Class  exceptionl : exceptionList) {
					
					System.out.println(" " +exceptionl.getName());
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------------------");
				
			}
	}

}
