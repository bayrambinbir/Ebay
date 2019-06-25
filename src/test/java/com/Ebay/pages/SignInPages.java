package com.Ebay.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ebay.utilities.Driver;

public class SignInPages {

	public SignInPages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	WebDriver driver = Driver.getDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//a[contains(@href,'signin.ebay')]")
	public WebElement signInButton;

}