package com.bksoft.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bksoft.utility.ScreenshotUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainTest {
	
	@Test
	public void screenshotTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		ScreenshotUtility scrutil = new ScreenshotUtility(driver);
		
		driver.get("https://google.com");
		scrutil.captureScreenshot();
	}

}
