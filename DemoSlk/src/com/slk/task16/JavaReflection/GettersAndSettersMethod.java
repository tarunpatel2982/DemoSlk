package com.slk.task16.JavaReflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class GettersAndSettersMethod {

	
	public static boolean isGetter(Method method)
	{
		
		if(Modifier.isPublic(method.getModifiers()) && method.getParameterTypes().length==0)
		{
			if(method.getName().matches("^get[A-Z].*") && !method.getReturnType().equals(void.class))
			{
				return true;
			}
			if(method.getName().matches("^is[A-Z].*") && method.getReturnType().equals(boolean.class))	
			{
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean isSetter(Method method)
	{
		return Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(void.class) && method.getParameterTypes().length==1 && method.getName().matches("^set[A-Z].*");
	}
	public static ArrayList<Method> findGetterMethod(Class<?> c)
	{
		 ArrayList<Method> list = new ArrayList<Method>();
		 Method[] method =c.getDeclaredMethods();
		 
		 for (Method method2 : method) {
			 if(isGetter(method2) || isSetter(method2))
			 {
				 list.add(method2);
			 }
		}
		 return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Method val: findGetterMethod(Student.class)) {
			System.out.println(" Student : " + val);	
		}
	}

}
