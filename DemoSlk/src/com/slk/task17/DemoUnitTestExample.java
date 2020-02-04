package com.slk.task17;

import com.slk.task17.DemoTesterInfoAnnotation.Priority;

@DemoTesterInfoAnnotation(
		priority =  Priority.HIGH,
		createdBy =   " tarun patel",
		tags = {"Hello " , " I am " }
		
		)
public class DemoUnitTestExample {

	@DemoTest
	void TestA()
	{
		if(true)
		{
			throw new RuntimeException("this Test Always Faild");
		}
		
	}
	
	@DemoTest(enbled = false)
	void TestB()
	{
		if(false)
		{
			System.out.println("this test Always Passed ");
		}
	}
	
	
	@DemoTest(enbled = true)
	void TestC()
	{
		if(10>1)
		{
			// do nothing, this test always passed.
		}
	}
	
}
