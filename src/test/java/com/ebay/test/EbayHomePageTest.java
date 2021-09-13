package com.ebay.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ebay.pages.EbayHomePage;
import com.ebay.pages.EbaySearchedProductPage;

public class EbayHomePageTest extends TestBase {

	
	@Test
	public void init() throws InterruptedException {
		
		EbayHomePage homePage = PageFactory.initElements(driver, EbayHomePage.class);
		homePage.setSearch("iphone");
		homePage.setSearchButton();
		Thread.sleep(4000);
		
		EbaySearchedProductPage productPage = PageFactory.initElements(driver, EbaySearchedProductPage.class);
		
	}
	
}
