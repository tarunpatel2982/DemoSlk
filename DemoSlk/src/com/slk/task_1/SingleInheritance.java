package com.slk.task_1;

public class SingleInheritance extends ClassB {
	
	public void dispC() {
		System.out.println("disp() method of singleInheritance");
		super.dispB();
	}
	

	public static void main(String args[]) {
	
		SingleInheritance singleInheritance1= new SingleInheritance();
		
		SingleInheritance singleInheritance= 
		singleInheritance.dispC();
		//singleInheritance.dispB();
		// Assigning ClassB object to ClassB reference
		//ClassA a = new SingleInheritance();
		// call dispA() method of ClassA
//		a.dispB();
//		// call dispB() method of ClassB
//		a.dispB();
//		
	}
}
