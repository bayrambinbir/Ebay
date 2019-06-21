package com.Ebay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ebay.utilities.Driver;

public class RegisterPages {

	public RegisterPages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "(//a[contains(text(),'register')])[1]")
	public WebElement registerButton;

	// @FindBy(xpath = "//*[contains(text(),'First name')]") OR
	// @FindBy(id = "firstname") OR
	// @FindBy(xpath = "//input[@id='firstname']") OR
	@FindBy(xpath = "//*[@id='firstname']")
	public WebElement firstName;

	// @FindBy(xpath = "//*[contains(text(),'Last name')]") OR
	@FindBy(id = "lastname")
	public WebElement lastName;

	@FindBy(id = "email")
	public WebElement email;

	// @FindBy(xpath = "//*[contains(text(),'Password')]") OR
	@FindBy(id = "PASSWORD")
	public WebElement password;

	// @FindBy(xpath = "//*[contains(text(),'Create account')]") OR
	@FindBy(id = "ppaFormSbtBtn")
	public WebElement createAccount;

}
