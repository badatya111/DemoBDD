package com.opencart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login extends AppLaunch {
	
	DataFromExcel dataFromExcel=new DataFromExcel();
	PropertiesFile propertiesFile=new PropertiesFile();
	Home home=new Home();
	
	public void clickLoginButton() throws InterruptedException{
		home.clickOnMyAccount();
		driver.findElement(By.xpath(propertiesFile.getElementFromProperties("login.loginBtn"))).click();
	}
	
	public void enterUserNamePassword(String sttUserName,String strPassword){
		try {
			clickLoginButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement userName=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("login.userName")));
		userName.sendKeys(sttUserName);
		WebElement password=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("login.password")));
		password.sendKeys(strPassword);
		WebElement loginBtn=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("login.loginBtn")));
		loginBtn.click();
	}
	

}
