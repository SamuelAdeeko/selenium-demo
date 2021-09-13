package com.ebay.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {

	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "//Users//adekoyaadeeko//Downloads//chromedriver");
		driver = new ChromeDriver();
		
		// maximize browser
		driver.manage().window().maximize();
		
		// implicit wait (set some secs for the browser to load)
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// open ebay
		//driver.get("https://www.ebay.com/");
		
		// open target
		driver.get("https://www.target.com/");
	}
	
	@AfterSuite
	public void endTest() {
		
		TestBase.driver.quit();
	}
}
