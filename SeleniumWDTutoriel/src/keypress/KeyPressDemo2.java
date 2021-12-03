package keypress;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressDemo2 {
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
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		//Thread.sleep(2000);
		String selectAll = Keys.chord(Keys.CONTROL, "a");
		driver.findElement(By.id("openwindow")).sendKeys(selectAll);
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
