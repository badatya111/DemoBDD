package com.opencart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLaunch {

	 static WebDriver driver;
	 PropertiesFile propertiesFile=new PropertiesFile();
	 public void launchApp(){
			String browser=propertiesFile.getDataFromProperties("browser");
			String currentDirectory = System.getProperty("user.dir");
			String url=propertiesFile.getDataFromProperties("url");
		    WebDriverManager webManagerManager;
			switch(browser){
			case "chrome":
				System.out.println("Chrome Driver Launch");
				/*String chromeDiver=currentDirectory+"\\Drivers\\chromedriver.exe";
				System.out.println(chromeDiver);
				System.setProperty("webdriver.chrome.driver", chromeDiver);*/
				driver=WebDriverManager.chromedriver().create();
				break;
			case "firefox":
				System.out.println("Chrome Driver Launch");
				String firefoxDiver=currentDirectory+"\\Drivers\\geckodriver.exe";
				System.setProperty("webdriver.geckodriver.driver", firefoxDiver);
				driver=new FirefoxDriver();
				break;
			}
			System.out.println(url);
			driver.get(url);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
	 
	 public void exitDriver() {
		 driver.close();
		 driver.quit();
	 }

}
