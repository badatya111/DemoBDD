package com.opencart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Index extends AppLaunch {

	
	DataFromExcel dataFromExcel=new DataFromExcel();
	PropertiesFile propertiesFile=new PropertiesFile();
	
	public void searchProduct() throws InterruptedException {
		//dataFromExcel.getTestData(1, 1, 1);
		String product=propertiesFile.getDataFromProperties("product");
		WebElement searchField=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("index.searchTextFied")));
		searchField.click();
		searchField.sendKeys(product);
		Thread.sleep(5000);
		String productLowercase=product.toLowerCase();
		String productElement="//div[@aria-label='"+productLowercase+"']";
		driver.findElement(By.xpath(productElement)).click();
		
		Thread.sleep(5000);
	}
}
