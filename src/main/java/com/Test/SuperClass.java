package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class SuperClass {

	protected WebDriver driver;
	
	//@Parameters("browser")
	
	  @BeforeTest
	  public void beforeTest() {
		
//		if(browser.equalsIgnoreCase("Chrome"))
//		{
		  System.setProperty("webdriver.chrome.driver","Libs3\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://demoqa.com/");
		} 
//	else if(browser.equalsIgnoreCase("firefox"))
//			
//		 System.setProperty("webdriver.gecko.driver","Libs2\\geckodriver.exe");
//			driver=new FirefoxDriver();
//			driver.manage().window().maximize();
//			driver.navigate().to("http://demoqa.com/");
//		  
//	  }

	//@AfterTest
	  public void closeBrwser()
	  {
		  driver.quit();
	  }

	  
}


