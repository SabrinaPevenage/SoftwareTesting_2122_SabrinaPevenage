package keypress;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressDemo3 {
	private WebDriver driver;
	private String baseUrl;


	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

}
