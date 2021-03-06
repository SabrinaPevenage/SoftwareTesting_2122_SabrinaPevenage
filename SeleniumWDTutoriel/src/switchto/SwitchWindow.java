package switchto;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		//Get the handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent handle: " + parentHandle);
				
		//Find Open window button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
				
		//Get all handles
		Set<String> handles = driver.getWindowHandles();
				
		//Switching between handles
		for (String handle: handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				WebElement searchBox = driver.findElement(By.id("search"));
				searchBox.sendKeys("python");
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
				
		//Switch back to the parent window
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

}
