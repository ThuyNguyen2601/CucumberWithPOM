package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;
import com.qa.util.TestBase;

public class LoginPage extends AbstractTest {

	// Page Factory - OR
	@FindBy(id = "loginform-username")
	public WebElement usernameElement;

	@FindBy(id = "loginform-password")
	public WebElement passwordElement;

	@FindBy(name = "login-button")
	public WebElement loginButtonElement;

	@FindBy(xpath = "//p[@class='lead']")
	public WebElement successMessage;

	@FindBy(xpath = "//div[contains(text(),'Account name not allowed to be blank')]")
	public WebElement usernameBlankText;

	@FindBy(xpath = "//div[contains(text(),'Password not allowed to be blank')]")
	public WebElement passwordBlankText;

	@FindBy(xpath = "//div[contains(text(),'Account name or password is incorrect. Please try')]")
	public WebElement incorrectAccountText;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateSuccessMsg() {
		return isControlDisplayed(successMessage);
		// return successMessage.isDisplayed();
	}

	public HomePage login(String name, String pwd) {
		sendKeyToElement(usernameElement, name);
		sendKeyToElement(passwordElement, pwd);
		clickToElement(loginButtonElement);

		// return new HomePage();
		return PageGeneratorManager.getHomePage();
	}

	public boolean verifyPasswordBlankTextDisplayed() {
		waitForElementVisible(passwordBlankText);
		return isControlDisplayed(passwordBlankText);
	}

	public boolean verifyUsernameBlankDisplayed() {
		waitForElementVisible(usernameBlankText);
		return isControlDisplayed(usernameBlankText);
	}

	public boolean verifyPasswordBlankDisplayed() {
		waitForElementVisible(passwordBlankText);
		return isControlDisplayed(passwordBlankText);
	}

	public boolean verifyUsernameAndPasswordBlankDisplayed() {
		boolean flag1 = isControlDisplayed(usernameBlankText);
		boolean flag2 = isControlDisplayed(passwordBlankText);
		if (flag1 && flag2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyIncorrectAccount() {
		return isControlDisplayed(incorrectAccountText);
	}

}
