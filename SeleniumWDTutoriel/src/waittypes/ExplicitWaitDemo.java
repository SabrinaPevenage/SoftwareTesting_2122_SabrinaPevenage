package waittypes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		emailField.sendKeys("test");
		
		//driver.findElement(By.id("email")).sendKeys("test");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
