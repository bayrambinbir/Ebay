package com.Ebay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ebay.utilities.Driver;

public class HomePages {

	public HomePages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//*[@id='gh-ac']")
	public WebElement searchForAnthingButton;
	
	@FindBy (xpath = "(//*[@type='submit'])[1]")
	public WebElement searchButton;
	
	
	//Notes
}