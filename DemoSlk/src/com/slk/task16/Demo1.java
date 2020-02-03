package com.slk.task16;



public class Demo1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		// TODO Auto-generated method stub

		// Creating object whose property is to be checked 
        Test obj = new Test(); 
  //1 Way Of get Object OF class 
        
        System.out.println("-----------------------------------------------------------------");
        try {
			Class<?> classobj=Class.forName("com.slk.task16.Test");
			
			System.out.println("Display Path Name With Class Name  : " +classobj.getName());
			
			System.out.println("Check Simple Name : " + classobj.getSimpleName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("-----------------------------------------------------------------");
        
        Class<?> classobj1=Test.class;
		
		System.out.println("Display Path Name With Class Name  : " +classobj1.getName());
		
		System.out.println("Check Simple Name : " + classobj1.getSimpleName());

	    System.out.println("-----------------------------------------------------------------");
	     
	    
	    Class<?> classobj2 = obj.getClass();
	    System.out.println("Display Path Name With Class Name  : " +classobj2.getName());
		
		System.out.println("Check Simple Name : " + classobj2.getSimpleName());

	}

}
