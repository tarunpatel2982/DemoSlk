package com.slk.task17.JavaAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(".....................   Testing  ............");
		
		int passed = 0, failed = 0, count = 0, ignore = 0;
		
		Class<DemoUnitTestExample> obj = DemoUnitTestExample.class;
	
		//process @DemoTesterInfoAnnotation
		
		if(obj.isAnnotationPresent(DemoTesterInfoAnnotation.class))
		{
			Annotation annotation = obj.getAnnotation(DemoTesterInfoAnnotation.class);
			DemoTesterInfoAnnotation demoUnitTestExample = (DemoTesterInfoAnnotation)annotation;
			
			System.out.printf(" %n Priority  : %s", demoUnitTestExample.priority() );
			
			System.out.printf("%nCreatedBy :%s", demoUnitTestExample.createdBy());
			System.out.printf("%nTags :");
			
			
			int tagLength = demoUnitTestExample.tags().length;
			for (String tag : demoUnitTestExample.tags() ){
				if(tagLength > 1 )
				{
					System.out.println(tag + "  , ");
				}
				else
				{
					System.out.println(tag);
				}
				tagLength--;
			}
			System.out.printf(" %n LastModified  :  %s%n%n" , demoUnitTestExample.lastModified());
		}
		
		
		
		
		
		// Process @DemoTest
		for (Method method : obj.getDeclaredMethods()) {

			// if method is annotated with @DemoTest
			if (method.isAnnotationPresent(DemoTest.class)) {

				Annotation annotation = method.getAnnotation(DemoTest.class);
				DemoTest test = (DemoTest) annotation;

				// if enabled = true (default)
				if (test.enbled()) {

				  try {
					method.invoke(obj.newInstance());
					System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
					passed++;
				  } catch (Throwable ex) {
					System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
					failed++;
				  }

				} else {
					System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
					ignore++;
				}

			}

		}
		System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);

		}
		
	}


