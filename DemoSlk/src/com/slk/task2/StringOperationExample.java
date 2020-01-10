package com.slk.task2;

public class StringOperationExample {
	
	public  static void returnCharValueForParticularIndex()
	{
		String s= "Tarun Patel";
		char ch = s.charAt(3);
		System.out.println("INDEX WISE VALUE :" +ch);
	}
	public  static void returnStringLength()
	{
		String s= "Tarun Patel";
		System.out.println("Return String Lenghth :" +s.length());
	}
	public  static void returnStringFormat()
	{ 
		
		String str = "Hello Javatpoint tarun patel njb hjgfohjghj ghjgjhio jtrjhj"; 
		String s2="LAlu";
		String a = str.substring(0, 5);
//		System.err.println(a);
		String sp= " ";
		String b = str.substring(6);
//		System.out.println(b);
		String con= a.concat(sp.concat(s2.concat(sp.concat(b))));
		System.out.println(con);
		
		
//		String a= "";
//		String b= "";
//		for(String s:str.split("\\s",2))
//		{
//			if(str.charAt(0) >= s.charAt(0))
//			{
//				 a = s;
//				//System.out.println("test a " +  a);
//			}
//			else 
//			{
//				 b = s;
//				//System.out.println("test b " +  b);
//			}
//			String sp = " " ;
//			String add= a.concat(sp.concat(s2.concat(sp.concat(b))));
//			System.out.println(add);
		//}
	
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringOperationExample.returnCharValueForParticularIndex();
		//StringOperationExample.returnStringLength();
		StringOperationExample.returnStringFormat();
	}

}
