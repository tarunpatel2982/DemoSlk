package com.slk.task1_1_1;

strictfp class StrictfpKeyword implements StrictfpInterface{
	
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("Interface meth9od call");
		
	}

	strictfp void m(){
		
		System.out.println("Strictfp Method");
	}//strictfp applied on method   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StrictfpKeyword strictfpKeyword = new StrictfpKeyword();
			strictfpKeyword.m();
			
			strictfpKeyword.m1();
	}
	

}
