package com.bksoft.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bksoft.base.PageBase;

public class HomePage extends PageBase{
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myAccountBtn;
	
	@FindBy(linkText="Register")
	private WebElement registerBtn;
	
	@FindBy(linkText="Login")
	private WebElement loginBtn;
	
	HomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);;
	}
	
	public void clickOnMyAccout() {
		myAccountBtn.click();
	}
	
	public void clickOnRegister() {
		registerBtn.click();
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
	
	

}
