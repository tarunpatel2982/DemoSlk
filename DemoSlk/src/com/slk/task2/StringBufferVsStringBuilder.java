package com.slk.task2;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long startTime= System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer("java");
		
		for(int i=0;i<10000;i++)
		{
			stringBuffer.append("Tpoint");
			
		}
		System.out.println("time take By String Buffer " + (System.currentTimeMillis() - startTime)+" ms");
		
		startTime = System.currentTimeMillis();
		
		StringBuilder stringBuilder = new StringBuilder("Java");
		
		
		for(int i=0;i<10000;i++)
		{
			stringBuilder.append("Tpoint");
			
		}
		System.out.println("time take By String Builder " + (System.currentTimeMillis() - startTime)+" ms");
		
		
		
		
	}

}
