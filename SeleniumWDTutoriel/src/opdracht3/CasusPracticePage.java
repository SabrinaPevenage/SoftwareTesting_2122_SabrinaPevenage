package opdracht3;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CasusPracticePage {
	private WebDriver driver;
	private String baseUrl;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.location = 'https://courses.letskodeit.com/practice'");
	}
	
	@Test
	public void test() throws Exception {
		//radiobutton
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		Thread.sleep(2000);
		
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();
		Thread.sleep(2000);
		
		//dropdown
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		driver.findElement(By.id("carselect")).click();
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		//multiple select
		WebElement element1 = driver.findElement(By.id("multiple-select-example"));
		Select sel1 = new Select(element1);
		
		sel1.selectByValue("apple");
		Thread.sleep(2000);
		
		sel1.selectByIndex(2);
		Thread.sleep(2000);
		
		//checkbox
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		Thread.sleep(2000);
		
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		Thread.sleep(2000);
		
		//naar sign in
		String currentUrl = driver.getCurrentUrl();
		String urlToNavigate = "https://courses.letskodeit.com/login";
		driver.navigate().to(urlToNavigate);
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("test@email.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[@class='row']//div[@class='text-center zen-login']/form[@role='form']//input[@value='Login']")).click();
		Thread.sleep(2000);
		
		driver.navigate().to(currentUrl);
		Thread.sleep(2000);
		
		//scroll
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		
		//hover
		Actions action = new Actions(driver);
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);
		
		WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		action.moveToElement(subElement).click().perform();
		Thread.sleep(4000);
		
		//control a
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(4000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
