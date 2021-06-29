package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeDriverExe = "C:\\Users\\axa8047\\Drive D\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String applicationUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
		
		// Invoke chrome driver .exe file
		System.setProperty("webdriver.chrome.driver", chromeDriverExe);
		
		// Chrome driver Object
		WebDriver driver = new ChromeDriver();
		
		// Launch google.com
		driver.get(applicationUrl);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	}

}
