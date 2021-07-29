package org.automation.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	public static String fetchPropertyValue(String key) throws IOException {
		String file = "./Config/Config.properties";
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.get(key).toString();
		
	}
	
	public static String fetchElementValues(String key) throws IOException {
		String file = "./Config/Elements.properties";
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.get(key).toString();
		
	}

}
