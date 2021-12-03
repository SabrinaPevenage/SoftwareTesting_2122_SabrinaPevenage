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

public class KeyPressDemo1 {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://courses.letskodeit.com/";
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test
	public void testKeyPress() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
		driver.findElement(By.id("email")).sendKeys("test@email.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		//driver.findElement(By.id("password")).sendKeys("123123");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[@class='row']//div[@class='text-center zen-login']/form[@role='form']//input[@value='Login']")).sendKeys(Keys.ENTER);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

}
