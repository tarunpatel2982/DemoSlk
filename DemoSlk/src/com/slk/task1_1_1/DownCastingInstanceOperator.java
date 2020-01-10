package com.slk.task1_1_1;

interface one  {
	
}

public class DownCastingInstanceOperator extends Animal implements  one{
	
	static void method(one a)
	{
		if(a instanceof DownCastingInstanceOperator)
			
			
		{
			DownCastingInstanceOperator downCastingInstanceOperator =  (DownCastingInstanceOperator)a;
			System.out.println("DowCasting Performed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new DownCastingInstanceOperator();
		
		one o = new DownCastingInstanceOperator();
		
		DownCastingInstanceOperator castingInstanceOperator = (DownCastingInstanceOperator) animal;
		castingInstanceOperator.method(o);
		
	}

}
