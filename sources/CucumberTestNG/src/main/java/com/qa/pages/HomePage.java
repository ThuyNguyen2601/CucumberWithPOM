package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Service Provider')]")
	WebElement serviceProviderMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Manage service provider')]")
	WebElement managementServiceProviderLink;
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public void clickToManagementServiceProvider() {
		Actions action = new Actions(driver);
		action.moveToElement(serviceProviderMenu).build().perform();
		managementServiceProviderLink.click();
	}

}
