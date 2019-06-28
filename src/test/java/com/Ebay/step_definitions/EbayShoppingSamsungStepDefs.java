package com.Ebay.step_definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Ebay.utilities.Driver;

import cucumber.api.java.en.Then;

public class EbayShoppingSamsungStepDefs {

	WebDriver driver = Driver.getDriver();

	@Then("user buys the Brand New samsung")
	public void user_buys_the_Brand_New_samsung() {

		List<WebElement> conditions = driver.findElements(By.xpath("//div[@class='s-item__subtitle']/span"));

		int indexForNewSamsung = 0;
		for (int i = 0; i < conditions.size(); i++) {
			if (conditions.get(i).getText().contains("Brand New")) {
				indexForNewSamsung = i;
				break;
			}

		}
		
		List<WebElement> samsungs = driver.findElements(By.xpath("//div[@class='s-item__image-section']"));
		samsungs.get(indexForNewSamsung).click();
	}
}
