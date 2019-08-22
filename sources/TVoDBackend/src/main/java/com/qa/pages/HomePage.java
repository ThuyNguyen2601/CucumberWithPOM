package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.PageGeneratorManager;
import com.qa.util.TestBase;
import com.qa.pages.HomePageUI;

public class HomePage extends TestBase{
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		//return HomePageUI.userNameLabel.isDisplayed();
		return isControlDisplayed(HomePageUI.userNameLabel);
	}
	
	public void clickToManagementServiceProvider() {
		Actions action = new Actions(driver);
		action.moveToElement(HomePageUI.serviceProviderMenu).build().perform();
		//HomePageUI.managementServiceProviderLink.click();
		clickToElement(HomePageUI.managementServiceProviderLink);
	}
	
	public ServiceProvider gotoServiceProviderPage() throws Throwable {
		moveToElementByJS(HomePageUI.serviceProviderMenu);
		moveToElement(HomePageUI.serviceProviderMenu);
		//Thread.sleep(1000);
		//clickToElementByJavaScript(HomePageUI.managementServiceProviderLink);
		clickToElement(HomePageUI.managementServiceProviderLink);
		//return new ServiceProvider();
		return PageGeneratorManager.getServiceProvider();
	}
	
	public ContentProvider gotoContentProviderPage() throws Throwable {
		//moveToElementByJS(HomePageUI.contentProviderMenu);
		moveToElement(HomePageUI.contentProviderMenu);
		//Thread.sleep(1000);
		//clickToElementByJavaScript(HomePageUI.manageContentProviderMenu);
		clickToElement(HomePageUI.manageContentProviderMenu);
		//return new ContentProvider();
		return PageGeneratorManager.getContentProvider();
	}

}
