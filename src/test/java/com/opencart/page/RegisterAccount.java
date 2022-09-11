package com.opencart.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;


public class RegisterAccount extends AppLaunch {
	PropertiesFile propertiesFile=new PropertiesFile();
	
	public void enterUserDetails(DataTable dataTable) {
		List<List<String>> data=dataTable.raw();
		try {
			System.out.println("Fname : "+data.get(0).get(0)+" : Lname :"+data.get(0).get(1)+" : Email :"+data.get(0).get(2)+" : Pnumber : "+data.get(0).get(3)+" : pws : "+data.get(0).get(4)+" : CPws : "+data.get(0).get(5));
			WebElement fname=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("registerAc.fname")));
			fname.sendKeys(data.get(0).get(0));
			WebElement lname=driver.findElement(By.id(propertiesFile.getElementFromProperties("registerAc.lname")));
			lname.sendKeys(data.get(0).get(1));
			WebElement email=driver.findElement(By.id(propertiesFile.getElementFromProperties("registerAc.email")));
			email.sendKeys(data.get(0).get(2));
			WebElement telephone=driver.findElement(By.id(propertiesFile.getElementFromProperties("registerAc.telephone")));
			telephone.sendKeys(data.get(0).get(3));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("javascript:window.scrollBy(200,200)");
			
			WebElement password=driver.findElement(By.id(propertiesFile.getElementFromProperties("registerAc.pws")));
			password.sendKeys(data.get(0).get(4));
			WebElement conPassword=driver.findElement(By.id(propertiesFile.getElementFromProperties("registerAc.coPws")));
			conPassword.sendKeys(data.get(0).get(5));
			
			WebElement  privacyPolicy=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("registerAc.privacypolice")));
			privacyPolicy.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clcikContinueButton(){
		WebElement continueBtn=driver.findElement(By.xpath("registerAc.continueBtn"));
		continueBtn.click();
	}
	
	
}
