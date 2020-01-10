package com.slk.task1_1;

public class ThreadgetPriorityMethod extends Thread   {
	
	public void run()  
    {    
        System.out.println("running thread name is:"+Thread.currentThread().getName());    
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating two threads  
		ThreadgetPriorityMethod t1 = new ThreadgetPriorityMethod();    
		ThreadgetPriorityMethod t2 = new ThreadgetPriorityMethod();    
        // print the default priority value of thread  
        System.out.println("t1 thread priority : " + t1.getPriority());   
        System.out.println("t2 thread priority : " + t2.getPriority());  
        // this will call the run() method  
        t1.start();    
        t2.start();  
		

	}

}
