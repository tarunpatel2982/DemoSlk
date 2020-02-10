package com.slk.task14.JavaConcurrency;

public class CommonResource1 {
	
	 private Worker owner;

	    public CommonResource1 (Worker d) {
	        owner = d;
	    }

	    public Worker getOwner () {
	        return owner;
	    }

	    public synchronized void setOwner (Worker d) {
	        owner = d;
	    }
}
