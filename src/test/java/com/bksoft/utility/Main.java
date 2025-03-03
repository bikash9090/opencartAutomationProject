package com.bksoft.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	public static void main(String[] args) {
//		ReadPropertiesFile rpf = new ReadPropertiesFile();
//		System.out.println(rpf.getUrl());
//		
//		
//		ExcelFileUtility excel = new ExcelFileUtility();
//		
//		excel.readExcelFile("LoginCredentials");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
				
		WebDriver driver = new ChromeDriver(options);
		ScreenshotUtility scrObj = new ScreenshotUtility(driver);
		
		driver.get("https://demo.opencart.com.gr/index.php?route=product/product&product_id=30");
		scrObj.captureScreenshot();
		
		

	}

}
