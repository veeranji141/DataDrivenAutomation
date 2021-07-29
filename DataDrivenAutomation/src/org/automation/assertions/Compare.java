package org.automation.assertions;

import org.openqa.selenium.WebDriver;

public class Compare {

	public static boolean validatePageURL(WebDriver driver, String expectedURL) {
		boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expectedURL)) {
			
			result = true;
			
		}
		return result;
	}
	
	public static boolean validatePageTitle(WebDriver driver, String expectedTitle) {
		boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expectedTitle)) {
			
			result = true;
			
		}
		return result;
	}
	
}
