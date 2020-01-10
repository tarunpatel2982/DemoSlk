package com.slk.task4;
//outer class
public class StaticNastedClass {
	
	//static member
	 private static int x=1;
	//instance (non static member)
	 int y=2;
	 
	 //private member
	 private static int z=5;
	public static class StaticNasted
	{
		 void display()
		{
		
			 System.out.println("outer class static member : " + x);
			 
			 System.out.println("Outer class private member  : " + z);
			 
			 //as static nested class can not directly access non-static member
		//		 System.out.println("non - static memebr : " + y);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticNastedClass.StaticNasted staticNasted = new StaticNastedClass.StaticNasted();
		
		staticNasted.display();;
		//System.out.println(staticNasted.y);
	}

}
