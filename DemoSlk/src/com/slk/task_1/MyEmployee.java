package com.slk.task_1;

public class MyEmployee {

	
static int age = 24 ;
	

	public void empName(String empName)
	{
		System.out.println("Employee  Name :" + empName);
	
	}
	//this method used for method Overriding 
	public void eat()
	{
		System.out.println("Employee is Eating");
	}
	//this method used for method Overriding  access modifier 
	public void disp()
	   {
	       System.out.println("Parent class method");
	   }
	
	public static void main(String[] args) {
	
				//Local variable
				
				String compName = "SLK Tec";
			
				MyEmployee myObject = new MyEmployee();
				
				System.out.println("Company name : " + compName);
				
				//Instance Variable
				myObject.empName("Tarun Patel");
				
				//class variable
				System.out.println("Employee Age : " + MyEmployee.age);
				
				
	}
	
	

}
