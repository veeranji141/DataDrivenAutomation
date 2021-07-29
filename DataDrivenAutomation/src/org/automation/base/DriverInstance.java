package org.automation.base;

import java.io.IOException;

import org.automation.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverInstance {

	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws IOException {
		
		if(Utility.fetchPropertyValue("browserName").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (Utility.fetchPropertyValue("browserName").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (Utility.fetchPropertyValue("browserName").equalsIgnoreCase("internetexplorer")){
			System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(Utility.fetchPropertyValue("application_logIn_URL"));
	}
	
	@AfterMethod
	public void closeDriverInstance() {
		driver.close();
	}
}
