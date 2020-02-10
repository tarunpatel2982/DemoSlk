package com.slk.task18.JsonAndJettison;

import org.json.simple.JSONObject;

public class DataTypeInJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] a = {"Kharvel " , " Nishal faliya" }; 
		String s = new String("Hello ");
		
		JSONObject j = new JSONObject();
		j.put("id", 1);//Number
		j.put("Name ", "Tarun");//String
		j.put("Salary",s);//Object
		j.put("Condition",false );//boolean
		j.put("Adress", a);//Array
		j.put("greade" , null);//null
		
		System.out.println( " test data type : " + j); 
		
		
		
	}

}
