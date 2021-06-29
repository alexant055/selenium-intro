import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firefoxDriverExe = "C:\\Users\\axa8047\\Drive D\\Training\\Selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe";
		String applicationUrl = "https://www.google.com";

		// Invoke firefox driver .exe file
		System.setProperty("webdriver.gecko.driver", firefoxDriverExe);

		// Firefox driver Object
		WebDriver driver = new FirefoxDriver();

		// Launch google.com
		driver.get(applicationUrl);

		// Get page title
		String pageTitle = driver.getTitle();

		// Print the title
		System.out.println(pageTitle);

	}

}
