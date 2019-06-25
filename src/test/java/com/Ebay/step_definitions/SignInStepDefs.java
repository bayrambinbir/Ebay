package com.Ebay.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Ebay.pages.SignInPages;
import com.Ebay.utilities.BrowserUtils;
import com.Ebay.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInStepDefs {

	WebDriver driver = Driver.getDriver();
	SignInPages signIn = new SignInPages();

	@When("I am on ebay website {string}")
	public void i_am_on_ebay_website(String ebayWebsite) {
		// navigate to ebay website
		driver.get(ebayWebsite);

	}

	@Then("I click on Sign In Button")
	public void i_click_on_Sign_In_Button() {
		// click on the sign in button
		try {
			driver.findElement(By.xpath("//a[contains(@href,'signin.ebay')]")).click();
		} catch (Exception e) {
			System.out.println("EXCEPTION: "+e);
		}
		BrowserUtils.waitFor(2);
	}

	@Then("I type {string} and {string}")
	public void i_type_and(String emailOrUsername, String password) {
		// email
		driver.findElement(By.id("userid")).click();
		driver.findElement(By.id("userid")).sendKeys(emailOrUsername);

		// password
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys(password);

		// click the sign in button
		driver.findElement(By.id("sgnBt")).click();

	}

}