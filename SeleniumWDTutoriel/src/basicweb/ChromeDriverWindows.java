package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\dev\\SoftwareTesting_2122_SabrinaPevenage\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://letskodeit.com";
		driver.get(baseURL);
	}

}
