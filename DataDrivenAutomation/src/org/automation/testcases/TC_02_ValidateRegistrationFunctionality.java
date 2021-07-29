package org.automation.testcases;

import java.io.IOException;

import org.automation.base.DriverInstance;
import org.automation.datagenerators.DataGenerator;
import org.automation.pages.RegisterPage;
import org.testng.annotations.Test;

public class TC_02_ValidateRegistrationFunctionality extends DriverInstance  {
	
	@Test(dataProvider="excel", dataProviderClass=DataGenerator.class)
	public void TC_02_ValidateRegistrationFunctionality(String userName, String Password) throws IOException
	{
		RegisterPage register = new RegisterPage(driver);
		register.clickOnForgotPassword();
		register.enterUserNameRegisterPage(userName);
		register.enterPasswordRegisterPage(Password);
	}

}
