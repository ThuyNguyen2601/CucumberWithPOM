package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageUI {
	
	//Page Factory - OR
		@FindBy(id="loginform-username")
		public static WebElement usernameElement;
		
		@FindBy(id="loginform-password")
		public static WebElement passwordElement;
		
		@FindBy(name="login-button")
		public static WebElement loginButtonElement;
		
		@FindBy(xpath="//p[@class='lead']")
		public static WebElement successMessage;
		
		@FindBy(xpath="//div[contains(text(),'Account name not allowed to be blank')]")
		public static WebElement usernameBlankText;
		
		@FindBy(xpath="//div[contains(text(),'Password not allowed to be blank')]")
		public static WebElement passwordBlankText;
		
		@FindBy(xpath="//div[contains(text(),'Account name or password is incorrect. Please try')]")
		public static WebElement incorrectAccountText;

}
