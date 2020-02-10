package com.slk.task17.JavaAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)//on class level
public @interface DemoTesterInfoAnnotation {
	
	public enum Priority
	{
		Low,MEDIUM,HIGH
	}
	
	Priority priority() default Priority.MEDIUM;
	
	String[] tags() default "";
	
	String createdBy() default "Mkyong";
	
	String lastModified() default "03/02/2020";
}
