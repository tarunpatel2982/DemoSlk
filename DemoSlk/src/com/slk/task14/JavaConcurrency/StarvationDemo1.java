package com.slk.task14.JavaConcurrency;

public class StarvationDemo1 extends Thread {
	
	 static int threadcount = 1; 
	    public void run() 
	    { 
	    	
	    	System.out.println("Name  :  "  + Thread.currentThread().getName());
	         System.out.println("Child thread execution completes"); 
	        threadcount++; 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("Main thread execution starts"); 
		  
	        // Thread priorities are set in a way that thread5 
	        // gets least priority. 
	        StarvationDemo1 thread0 = new StarvationDemo1(); 
	        thread0.setPriority(10);
	        StarvationDemo1 thread1 = new StarvationDemo1(); 
	        thread1.setPriority(9); 
	        StarvationDemo1 thread2 = new StarvationDemo1(); 
	        thread2.setPriority(8); 
	        StarvationDemo1 thread3 = new StarvationDemo1(); 
	        thread3.setPriority(7); 
	        StarvationDemo1 thread4 = new StarvationDemo1(); 
	        thread4.setPriority(6); 
	        
	        thread0.start(); 
	        thread1.start(); 
	        thread2.start(); 
	        thread3.start(); 
	        thread4.start(); 
	        // Here thread5 have to wait beacause of the 
	        // other thread. But after waiting for some 
	        // interval, thread5 will get the chance of  
	        // execution. It is known as Starvation 
	       
	  
	        System.out.println("Main thread execution completes"); 
	}

}
