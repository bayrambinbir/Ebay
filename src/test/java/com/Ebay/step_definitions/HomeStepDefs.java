package com.Ebay.step_definitions;

import org.openqa.selenium.WebDriver;

import com.Ebay.pages.HomePages;
import com.Ebay.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepDefs {
	
	WebDriver driver = Driver.getDriver();
	HomePages homePages = new HomePages();
	
	@When("user goes to {string}")
	public void user_goes_to(String url) {
	   driver.get(url);
	}

	@Then("user clicks on serach button")
	public void user_clicks_on_serach_button() {
	   homePages.searchForAnthingButton.click();
	}

	@Then("user searches for {string}")
	public void user_searches_for(String item) {
		homePages.searchForAnthingButton.sendKeys(item);
	}
	
	@Then("user clicks on Search button to search the item")
	public void user_clicks_on_Search_button_to_search_the_item() {
	homePages.searchButton.click();
	}
	
}
