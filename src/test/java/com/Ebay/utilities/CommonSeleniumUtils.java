package com.Ebay.utilities;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonSeleniumUtils extends Driver {
	
	 static WebDriver driver = Driver.getDriver();

	public void switchToWindowByTitle(String title) {
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Amount of windows that are currently present :: " + windows.size());
		for (String window : windows) {
			driver.switchTo().window(window);
			if (driver.getTitle().startsWith(title) || driver.getTitle().equalsIgnoreCase(title)) {
				break;
			} else {
				continue;
			}
		}
	}

	public void clickWithJS(WebElement elementtoclick) {
		WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(ConfigurationReader.getProperty("timeout")));
		wait.until(ExpectedConditions.elementToBeClickable(elementtoclick));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementtoclick);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementtoclick);
	}

	public void waitForPresenceOfElementByCss(String css) {
		WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(ConfigurationReader.getProperty("timeout")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
	}

	public void waitForVissibilityOfElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(ConfigurationReader.getProperty("timeout")));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForStaleElement(WebElement element) {
		int i = 0;
		while (i < 10) {
			try {
				element.isDisplayed();
				break;
			} catch (StaleElementReferenceException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
				i++;
			} catch (NoSuchElementException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
				i++;
			} catch (WebDriverException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
				i++;
			}
		}
	}

	public boolean verifyElementIsNotPresent(String xpath) {
		List<WebElement> elemetns = driver.findElements(By.xpath(xpath));
		return elemetns.size() == 0;
	}

	public boolean verifyElementIsNotPresent(By by) {
		List<WebElement> elemetns = driver.findElements(by);
		return elemetns.size() == 0;
	}

	public void scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void hitEnterUsingRobot() {
		Robot rb;
		try {
			rb = new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean verifyAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException Ex) {
			System.out.println("Alert is not presenet");
		}
		return false;
	}

	public static void takeSnapShot() {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "\\screenshots.jpg";
			System.out.println(path);
			File DestFile = new File(path);
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public void safeJavaScriptClick(WebElement element) throws Exception {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element with using java script click");

				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} else {
				System.out.println("Unable to click on element");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM "+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to click on element "+ e.getStackTrace());
		}
	}
}
