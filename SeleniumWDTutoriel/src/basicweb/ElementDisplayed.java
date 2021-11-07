package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
	WebDriver driver;
	String baseUrl1;
	String baseUrl2;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl1 = "https://courses.letskodeit.com/practice";
		baseUrl2 = "https://www.expedia.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test
	public void testLetsKodeIt() throws InterruptedException {
		driver.get(baseUrl1);
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked on hide button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("Clicked on show button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
	}
	
	@Test
	public void testExpedia() {
		driver.get(baseUrl2);
		
		WebElement childDropdown = driver.findElement(By.id("package-1-age-select-1"));
		System.out.println("child Dropdown Displayed: " + childDropdown.isDisplayed());
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
