package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverExe = "C:\\Users\\axa8047\\Drive D\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String applicationUrl = "https://rediff.com";
		
		// Invoke chrome driver .exe file
		System.setProperty("webdriver.chrome.driver", chromeDriverExe);
		
		// Chrome driver Object
		WebDriver driver = new ChromeDriver();
		
		// Launch google.com
		driver.get(applicationUrl);
		
		driver.manage().window().maximize();
		
		// Regex xPath Format: //tagName[contains(@attribute, 'value')] --> e.g //input[contains(@name, 'email')]
		// Regex css selector Format: tagName[attribute*='value'] --> e.g input[name*='email']
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login')]")).sendKeys("username entered");
		driver.findElement(By.xpath("//input[contains(@name, 'passwd')]")).sendKeys("username entered");
		driver.findElement(By.cssSelector("input[value*='Sign in']")).click();
		
	}

}
