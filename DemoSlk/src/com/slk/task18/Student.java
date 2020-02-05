package com.slk.task18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class Student {

	
	

	public LinkedHashMap getStudentValue(int personId ,String personName ,Object personAdress)
	{
		
		
		LinkedHashMap<String , Object> linkedHashMap = new LinkedHashMap<String, Object>();
		
		linkedHashMap.put("ID  ", personId);
		linkedHashMap.put("Name ", personName);
		linkedHashMap.put("Adress ", personAdress);
		
		
		
		return linkedHashMap;
	}
	
	public JSONObject getAdress(String vi,String ta)
	{
		JSONObject addAdress = new JSONObject();
		addAdress.put("Village", vi);
		addAdress.put("Taluka", ta);
		
		return addAdress;
	}
	public JSONObject addStudentObject()
	{
		
		JSONArray studArray = new JSONArray();
		studArray.add(getStudentValue(15,"Tarun", getAdress("Kharvel ", "Dharampur")));
		studArray.add(getStudentValue(18,"Urvesh", getAdress("Valsad ", "Dharampur")));
		studArray.add(getStudentValue(11708105,"Ketu", getAdress("Faladhara ", "Vapi")));
		
		
		

		
		JSONArray empArray = new JSONArray();
		empArray.add(getStudentValue(15,"Lalu", getAdress("Vankal ", "Chikhli")));
		empArray.add(getStudentValue(18,"Akki", getAdress("Valsad ", "Dharampur")));
		
		JSONObject objCombo = new JSONObject();
		objCombo.put("StudentObject", studArray);
		objCombo.put("Employee ", empArray);
		
		
		JSONObject personObject = new JSONObject();
		personObject.put("PersonObject", objCombo);
		return personObject;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
//		Student s = new Student();
//		JSONObject j =  s.addStudentObject();
//		
		File file = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/src/com/slk/task18/data2.json");
	
//		try(FileWriter fileWriter = new FileWriter(file))
//		{
//			
//			fileWriter.write(j.toJSONString());
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		System.out.println("test : " + j);
		
		
		
		FileReader fileReader = new FileReader(file);
		
		JSONParser jsonParserc = new JSONParser();
		
		Object object = JSONValue.parse(fileReader);
		JSONObject jsonObject = (JSONObject) object;
		System.err.println(jsonObject);
//		LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>(jsonObject);
//		System.out.println("Linked "+ linkedHashMap);
//		
		
//		for (int i = 0; i < jsonObject.size(); i++) {
//			
//			String per = (String) jsonObject.get("PersonObject");
//			if(jsonObject.get(0) == "StudentObject")
//			{
//				System.out.println("std " + jsonObject.get("StudentObject"));
//			}else
//			{
//				System.out.println(" No data");
//			}
//		}
		
	}

}
