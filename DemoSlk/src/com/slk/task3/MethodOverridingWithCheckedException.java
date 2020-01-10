package com.slk.task3;

import java.io.IOException;

public class MethodOverridingWithCheckedException extends Parrent{
	
	//Rules  of Exception 
	
	//Super  class  method does   not declared an Exception and subclass override method can not checked exception  c
	public void show()throws IOException
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parrent parrent= new MethodOverridingWithCheckedException();
		parrent.show();		
		
	}

}
