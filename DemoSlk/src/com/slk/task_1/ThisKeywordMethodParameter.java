package com.slk.task_1;

public class ThisKeywordMethodParameter {
	
	String valueA;
	String valueB;
	
public ThisKeywordMethodParameter() {
		
		valueA="tarun";
		valueB="patel";
	}

	public void displayDetail(ThisKeywordMethodParameter test)
	{
		System.out.println("Constructor value Display : " + valueA + " " + valueB);
		
	
		
	}

//keyword as method parameter 
	public void  setDetail()
	{
		displayDetail(this);
		
		System.out.println("===>>> using this keyword as method parameter  ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordMethodParameter thisKeywordMethodParameter=new ThisKeywordMethodParameter();
		thisKeywordMethodParameter.setDetail();

	}

}
