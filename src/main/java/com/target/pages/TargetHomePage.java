package com.target.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TargetHomePage {

	
	private WebDriver driver;
	private static Logger log = Logger.getLogger(TargetHomePage.class);
	
	public TargetHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//using findBy for locating elements
	@FindBy(how=How.XPATH, using = "//input[@id = 'search']") WebElement searchField;
	

	public void searchItem(String item) {
		searchField.sendKeys(item);
		log.trace("Searched item is: " + item);
	}
}
