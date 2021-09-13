package com.target.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ebay.test.TestBase;
import com.target.pages.TargetHomePage;

public class TargetHomePageTest extends TestBase {

	
	@Test
	public void init() {
		
		TargetHomePage homePage = PageFactory.initElements(driver, TargetHomePage.class);
		homePage.searchItem("iPhone");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
