package com.ebay.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class EbayHomePage {

	private WebDriver driver;
	private static Logger log = Logger.getLogger(EbayHomePage.class);
	
	public EbayHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Using findBy for locating elements
	@FindBy(how=How.XPATH, using= "//input[@id = 'gh-ac']") WebElement searchForAnything;
	@FindBy(how=How.XPATH, using = "//input[@id ='gh-btn'][@type= 'submit'][@value= 'Search']") WebElement searchButton;
	
	// defining all user actions that can be performed on Ebay home page
	
	// This method will be used to enter a search item
	
	public void setSearch(String item) {
		searchForAnything.sendKeys(item);
		log.info("Searched item is: " + item);
	}
	
	// This method will be used to click the search button
	
	public void setSearchButton() {
		searchButton.click();
		log.info("Search button clicked");
	}

	
}
