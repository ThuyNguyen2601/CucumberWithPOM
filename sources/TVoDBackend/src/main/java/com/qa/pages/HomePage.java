package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.PageGeneratorManager;
import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
	public WebElement userNameLabel;
	
	@FindBy(xpath = "//a[contains(text(),'Service Provider')]")
	public WebElement serviceProviderMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Manage service provider')]")
	public WebElement managementServiceProviderLink;
	
	@FindBy(xpath = "//a[contains(text(),'Content Provider')]")
	public WebElement contentProviderMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Manage content provider')]")
	public WebElement manageContentProviderMenu;
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		waitForElementVisible(userNameLabel);
		return isControlDisplayed(userNameLabel);
	}
	
	public void clickToManagementServiceProvider() {
		Actions action = new Actions(driver);
		action.moveToElement(serviceProviderMenu).build().perform();
		clickToElementByJavaScript(managementServiceProviderLink);
	}
	
	public ServiceProvider gotoServiceProviderPage() throws Throwable {
		moveToElementByJS(serviceProviderMenu);
		clickToElementByJavaScript(managementServiceProviderLink);
		return PageGeneratorManager.getServiceProvider();
	}
	
	public ContentProvider gotoContentProviderPage() throws Throwable {
		moveToElementByJS(contentProviderMenu);
		clickToElementByJavaScript(manageContentProviderMenu);
		return PageGeneratorManager.getContentProvider();
	}

}
