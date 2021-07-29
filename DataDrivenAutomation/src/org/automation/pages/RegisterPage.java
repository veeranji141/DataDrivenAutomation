package org.automation.pages;

import java.io.IOException;

import org.automation.base.*;
import org.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegisterPage {
	
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}		
		public void enterUserNameRegisterPage(String userName) throws IOException  {
			driver.findElement(By.id(Utility.fetchElementValues("register_page_name_id"))).sendKeys(userName);
		}
		
		public void enterPasswordRegisterPage(String password) throws IOException  {
			driver.findElement(By.id(Utility.fetchElementValues("register_page_username_id"))).sendKeys(password);
		}
		
		public void clickOnForgotPassword() throws IOException  {
			driver.findElement(By.xpath(Utility.fetchElementValues("register_page_forgot_password_xpath"))).click();
		}
		
	

}
