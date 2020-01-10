package com.slk.task4;

import java.util.Iterator;

public class ReverseString {
	
	
	
	public static void  stringReverse(String s) 
	{
		char[] a = new char[s.length()];
		
		int len = s.length();
		
		for(int i=0;i<len;i++) {
			a[i] = s.charAt(i);
		}
		
		for(int i=a.length-1;i>='\0';i--)
		{
				//char temp = a[i];
				//System.out.println(temp);
				System.out.print(a[i]);
	
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ReverseString.stringReverse("Tarun Patel ");
		
	}

}
