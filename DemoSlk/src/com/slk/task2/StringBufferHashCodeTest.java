package com.slk.task2;

public class StringBufferHashCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("StringBuffer HashCode Test");
		
		String s="java";
		System.out.println(s.hashCode());
		
		String s1="Angular";
		System.out.println(s1.hashCode());
		
		StringBuffer stringBuffer = new StringBuffer("java");
		
		System.out.println(stringBuffer.hashCode());
		
		stringBuffer.append("Angu");
		
		System.out.println(stringBuffer.hashCode());
		
		
		
		
	}

}
