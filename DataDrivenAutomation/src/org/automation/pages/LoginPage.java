package org.automation.pages;

import java.io.IOException;

import org.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String userName) throws IOException  {
		driver.findElement(By.id(Utility.fetchElementValues("login_page_username_textbox_id"))).sendKeys(userName);
	}
	
	public void enterPassword(String password) throws IOException  {
		driver.findElement(By.name(Utility.fetchElementValues("login_page_password_textbox_name"))).sendKeys(password);
	}
	
	public void clickOnLogin() throws IOException  {
		driver.findElement(By.xpath(Utility.fetchElementValues("login_page_login_button_xpath"))).click();
	}
}
