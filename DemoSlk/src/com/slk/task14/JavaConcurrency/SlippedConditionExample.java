package com.slk.task14.JavaConcurrency;

public class SlippedConditionExample  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ReadingThread readingThread 
          = new ReadingThread(); 
      SlippedThread slippedThread 
          = new SlippedThread(); 

      slippedThread.start(); 
      readingThread.start(); 
	}

}


class CommonResource { 
    static final String string = "Hello lalu"; 
    static int pointerPosition = 0; 
} 

//Thread to demonstrate a slipped condition 
class SlippedThread extends Thread { 
 @Override
 public void run() 
 { 
     // Check if any characters 
     // are left to process 
     if (CommonResource.pointerPosition  != CommonResource.string.length()) { 
        
    	 
    	 System.out.println("Characters left! " + "I can process the string"); 

         // Cause the thread to wait to cause 
         // a slipped condition 
         try { 
             synchronized (this) 
             { 
                 wait(500); 
             } 
         } 

         catch (InterruptedException e) { 
             System.out.println(e); 
         } 

         try { 
             while (CommonResource.pointerPosition 
                    < CommonResource.string.length()) { 

                 System.out.println("     Thread1   "  + CommonResource.string .charAt( CommonResource .pointerPosition)); 
                 CommonResource.pointerPosition++; 
             } 
         } 

         catch (StringIndexOutOfBoundsException e) { 
             System.out.println("\n  No more character left" + " to process. This is a" + " slipped condition"); 
             e.printStackTrace();
         } 
     } 
 } 
} 


//Thread to process the whole String 
class ReadingThread extends Thread { 
 @Override
 public void run() 
 { 
     System.out.println("Thread2 trying to " + "process the string"); 
     while (CommonResource.pointerPosition  < CommonResource.string.length()) { 

         System.out.println("  Thread2 "  + CommonResource.string .charAt(  CommonResource  .pointerPosition)); 
         CommonResource.pointerPosition++; 
     } 
 } 
} 