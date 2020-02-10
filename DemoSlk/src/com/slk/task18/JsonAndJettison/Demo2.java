package com.slk.task18.JsonAndJettison;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Demo2 {

	
	 JSONObject getPeroson(String firstName ,String lastName)
	 {
		 JSONObject person = new JSONObject();
		 person.put("First Name " , firstName);

		 person.put("Last Name " , lastName);
		 return  person; 
	 }
	 
	 public JSONObject getJsonResponse()
	 {
		 JSONArray	employees = new JSONArray();
		 employees.add(getPeroson("Tarun", "Patel"));
		 
		 
		 JSONArray	manager = new JSONArray();
		 manager.add(getPeroson("UV", "Patel"));
		 
		 
		 JSONObject jsonObject = new JSONObject();
		 jsonObject.put("employees", employees);
		 jsonObject.put("manager", manager);
		 
		 return jsonObject;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 d = new Demo2();
		JSONObject j =  d.getJsonResponse();
		System.out.println("test : " + j);
		
		System.out.println("Employe Name  : " + j.get("employees"));
		
		
		JSONArray jsonArray = (JSONArray)j.get("employees");
		
		Iterator<Object> jIterator = jsonArray.iterator();
		while(jIterator.hasNext())
		{
			System.out.println(" Employee Object " + jIterator.next());
		}
	}
	
}
