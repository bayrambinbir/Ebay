package com.Ebay.step_definitions;

import org.openqa.selenium.WebDriver;

import com.Ebay.pages.RegisterPages;
import com.Ebay.utilities.BrowserUtils;
import com.Ebay.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefs {
	// import everything shortcut -->> For Mac Command + shift + O

	WebDriver driver = Driver.getDriver();
	RegisterPages registerPages = new RegisterPages();

	@When("I go to {string}")
	public void i_go_to(String ebayUrl) {
		driver.get(ebayUrl);
	}

	@Then("I get the title of Ebay to make sure that I am in Ebay")
	public void i_get_the_title_of_Ebay_to_make_sure_that_I_am_in_Ebay() {
		String ebayTitle = driver.getTitle();
		System.out.println("Website name: " + ebayTitle);
	}

	@Then("I click on Register Button")
	public void i_click_on_Register_Button() {
		registerPages.registerButton.click();
	}

	@Then("type {string} , {string} , {string} and {string}")
	public void type_and(String nameForEbay, String lastNameForEbay, String emailForEbay, String passwordForEbay) {
		// First Name
		registerPages.firstName.click();
		registerPages.firstName.sendKeys(nameForEbay);

		// LastName
		registerPages.lastName.click();
		registerPages.lastName.sendKeys(lastNameForEbay);

		// email
		registerPages.email.click();
		registerPages.email.sendKeys(emailForEbay);

		// Password
		registerPages.password.click();
		registerPages.password.sendKeys(passwordForEbay);
	}

	@Then("I click on Create Account Button")
	public void i_click_on_Create_Account_Button() {
		BrowserUtils.waitFor(2);
		registerPages.createAccount.click();
	}
}
