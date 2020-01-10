package com.slk.task3;

public class MethodOverridingException4 extends Parrent2 {

	
	///Example in case subclass overridden method declares no exception
	public void parrent2()
	{
		System.out.println("Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parrent2 parent1 = new MethodOverridingException4();
		try
		{
			parent1.parrent2();

		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		}

}
