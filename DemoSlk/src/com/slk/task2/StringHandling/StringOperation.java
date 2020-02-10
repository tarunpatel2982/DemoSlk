package com.slk.task2.StringHandling;

public class StringOperation {

	String a= 20+10+"Wellcome  ";
	String b="Tarun Patel"+10+40;
	public void concateString()
	{
		System.out.println( "==>>>> Concate String");
		String c=a.concat(b);
		System.out.println("  " + c);
	}
	
	public void compareString()
	{

		System.out.println( "==>>>> compare String  public boolean equals(Object another) compares this string to the specified object.");
		 
		String a1="Tarun";
		String b1="Tarun";
		String c1 = new String("Tarun");
	
		String d1="lalu";
	
		System.out.println(a1.equals(b1));

		System.out.println(a1.equals(c1));

		System.out.println(a1.equals(d1));
	}

	public void compareString2()
	{

		System.out.println( "==>>>> compare String  public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case");
		 
		String a1="Tarun";
		String b1="TARUN";
		
		System.out.println(a1.equals(b1));

		
		System.out.println(a1.equalsIgnoreCase(b1));
	}
	
	
	public void compareString3()
	{

		System.out.println( "==>>>> String compare by == operator");
		 
		 String s1="Lalu";  
		   String s2="Lalu";  
		   String s3=new String("Lalu");  
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
	}
	
	public void compareString4()
	{

		System.out.println( "==>>>> String compare by compareTo() method ");
		 
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String a=50+30+"Tarun"+40+40;
		
		String b="tarun"+40+20+10;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		StringOperation stringOperation = new  StringOperation();
		stringOperation.concateString();
		stringOperation.compareString();

		stringOperation.compareString2();
		stringOperation.compareString3();
		stringOperation.compareString4();
		
	}

}
