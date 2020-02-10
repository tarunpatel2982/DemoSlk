package com.slk.task4.NestedClasses;

public class LocalInnerClass {

	int count = 0;
	
	public void display()
	{
		if(count<1)
		{
			class Innner
			{
				public void show()
				{
					System.out.println("Inside innser class : " + (count++));
					
				}
			}
			
			Innner in= new Innner();
			in.show();
		}
		else
		{
			System.out.println("Not Execute Local InnerClass");
		}
	}
}
