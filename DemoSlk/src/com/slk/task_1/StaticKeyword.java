package com.slk.task_1;

public class StaticKeyword {
	
	
	
	static void getEmpName(String empName)
	{
		System.out.println("Employee Name  : " + empName);
	}
	
	public static void main(String[] args) {

		//Call getEmpName Method Without creating Object
		getEmpName("Tarun Patel");
	}

}
