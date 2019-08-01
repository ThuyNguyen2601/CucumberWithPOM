package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage  extends TestBase{
	//Page Factory - OR
	@FindBy(id="loginform-username")
	WebElement usernameElement;
	
	@FindBy(id="loginform-password")
	WebElement passwordElement;
	
	@FindBy(name="login-button")
	WebElement loginButtonElement;
	
	@FindBy(xpath="//p[@class='lead']")
	WebElement successMessage;
	
	@FindBy(xpath="//div[contains(text(),'Account name not allowed to be blank')]")
	WebElement usernameBlankText;
	
	@FindBy(xpath="//div[contains(text(),'Password not allowed to be blank')]")
	WebElement passwordBlankText;
	
	@FindBy(xpath="//div[contains(text(),'Account name or password is incorrect. Please try')]")
	WebElement incorrectUsernameORPasswordText;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateSuccessMsg() {
		return isControlDisplayed(successMessage);
		//return successMessage.isDisplayed();
	}
	
	public HomePage login(String name, String pwd) {
		sendKeyToElement(usernameElement, name);
		//username.sendKeys(name);
		sendKeyToElement(passwordElement, pwd);
		//password.sendKeys(pwd);
		clickToElement(loginButtonElement);
		//loginButton.click();
		
		return new HomePage();
	}
	
	
	public boolean verifyPasswordBlankTextDisplayed() {
		return isControlDisplayed(passwordBlankText);
		//return passwordBlankText.isDisplayed();
	}
	
	public boolean verifyUsernameBlankDisplayed() {
		return isControlDisplayed(usernameBlankText);
		//return usernameBlankText.isDisplayed();
	}
	
	public boolean verifyPasswordBlankDisplayed() {
		return passwordBlankText.isDisplayed();
	}
	
	public boolean verifyUsernameAndPasswordBlankDisplayed() {
		boolean flag1 = isControlDisplayed(usernameBlankText);
		boolean flag2 = isControlDisplayed(passwordBlankText);
		if(flag1 && flag2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyIncorrectUserNameAndPassword() {
		return isControlDisplayed(incorrectUsernameORPasswordText);
	}

}
