package com.opencart.page;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcel extends AppLaunch{
	public   XSSFWorkbook workbook;
	
	PropertiesFile propertiesFile=new PropertiesFile();
	
	public  String getTestData(int sheetName,int row,int column) 
	{
		XSSFSheet sheet = null;
		try
		{
			String currentDirectory = System.getProperty("user.dir");
			String excelFilePath=propertiesFile.getDataFromProperties("excelPath");
			String strExcelFilePath=currentDirectory+"\\TestData\\"+excelFilePath;
			System.out.println(strExcelFilePath);
			FileInputStream file = new FileInputStream(new File(strExcelFilePath));
			workbook= new XSSFWorkbook(file);
			sheet= workbook.getSheetAt(sheetName);
			System.out.println("Result "+sheet.getRow(row).getCell(column).getStringCellValue());
			
			
		}catch(Exception e){

		}
		return sheet.getRow(row).getCell(column).getStringCellValue();
	}
}
