package com.slk.task3.ExceptionHandling;

import java.io.IOException;

public class ThrowsException2 {

	
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }    
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThrowsException2 throwsException2 = new ThrowsException2();
		throwsException2.p();
	}

}
