package com.slk.task15;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {

    public static void addNumbers(List<? super Integer> list) {  
    	  
        for(Object n:list)  
        {  
              System.out.println(n);  
        }  
          
      
          
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> l1=Arrays.asList(1,2,3);  
	      System.out.println("displaying the Integer values");  
	    addNumbers(l1);  
	      
	    List<Number> l2=Arrays.asList(1.1,2.0,3.0);  
	      System.out.println("displaying the Number values");  
	    addNumbers(l2);  
	}  

}


