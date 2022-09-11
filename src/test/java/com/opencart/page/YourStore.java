package com.opencart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class YourStore extends AppLaunch{

	RegisterAccount registerAccount=new RegisterAccount();
	
	public void acCreatSuccessMsg(){
		String strAcCreatSuccessMsg=driver.findElement(By.xpath("yourStore.acSuccessMsg")).getText();
		String acutalAcCreatSuccessMsg="Your Account Has Been Created!";
		if(strAcCreatSuccessMsg.equalsIgnoreCase(acutalAcCreatSuccessMsg))
		{
			System.out.println("Account Created Successful !");
			driver.findElement(By.xpath("yourStore.contactUs")).click();
		}
	}
	
	public void contactDetails(){
		String strEnqury=propertiesFile.getElementFromProperties("rivew");
		driver.findElement(By.xpath("yourStore.enquryField")).sendKeys(strEnqury);
		clickSubmitButton();
	}
	
	public void clickSubmitButton(){
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	public void verifyContackUsMsg(){
		WebElement strContactUs=driver.findElement(By.xpath("yourStore.contactUs3"));
		if(strContactUs.isDisplayed())
		{
			registerAccount.clcikContinueButton();
		}
	}
	
	public void clickOnTabletsTab(){
		driver.findElement(By.xpath("yourStore.tablet")).click();
		driver.findElement(By.xpath("yourStore.samsumgImage")).click();
	}
	
	public void review(){
		String strReview="Very good Product I like this product. I want different model as well.";
		driver.findElement(By.xpath("yourStore.rivewLink")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(200,200)"); 
		driver.findElement(By.xpath("yourStore.rivewTxtField")).sendKeys(strReview);
		String strRating="5";
		driver.findElement(By.xpath("//*[@name='rating' and @value='"+strRating+"']")).click();
		registerAccount.clcikContinueButton();
		driver.findElement(By.xpath("yourStore.rivewThanksMsg")).isDisplayed();
		
	}
	
	public void verifySuccessfulMessage(){
		driver.findElement(By.xpath("yourStore.successfulyAdded")).isDisplayed();
	}
	
	public void clickAdToCartButton(){
		
		driver.findElement(By.xpath("yourStore.cart")).click();
		verifySuccessfulMessage();
		driver.findElement(By.xpath("yourStore.close")).click();
		driver.findElement(By.xpath("yourStore.added")).click();
		verifySuccessfulMessage();
	}
	
	public void verifyProductDetails(){
		WebElement unitPriceElement=driver.findElement(By.xpath("yourStore.unitPrice"));
		String strUnitPrice="Unit Price";
		String unitPrice=unitPriceElement.getText();
		if(strUnitPrice.equalsIgnoreCase(unitPrice)){
			driver.findElement(By.xpath("//*[@class='price']")).isDisplayed();
		}
	}
	
	public void addtoCartFromWishList(){
		driver.findElement(By.xpath("yourStore.addCart1")).click();
		verifySuccessfulMessage();
	}
	
	public void removeItemFromWishList(){
		driver.findElement(By.xpath("yourStore.removeProductBtn")).clear();
		driver.findElement(By.xpath("yourStore.removeMsg1")).isDisplayed();
	}
	
	public void verifyAcountHeader(){
		driver.findElement(By.xpath("yourStore.myAcHeader1")).isDisplayed();
	}
	
}
