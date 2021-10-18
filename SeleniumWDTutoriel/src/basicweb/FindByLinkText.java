package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByLinkText {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\dev\\SoftwareTesting_2122_SabrinaPevenage\\chromedriver.exe");
		driver = new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseURL = "https://learn.letskodeit.com/";
		driver.get(baseURL);
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Pract")).click();
		//werkt niet omdat navigatie verzet is
	}

}
