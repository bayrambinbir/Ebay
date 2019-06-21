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
	public void user_goes_to(String ebayUrl) {
		driver.get(ebayUrl);
	}

	@Then("user clicks on search button")
	public void user_clicks_on_search_button() {
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

	@Then("user clicks on item <{int}> to purchase it if item is {string} and choose {string} as desired color")
	public void user_clicks_on_item_to_purchase_it_if_item_is_and_choose_as_desired_color(Integer number, String condition, String color) {
		homePages.clickOnItem(number);
		homePages.buyIfNew(condition, color);
	}

}
