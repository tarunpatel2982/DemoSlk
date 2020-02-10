package com.slk.task14.JavaConcurrency;

public class SleepedCondition {

	
	 private boolean isLocked = true;

	    public void lock(){
	      synchronized(this){
	        while(isLocked){
	          try{
	            this.wait();
	          } catch(InterruptedException e){
	            //do nothing, keep waiting
	          }
	        }
	      }

	      synchronized(this){
	        isLocked = true;
	      }
	    }

	    public synchronized void unlock(){
	      isLocked = false;
	      this.notify();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepedCondition s = new SleepedCondition();
		
		 new Thread()
				{
					public void run() {
						s.lock();
						s.unlock();
					}
				
				}.start();
	}

}
