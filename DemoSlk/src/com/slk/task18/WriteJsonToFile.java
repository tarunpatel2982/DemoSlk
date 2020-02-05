package com.slk.task18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WriteJsonToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectWithNestedArray o = new ObjectWithNestedArray();
		JSONObject data = o.getPersonObject();
		
		File f = new File("/home/SLKTECHLABS/tarun.patel/git/DemoSlk/DemoSlk/src/com/slk/task18/data.json");
	
		

		//Write JSONObject In File 
		try(FileWriter fileWriter = new FileWriter(f))
		{
			
			fileWriter.write(data.toJSONString());
			
			System.out.println("Sucessfully data Copied JSON Object To File");
			System.out.println("\nJSON Object " + data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	//Read JSONObject In File 
	
	
		
		JSONParser jsonParser = new JSONParser();
		try(FileReader fileReader = new FileReader(f))
		{
			//Read JSONFile 
			Object obj = jsonParser.parse(fileReader);
			System.out.println("test Object  :   "+ obj );
			
			
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	

}
