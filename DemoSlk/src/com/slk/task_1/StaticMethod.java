package com.slk.task_1;

public class StaticMethod {

	//static variable
	static int a = 10;
	
	int b = 10;
	
	static void m1()
	{
		a=20;
		System.out.println("===>  m1()");
		
//		 b= 30;
//		 
//		 m2();
//		 
//		 System.out.println(""+ super.a);
		
	}
	
	void m2()
	{
		System.out.println("===>> m2()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			m1();
			// m2();
	}

}
