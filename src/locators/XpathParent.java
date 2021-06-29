package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverExe = "C:\\Users\\axa8047\\Drive D\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String applicationUrl = "https://google.com";
		
		// Invoke chrome driver .exe file
		System.setProperty("webdriver.chrome.driver", chromeDriverExe);
		
		// Chrome driver Object
		WebDriver driver = new ChromeDriver();
		
		// Launch google.com
		driver.get(applicationUrl);
		
		driver.manage().window().maximize();
		
		// xpath parent to child traverse
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Search input");
		
		// Below options can be implemented using xpath
		// following-sibling: --> To traverse to parent element (//*[@id='tablist1-tab1']/following-sibling::li[2])
		// parent: --> helps to traverse back to parent element (//*[@id='tablist1-tab1']/parent::ul) 
		
		// Text selector ==> //*[text()=' Selenium ']
	}

}
