package com.slk.task4.NestedClasses;

public class Demo3 extends Object {

	public static void stringLiteral()
	{
		//create string literal object  stored in string constant pool
		
		
		
		String s1= "Tarun";

		String s2= "Tarun";

		String s3= "TARUN";

		String s4= "123";
		
		
		System.out.println("String s1   :  " + s1.hashCode());

		System.out.println("String s2   :  " + s2.hashCode());

		System.out.println("String s3   :  " + s3.hashCode());

		System.out.println("String s4   :  " + s4.hashCode());
		
		
		//create string object using new keyword stored in heap memory
		
		
		String s5 = new String("Tarun");
		String s6 = new String(s1);
		String s7 = new String("TARUN");
		String s8 = new String(s3);
		

		System.out.println("String s5       :  " + s5.hashCode());
		System.out.println("String s5       :  " + s6.hashCode());
		
		
		System.out.println("s1 == s2        : " + (s1 == s2) );

		System.out.println("s1.equals(s2)   : " + s1.equals(s2) );

		System.out.println("s1 == s5        : " + (s1 == s5 ));

		System.out.println("s1.equals(s5)   : " + s1.equals(s5));

		
		System.out.println("s1 == s6        : " + (s1 == s6 ));

		System.out.println("s1.equals(s6)   : " + s1.equals(s6));
		
		
		System.out.println("s1.equalsIgnoreCase(s3)   : " + s1.equalsIgnoreCase(s3));
		System.out.println("s1.equalsIgnoreCase(s7)   : " + s1.equalsIgnoreCase(s7));
		System.out.println("s1.equalsIgnoreCase(s8)   : " + s1.equalsIgnoreCase(s8));
		
		System.out.println();
		System.out.println(s1.replace(a, newChar));


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3.stringLiteral();

	}

}
