package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.PageGeneratorManager;
import com.qa.util.TestBase;
import com.qa.pages.LoginPageUI;

public class LoginPage  extends TestBase{
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateSuccessMsg() {
		return isControlDisplayed(LoginPageUI.successMessage);
		//return successMessage.isDisplayed();
	}
	
	public HomePage login(String name, String pwd) {
		sendKeyToElement(LoginPageUI.usernameElement, name);
		sendKeyToElement(LoginPageUI.passwordElement, pwd);
		clickToElement(LoginPageUI.loginButtonElement);
		
		//return new HomePage();
		return PageGeneratorManager.getHomePage();
	}
	
	
	public boolean verifyPasswordBlankTextDisplayed() {
		return isControlDisplayed(LoginPageUI.passwordBlankText);
		//return passwordBlankText.isDisplayed();
	}
	
	public boolean verifyUsernameBlankDisplayed() {
		return isControlDisplayed(LoginPageUI.usernameBlankText);
		//return usernameBlankText.isDisplayed();
	}
	
	public boolean verifyPasswordBlankDisplayed() {
		//return passwordBlankText.isDisplayed();
		return isControlDisplayed(LoginPageUI.passwordBlankText);
	}
	
	public boolean verifyUsernameAndPasswordBlankDisplayed() {
		boolean flag1 = isControlDisplayed(LoginPageUI.usernameBlankText);
		boolean flag2 = isControlDisplayed(LoginPageUI.passwordBlankText);
		if(flag1 && flag2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyIncorrectAccount() {
		return isControlDisplayed(LoginPageUI.incorrectAccountText);
	}

}
