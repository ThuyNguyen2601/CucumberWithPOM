package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageUI {
	
	@FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
	public static WebElement userNameLabel;
	
	@FindBy(xpath = "//a[contains(text(),'Service Provider')]")
	public static WebElement serviceProviderMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Manage service provider')]")
	public static WebElement managementServiceProviderLink;
	
	@FindBy(xpath = "//a[contains(text(),'Content Provider')]")
	public static WebElement contentProviderMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Manage content provider')]")
	public static WebElement manageContentProviderMenu;

}
