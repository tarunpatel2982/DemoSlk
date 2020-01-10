package com.slk.task_1;

public class Emp {

	
	int id;  
	String name;  
	Address address;  
	  
	public Emp(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address1=new Address("Dharampur","GJ","india");  
		Address address2=new Address("xyz","UP","india");  
		  
		Emp e=new Emp(111,"Tarun",address1);  
		Emp e2=new Emp(112,"Uv",address2);  
		      
		e.display();  
		e2.display();  
		      
	}

}
