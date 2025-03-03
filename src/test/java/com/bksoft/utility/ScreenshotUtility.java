package com.bksoft.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	WebDriver driver;

	ScreenshotUtility(WebDriver driver) {
		this.driver = driver;

	}

	void captureScreenshot() {

		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File source = takescreenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\screenshots\\scr.png");
		
		try {
			FileUtils.copyFile(source, destination);
			System.out.println("Screenshot captured and copied successfully!");
		} catch (IOException e) {
			System.out.println("IO exception occured!");
			e.printStackTrace();
		}
	}
}
