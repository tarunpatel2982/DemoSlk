package com.slk.task17;

import java.lang.reflect.Method;

public class TestCustomAnnotation1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub

		Hello h = new Hello();
			Method m= h.getClass().getMethod("seyHello");
			
		
		SingleValueAnnotation s = m.getAnnotation(SingleValueAnnotation.class);
		System.out.println("Value is : " + s.value());
		
	}

}
class Hello
{
	
	//Applying annotation  
	
	
	@SingleValueAnnotation(value = 10)
	public void seyHello()
	{
		System.out.println("Hello Anntation ");
	}
}