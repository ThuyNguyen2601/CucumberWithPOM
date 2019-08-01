package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage  extends TestBase{
	//Page Factory - OR
	@FindBy(id="loginform-username")
	WebElement username;
	
	@FindBy(id="loginform-password")
	WebElement password;
	
	@FindBy(name="login-button")
	WebElement loginButton;
	
	@FindBy(xpath="//p[@class='lead']")
	WebElement successMessage;
	
	@FindBy(xpath="//div[contains(text(),'Account name not allowed to be blank')]")
	WebElement usernameBlankText;
	
	@FindBy(xpath="//div[contains(text(),'Password not allowed to be blank')]")
	WebElement passwordBlankText;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateSuccessMsg() {
		return successMessage.isDisplayed();
	}
	
	public HomePage login(String name, String pwd) {
		username.sendKeys(name);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
	
	public boolean usernameBlankTextDisplayed() {
		return usernameBlankText.isDisplayed();
	}
	
	public boolean passwordBlankTextDisplayed() {
		return passwordBlankText.isDisplayed();
	}
	
	public boolean verifyUsernameBlankDisplayed() {
		return usernameBlankText.isDisplayed();
	}
	
	public boolean verifyPasswordBlankDisplayed() {
		return passwordBlankText.isDisplayed();
	}

}
