package com.slk.task18.JsonAndJettison;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ObjectWithNestedArray {

	
	public JSONObject getAddValue(int personId, String personName )
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("personId",personId);
		jsonObject.put("personName",personName);
		
		return jsonObject;
	}
	
	public JSONObject getAdress(String vi , String di)
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Village",vi);
		jsonObject.put("District",di);
		
		return jsonObject;
	}
	public JSONObject getPersonObject()
	{
		JSONArray studArray= new JSONArray();
		studArray.add(getAddValue(45, "Nitesh"));
		studArray.add(getAddValue(45, "Nitesh"));
		
		
		
		JSONArray address = new JSONArray();
		address.add(getAdress("Kharvel ", "Valsad"));
		
		
		JSONObject adressJObject = new JSONObject();
		adressJObject.put("Adress " , address);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("studArray", studArray);
		jsonObject.put("Adress",adressJObject);
		return jsonObject;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectWithNestedArray objectWithNestedArray = new ObjectWithNestedArray();
		JSONObject j = objectWithNestedArray.getPersonObject();
		
		System.out.println(j);
	}

}
