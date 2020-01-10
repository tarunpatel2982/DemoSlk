package com.slk.task4;

public class NestedInterfaceWithInClassDemo implements NestedInterfaceWithInClass.Message{

	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Nested Interface call");
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedInterfaceWithInClass.Message nMessage= new NestedInterfaceWithInClassDemo();
		nMessage.show();
			
	}

	

}
