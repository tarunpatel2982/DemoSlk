package com.slk.task14.JavaConcurrency;

public class TwoSum {

	private int sum1=0;

	private int sum2=0;
	
	public void add(int val1, int val2)
	{
		synchronized (this) {
			this.sum1=this.sum1 +val1;

			this.sum2=this.sum2 +val2;
		}
		
		System.out.println(sum1 + "  " + sum2);
	}
}
