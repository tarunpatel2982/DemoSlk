package com.slk.task1_1_1;

public class DownCastingWithoutInstanceOperator extends Animal {

	
	static void method(Animal a)
	{
		DownCastingWithoutInstanceOperator downCastingWithInstance =  (DownCastingWithoutInstanceOperator)a;
		System.out.println("DownCasting call With Instance");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal=new DownCastingWithoutInstanceOperator();
		DownCastingWithoutInstanceOperator.method(animal);
		

	}

}
