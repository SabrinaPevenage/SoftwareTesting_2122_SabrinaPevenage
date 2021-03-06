package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	
	@FindBy(id="header-history")
	WebElement headerHistory;
	
	@FindBy(id="tab-flight-tab")
	WebElement flightTab;
	
	@FindBy(id="flight-origin")
	WebElement originCity;
	
	@FindBy(id="flight-destination")
	WebElement destinationCity;
	
	@FindBy(id="flight-departing")
	WebElement departureDate;
	
	@FindBy(id="flight-returning")
	WebElement returningDate;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickFlightsTab() {
		headerHistory.click();
		flightTab.click();
	}
	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		originCity.sendKeys(destination);
	}
}
