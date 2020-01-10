package com.slk.task_1;

public class StaticBlocks {

	static int valueA = 10 ;
	static int valueB  = one();
	
	static {
		System.out.println("\n ===>>>Called Staic Block");
		valueB = valueA * 5 ;
	}
	
	public static int one () {
		
		System.out.println("Hiiiii");
		
		return 1;
	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		System.out.println(" \n Main Method Call ");
 		System.out.println("VALUE  A  : "   + valueA ); 
 		System.out.println("Value b   : " +  valueB  );
	}

}
