package com.slk.task17;


@ForEveryone
public class InheritedAnnotation extends ClassA  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new InheritedAnnotation().getClass().getAnnotation(ForEveryone.class));
	}

}
