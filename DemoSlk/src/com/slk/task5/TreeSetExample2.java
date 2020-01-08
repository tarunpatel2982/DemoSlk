package com.slk.task5;

import java.util.TreeSet;

public class TreeSetExample2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Emp> nameComp = new TreeSet<Emp>(new MyNameComp());
	        nameComp.add(new Emp("Ram",3000));
	        nameComp.add(new Emp("John",6000));
	        nameComp.add(new Emp("Crish",5000));
	        nameComp.add(new Emp("Tom",2400));
	        for(Emp e:nameComp){
	            System.out.println(e);
	        }
	        System.out.println("===========================");
	        //By using salary comparator (int comparison)
	        TreeSet<Emp> salComp = new TreeSet<Emp>(new MySalaryComp());
	        salComp.add(new Emp("Ram",3000));
	        salComp.add(new Emp("John",6000));
	        salComp.add(new Emp("Crish",5000));
	        salComp.add(new Emp("Tom",2400));
	        for(Emp e:salComp){
	            System.out.println(e);
	        }
	}

}
