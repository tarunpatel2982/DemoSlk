package com.slk.task15.JavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class ClassObjectsAsTypeLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayList<MyGenClass> m = new ArrayList<MyGenClass>();
		System.out.println(m);
		
 	}

}
 class MyGenClass {
	private String val="Tarun";

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	
}
	
	 