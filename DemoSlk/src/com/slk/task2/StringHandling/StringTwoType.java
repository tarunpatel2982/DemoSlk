package com.slk.task2.StringHandling;

public class StringTwoType {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===>>> creating string by java string literal   ");	
		
		String s="welcome";//creating string by java string literal 
		
		
		
		System.out.println(s);  
		
		
		System.out.println("===>>> converting char array to string   ");	
		char ch[]={'w','e','l','c','o','m','e'};  
		String s2=new String(ch);//converting char array to string  
		System.out.println("=======>"+"welcome1:".hashCode());
		System.out.println("=======>"+"welcome2:".hashCode());
		System.out.println("=======>"+s2
				
				.hashCode());
		
		
		
		
		System.out.println("===>>> creating java string by new keyword ");	
		
		String s3=new String("example");//creating java string by new keyword  

		
		System.out.println(s3); 
		
		System.out.println("===>> Immutable String in Java ");	
		
		//Immutable String in Java
		s.concat("Tarun");	//concat() method appends the string at the end  
		System.out.println(s);//will print Tarun because strings are immutable objects  
		
		
		System.out.println("===>>not  Immutable String in Java ");	
		
		  s=s.concat(" lalu");  
		   System.out.println(s);  
	}

}
	
