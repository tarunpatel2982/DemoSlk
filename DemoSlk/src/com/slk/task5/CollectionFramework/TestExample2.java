package com.slk.task5.CollectionFramework;

import java.util.HashMap;


public class TestExample2 extends Thread  {


	static HashMap<Integer, String> l= new HashMap<Integer, String>();
	
	public void run()
	{
		try
		{
				Thread.sleep(1000);
				l.put(4, "jitefdji");
				l.remove(1);
		}catch (Exception e) {
			
			System.out.println(e);
			// TODO: handle exception
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	TestExample2.concurrentHashMapExample();
		
		l.put(1, "fgfig");
		l.put(5, "kj");
		l.put(11, "fj");
		l.put(16, "jdfkj");
		
		TestExample2 t= new TestExample2()	;
		t.start();
		
		for(Object o : l.entrySet())
		{
			Object s = o;
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(l);
		
	}

}
