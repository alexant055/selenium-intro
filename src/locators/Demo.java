package locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverExe = "C:\\Users\\axa8047\\Drive D\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String applicationUrl = "https://www.google.com";
		
		// Invoke chrome driver .exe file
		System.setProperty("webdriver.chrome.driver", chromeDriverExe);
		
		// Chrome driver Object
		WebDriver driver = new ChromeDriver();
		
		// Launch google.com
		driver.get(applicationUrl);
		
		// Get page title
		String pageTitle = driver.getTitle();
		
		// Print the title
		System.out.println("Page Title: " + pageTitle);
		System.out.println("Current URL: " + driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.manage().window().fullscreen();
		// Close the current window
		driver.close();
		// Close all windows (Parent and child windows)
		driver.quit();
	}

}
