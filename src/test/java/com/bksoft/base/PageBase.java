package com.bksoft.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	protected WebDriver driver;
	private WebDriverWait wait;

	protected PageBase(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	protected void waitUntilVisibilityOfElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	protected void waitUntilVisibilityOfElement(WebElement element, int timeoutInSec) {
		new WebDriverWait(driver, Duration.ofSeconds(timeoutInSec)).until(ExpectedConditions.visibilityOf(element));
	}

}
