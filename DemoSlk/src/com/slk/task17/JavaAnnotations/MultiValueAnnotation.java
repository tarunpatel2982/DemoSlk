package com.slk.task17.JavaAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface MultiValueAnnotation {

	int value1() default 1;  
	String value2() default "";  
	String value3() default "xyz";  
}
