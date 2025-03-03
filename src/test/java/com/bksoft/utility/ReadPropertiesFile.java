package com.bksoft.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	Properties prop;

	ReadPropertiesFile() {
		FileInputStream fis;
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
		prop = new Properties();
		
		try {
			fis = new FileInputStream(path);
			prop.load(fis);

		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found on path : " + path);
		} catch (IOException e) {
			System.out.println("IO error occured during reading the properties file");
		}
	}

	public String getUrl() {
		return prop.getProperty("url");
	}

}
