package com.slk.task18;

import org.json.simple.JSONObject;

public class DemoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name " , "Tarun");
		jsonObject.put("Age", new Integer(45));
		jsonObject.put("salary", new Double(600000));
		System.out.println(jsonObject
				);
	}

}
