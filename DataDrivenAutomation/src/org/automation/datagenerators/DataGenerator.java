package org.automation.datagenerators;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	@DataProvider(name="excel")
	public static Object [] [] testDataGenerator(Method met) throws IOException {
	
		if(met.getName().equalsIgnoreCase("TC_01_ValidateLogInFunctionality")) {
		FileInputStream fis = new FileInputStream("./TestData/Excelsheet1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		
		Object [] [] testData = new Object[rows][2];
		for(int i=0; i<rows; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell userName =row.getCell(0);
			XSSFCell Password =row.getCell(1);
			testData[i][0] = userName.getStringCellValue();
			testData[i][1] = Password.getStringCellValue();	
		}
		
		return testData;
		}
		else if(met.getName().equalsIgnoreCase("TC_02_ValidateRegistrationFunctionality")) {
				FileInputStream fis = new FileInputStream("./TestData/Excelsheet1.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheet("Sheet2");
				int rows = sheet.getPhysicalNumberOfRows();
				
				Object [] [] testData = new Object[rows][2];
				for(int i=0; i<rows; i++) {
					XSSFRow row = sheet.getRow(i);
					XSSFCell userName =row.getCell(0);
					XSSFCell Password =row.getCell(1);
					testData[i][0] = userName.getStringCellValue();
					testData[i][1] = Password.getStringCellValue();	
				}
				
				return testData;
				}
			
		else {
			Object[] [] testData = new Object [2] [3];
			return testData;
			
		}
	}
}
