package com.Ebay.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Ebay.utilities.BrowserUtils;
import com.Ebay.utilities.Driver;

public class HomePages {

	public HomePages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	WebDriver driver = Driver.getDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//*[@id='gh-ac']")
	public WebElement searchForAnthingButton;

	@FindBy(xpath = "(//*[@type='submit'])[1]")
	public WebElement searchButton;

	@FindBy(id = "vi-itm-cond")
	public WebElement conditionButton;

	@FindBy(id = "binBtn_btn")
	public WebElement buyItNowButton;

	public void clickOnBuyItButton() {
		js.executeScript("arguments[0].click();", buyItNowButton);
		// buyItNowButton.click();
	}

	@FindBy(id = "msku-sel-1")
	public WebElement selectColorButton;

	public void selectColor(String color) {
		Select colorOption = new Select(selectColorButton);
		colorOption.selectByVisibleText(color);
	}

	public void clickOnItem(int number) {
		List<WebElement> items = driver.findElements(By.xpath("//a[@class='s-item__link']"));
		System.out.println("ITEM NAME: " + items.get(number - 1).getText());
		items.get(number - 1).click();
	}

	public void buyIfNew(String condition, String color) {
		String conditionTextFromEbay = conditionButton.getText();
		System.out.println("CONDITION: " + conditionTextFromEbay);
		if (conditionTextFromEbay.toLowerCase().equals(condition.toLowerCase())) {
			selectColor(color);
			clickOnBuyItButton();

		}
	}

}