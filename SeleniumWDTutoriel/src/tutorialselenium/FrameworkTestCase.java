package tutorialselenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.SearchPageFactory;

public class FrameworkTestCase {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.be/";
		
		searchPage = new SearchPageFactory(driver);
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		searchPage.ClickFlightsTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("Belgium");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
