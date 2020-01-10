package com.slk.task3;

public class FinallyBlock {
	
	
	public static  String one (){
		try {
			int a=10/0;
			System.out.println(a);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		finally {
			System.out.println("Finally Block Executed");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinallyBlock.one();
//		try
//		{ 
//			int a=10/0;
//			System.out.println(a);
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e);
//
//		}
//		
//		
//		finally {
//			System.out.println("Finally Block Executed");
//		}
	
	}

}
