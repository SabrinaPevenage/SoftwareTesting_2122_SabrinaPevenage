package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public static WebElement element = null;
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return 
	 */
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.className("flight-origin"));
		return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
	}
	
	/**
	 * Returns the flight destination text box element 
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.className("uitk-fake-input uitk-form-field-trigger"));
		return element;
	}
	
	/**
	 * Returns the departure date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("d1-btn"));
		return element;
	}
	
	/**
	 * Returns the return date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("d2-btn"));
		return element;
	}
	
	/**
	 * Returns the search button box element 
	 * @param driver
	 * @return
	 */
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("submit-button"));
		return element;
	}
	
	/**
	 * Click on search button
	 * @param driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	
	/**
	 * Navigate to flights tab
	 * @param driver
	 */
	public static void navigateToFlightsButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='wizardMainRegion']//ul[@role='tablist']/li[2]/a[@role='tab']"));
		element.click();
	}
	

	

}
