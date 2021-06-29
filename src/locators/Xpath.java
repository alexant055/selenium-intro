package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

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
		// xpath format: //<tagName>[@<attribute>=<value>]
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("username entered");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("username entered");
		driver.findElement(By.xpath("//*[@name='login']")).click();
	}

}
