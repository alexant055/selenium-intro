package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
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
		// CSS Selector format: <tagName>[<attribute>=<value>]
		// If tagName is not needed, remove that.
		// ID format: tagName#<id>
		// class name format: tagName.className
		driver.findElement(By.cssSelector("input#email")).sendKeys("username entered"); // #email or input[id='email']
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("username entered");
		driver.findElement(By.cssSelector("[name='login']")).click();
	}
}
