package org.automation.testcases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.base.*;
import org.automation.datagenerators.DataGenerator;
import org.automation.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_01_ValidateLogInFunctionality extends DriverInstance{
	
	
	@Test(dataProvider="excel", dataProviderClass=DataGenerator.class)
	public void TC_001_LoinFunctionality(String uName, String Pass) throws IOException {
		
		LoginPage login = new  LoginPage(driver);
		login.enterUserName(uName);
		login.enterPassword(Pass);
		login.clickOnLogin();
		
	}
		
}
