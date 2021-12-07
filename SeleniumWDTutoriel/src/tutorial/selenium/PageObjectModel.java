package tutorial.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.SearchPage;

public class PageObjectModel {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.be/";
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	

	@Test
	public void test() {
		driver.get(baseUrl);
		SearchPage.destinationTextBox(driver).sendKeys("New York");
		SearchPage.departureDateTextBox(driver).sendKeys("25/12/2021");
		SearchPage.returnDateTextBox(driver).sendKeys("31/12/2021");
		SearchPage.clickOnSearchButton(driver);
	}

	@After
	public void tearDown() throws Exception {
	}

}
