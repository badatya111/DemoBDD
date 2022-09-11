package com.opencart.page;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonData {
	
	/*
	 * @Auther Abani
	 * This method will read the data from json array key value.
	*/
	public static String getJsonArrayData(String strKey,String strValue) throws IOException, ParseException {
		FileReader fileRead=new FileReader(".//src/test/resources/TestData/emp.json");
		JSONParser jsonParser=new JSONParser();
		Object ob=jsonParser.parse(fileRead);
		JSONObject emp=(JSONObject)ob;
		//strKey=(String)emp.get(strKey);
		System.out.println("Key is : "+strKey);
		JSONArray array=(JSONArray)emp.get(strKey);
		for(int i=0;i<array.size();i++) {
			JSONObject address=(JSONObject)array.get(i);
			//System.out.println(address);
			strValue=(String)address.get(strValue);
			if(strValue.equals("odsha")) {
				System.out.println("value is : "+strValue);
			}
		}
		return strKey+strValue;
	}
	
	/*
	 * @Auther Abani
	 * This method will read the data from json file key value per
	*/
	public static String getData(String strKey) throws IOException, ParseException {
		FileReader fileRead=new FileReader(".//src/test/resources/TestData/emp.json");
		JSONParser jsonParser=new JSONParser();
		Object ob=jsonParser.parse(fileRead);
		JSONObject emp=(JSONObject)ob;
		strKey=(String)emp.get(strKey);
		return strKey; 
	}

}
