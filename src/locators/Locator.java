package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverExe = "C:\\Users\\axa8047\\Drive D\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String applicationUrl = "https://facebook.com";
		
		// Invoke chrome driver .exe file
		System.setProperty("webdriver.chrome.driver", chromeDriverExe);
		
		// Chrome driver Object
		WebDriver driver = new ChromeDriver();
		
		// Launch google.com
		driver.get(applicationUrl);
		
		driver.manage().window().maximize();
		
		// Finding element by ID
		driver.findElement(By.id("email")).sendKeys("alexander.kirubhakran@gmail.com");
		// Finding element by Name
		driver.findElement(By.name("pass")).sendKeys("password");
		// Finding element by link text
		driver.findElement(By.linkText("Forgot Password?")).click();
	}

}
