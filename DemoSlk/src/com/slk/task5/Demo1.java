package com.slk.task5;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Demo1 {
	
	static ConcurrentHashMap<Integer, String> l= new ConcurrentHashMap<Integer, String>();
//	static HashMap<Integer, String> l= new HashMap<Integer, String>();
	
	public void addval(int key, String value)
	{
		
		try {
			l.put(key, value);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 d =new Demo1();
		Thread t1 =new Thread()
		{
			public void run()
			{
				d.addval(4, "jit");
				d.addval(5, "jit");
				d.addval(7, "jit");
				System.out.println(l);
			}
		};
		Thread t2 =new Thread()
		{
			public void run()
			{
				d.addval(10, "gfg");
			
				System.out.println(l);
			}
		};
		t1.start();
		t2.start();
		
	}

}
