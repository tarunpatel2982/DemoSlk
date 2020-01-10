package com.slk.task1_1_1;

public class AccessModifierWithMethodOverriding extends AccessModifierClassA {
	
	protected void msg(){System.out.println("Hello java");}//C.T.Error  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AccessModifierWithMethodOverriding accessModifierWithMethodOverrifing = new AccessModifierWithMethodOverriding();
		accessModifierWithMethodOverrifing.msg();

	}

}
