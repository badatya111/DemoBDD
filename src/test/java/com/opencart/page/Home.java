package com.opencart.page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Home extends AppLaunch{
	DataFromExcel dataFromExcel=new DataFromExcel();
	PropertiesFile propertiesFile=new PropertiesFile();
	YourStore yourStore=new YourStore();
	RegisterAccount registerAccount=new RegisterAccount();
	
	
	public void clickOnMyAccount() throws InterruptedException {

		try {
			Thread.sleep(4000);
			WebElement myAcBtn=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("index.myaccountBtn")));
			myAcBtn.click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void clickOnRegstrationButton() {

		driver.findElement(By.xpath(propertiesFile.getElementFromProperties("index.registerBtn"))).click();

	}

	public void searchItems(){
		WebElement searchTextFild=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.searchField")));
		searchTextFild.sendKeys(dataFromExcel.getTestData(0,1,2));
		searchTextFild.sendKeys(Keys.ENTER);

	}
	public void monitorPoductSelect(){
		WebElement selectCategory=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.category")));
		selectCategory.click();
		WebElement selectMonitor=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.selectMonitor")));
		selectMonitor.click();
	}

	public void selectAndCompireProduct(){
		WebElement phonePads=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.PhonesPads")));
		phonePads.click();
		driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.sortBy"))).click();
		driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.priceHighToLow"))).click();

		List<WebElement> element=driver.findElements(By.xpath(propertiesFile.getElementFromProperties("home.compareThisProduct")));
		int a=element.size();
		System.out.println(a);
		for(int i=1;i<=3;i++){
			String strElement="(//*[@data-original-title='Compare this Product'])["+i+"]";
			WebElement compareBtn=driver.findElement(By.xpath(strElement));
			compareBtn.click();
		}
		WebElement productCompareLink=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.productCompare")));
		productCompareLink.click();
		WebElement clickHTCPhone=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("product.hTCTouchHD")));
		clickHTCPhone.click();

	}

	public void clickAdtoCart(){
		try{
			Thread.sleep(4000);
			WebElement addToCardtBtn=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("product.adToCart")));
			addToCardtBtn.click();
			yourStore.verifySuccessfulMessage();
		}catch(Exception e){

		}
	}
	public void clickTotalCartButton(){
		WebElement totalCartBtn=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("store.totalCart")));
		totalCartBtn.click();
		WebElement checkOutBtn=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("store.checkOut")));
		checkOutBtn.click();
	}

	public void clickCheckOutBtn(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement checkOutBtn1=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("store.checkOut1")));
		js.executeScript("arguments[0].scrollIntoView();", checkOutBtn1);
		checkOutBtn1.click();
		WebElement outOfStockMessage=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("store.productNotAvlMsg")));
		if(outOfStockMessage.isDisplayed()){
			outOfStockMessage.getText();
		}
	}

	public void selectOrderHistory() throws InterruptedException{
		clickOnMyAccount();
		driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.orderHistory"))).click();
		registerAccount.clcikContinueButton();
	}
	
	public void clickNewsLitter(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement checkOutBtn1=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.newsLitter")));
		js.executeScript("arguments[0].scrollIntoView();", checkOutBtn1);
		checkOutBtn1.click();
		driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.newsLitterRandioYes"))).click();
		registerAccount.clcikContinueButton();
		
	}
	
	public void clickOnLogoutButton(){
		try {
			Thread.sleep(4000);
			clickOnMyAccount();
			WebElement logOutBtn=driver.findElement(By.xpath(propertiesFile.getElementFromProperties("home.logoutbtn")));
			logOutBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
