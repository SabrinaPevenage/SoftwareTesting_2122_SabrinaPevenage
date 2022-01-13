package boovieplex;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoovieplexZoekfunctie {
	private WebDriver driver;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.location = 'https://boovieplex-ccc62.web.app/'");
		Thread.sleep(2000);
	}

	@Test
	public void test() throws InterruptedException {
		//klik navbar
		WebElement navbar = driver.findElement(By.xpath("//div[@id='responsive-navbar-nav']//a[@href='/books']"));
		navbar.click();
		Thread.sleep(4000);
		
		//boek opzoeken
		driver.findElement(By.xpath("/html//div[@id='root']//div[@class='searchArea']/form/input[@type='text']")).sendKeys("snoopy");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html//div[@id='root']//div[@class='searchArea']/form/button[@class='btn-warning']")).click();
		Thread.sleep(4000);
		
		//scrollen
		js.executeScript("window.scrollBy(0, 600);");
		Thread.sleep(4000);
		
		//klikken op 'meer info'
		driver.findElement(By.xpath("/html//div[@id='root']//div[@class='list']/div[17]//a[@href='#']")).click();
		Thread.sleep(4000);
		
		//klikken op 'add to bookshelf'
		driver.findElement(By.xpath("/html//div[@id='root']/div/div[1]/div/div[@class='container']/div[1]//button[@class='btn-warning']")).click();
		Thread.sleep(4000);
		
		//klik tabblad 'saved'
		driver.findElement(By.xpath("//div[@id='responsive-navbar-nav']//a[@href='/Saved']")).click();
		Thread.sleep(4000);
		
		//scroll 
		js.executeScript("window.scrollBy(0, 400);");
		Thread.sleep(2000);
		
		//klik button 'Add to done'
		driver.findElement(By.xpath("/html//div[@id='root']//div[@class='savedList']//div[@class='cardContainer']/button[1]")).click();
		Thread.sleep(4000);
		
		//klik tabblad 'done'
		driver.findElement(By.linkText("Done")).click();
		Thread.sleep(4000);
		
		//boek verwijderen uit done
		driver.findElement(By.xpath("/html//div[@id='root']//div[@class='doneList']//button[@class='btn-warning']")).click();
		
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

}


