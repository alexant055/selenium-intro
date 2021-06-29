package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
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
		
		// Find the drop down element
		WebElement currencyDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		// Instantiate the select by the drop down element
		Select currencyDropdown = new Select(currencyDropdownElement);
		
		// Select the option by index
		currencyDropdown.selectByIndex(2);
		
		String selectedCurrency = currencyDropdown.getFirstSelectedOption().getText();		
		System.out.println(selectedCurrency);
		
		// Select the option by visible text on the dropdown
		currencyDropdown.selectByVisibleText("USD");
		
		selectedCurrency = currencyDropdown.getFirstSelectedOption().getText();		
		System.out.println(selectedCurrency);
		
		// Select the option by the value attribute
		currencyDropdown.selectByValue("INR");
		
		selectedCurrency = currencyDropdown.getFirstSelectedOption().getText();		
		System.out.println(selectedCurrency);
				
	}

}
