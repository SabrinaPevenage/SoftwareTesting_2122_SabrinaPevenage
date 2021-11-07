package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBetweenPages {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URLis: " + currentUrl);
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/identity/login";
		driver.navigate().to(urlToNavigate);
		System.out.println("navigating to login");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URLis: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URLis: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URLis: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URLis: " + currentUrl);
		
		driver.navigate().refresh();
		System.out.println("Navigate refresh");
		driver.get(currentUrl);
		System.out.println("Navigate refresh");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
