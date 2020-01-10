package com.slk.task1_1;

public class InterruptingThreadNormaly extends Thread{
	
	public void run(){  
		for(int i=1;i<=5;i++) 
		{
			if(Thread.interrupted()){  
				System.out.println("code for interrupted thread");  
				}  
				else{  
				System.out.println("code for normal thread");  
				}  
		}
//		System.out.println(i);  
		}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		InterruptingThreadNormaly interruptingThreadNormaly = new InterruptingThreadNormaly();
		InterruptingThreadNormaly interruptingThreadNormaly2 = new InterruptingThreadNormaly();
		interruptingThreadNormaly.start();
		interruptingThreadNormaly.interrupt();
		
		interruptingThreadNormaly2.start();

	}

}
