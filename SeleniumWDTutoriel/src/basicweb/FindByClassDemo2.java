package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassDemo2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		String baseURL = "https://www.facebook.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.className("inputtext")).sendKeys("Automation");
		driver.findElement(By.className("_6lth")).click();

	}

}
