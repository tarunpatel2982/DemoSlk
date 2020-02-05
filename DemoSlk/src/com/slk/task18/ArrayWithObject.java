package com.slk.task18;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ArrayWithObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JSONObject jsonObject1=  new JSONObject();
		jsonObject1.put("Name", "Tarun");
		jsonObject1.put("Age", new Integer(24));
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(jsonObject1);
		
		
		JSONObject mainObject = new JSONObject();
		mainObject.put("emp",jsonArray);
		
		System.out.println("Test  Object  : " + mainObject);
	}

}
