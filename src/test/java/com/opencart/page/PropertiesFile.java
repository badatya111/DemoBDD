package com.opencart.page;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


public class PropertiesFile {

	public static Properties element;
	public static Properties testData;
	
public static PropertiesFile propertiesFile;

	public String getDataFromProperties(String strElement){
		testData=new Properties();
		try {
			String strCurrentDir=System.getProperty("user.dir");
			String strProLocation=strCurrentDir+"\\PropertiesFiles\\SetData.properties";
			FileInputStream fis=new FileInputStream(strProLocation);
			testData.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return testData.getProperty(strElement);
	}

	public String getElementFromProperties(String strObject){
		try{
			element=new Properties();
			String strCurrentDir=System.getProperty("user.dir");
			String strProLocation=strCurrentDir+"\\PropertiesFiles\\Element.properties";
			FileInputStream fis=new FileInputStream(strProLocation);
			element.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return element.getProperty(strObject);
	}
}
