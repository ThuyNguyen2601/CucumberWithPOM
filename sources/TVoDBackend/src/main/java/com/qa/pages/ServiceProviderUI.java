package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ServiceProviderUI {
	@FindBy(xpath = "//input[@name='SiteSearch[name]']")
	@CacheLookup
	public static WebElement nameCriteria;

	@FindBy(xpath = ".//*[@id='w0-container']/table/thead/tr/th")
	@CacheLookup
	public static By collumnResult;

	@FindBy(xpath = ".//*[@id='w0-container']/table/tbody/tr/td[1]")
	@CacheLookup
	public static List<WebElement> rowResults;

	@FindBy(xpath = "//input[@name='SiteSearch[description]']")
	@CacheLookup
	public static WebElement descriptionCriteria;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	@CacheLookup
	public static WebElement createServiceProviderButton;

	@FindBy(xpath = "//tr[1]//td[6]//a[1]//span[1]")
	@CacheLookup
	public static WebElement updateIcon;

	@FindBy(xpath = "//tr[1]//td[6]//a[2]//span[1]")
	@CacheLookup
	public static WebElement deleteIcon;

	@FindBy(xpath = "//tr[1]//td[6]//a[3]//span[1]")
	@CacheLookup
	public static WebElement viewIcon;

	@FindBy(xpath = "//tr[1]//td[6]//a[4]//span[1]")
	@CacheLookup
	public static WebElement contentDeliveryIcon;

	@FindBy(xpath = "//input[@id='serviceproviderform-name']")
	@CacheLookup
	public static WebElement nameAddTextbox;

	@FindBy(xpath = "//textarea[@id='serviceproviderform-description']")
	@CacheLookup
	public static WebElement descriptionAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-website']")
	@CacheLookup
	public static WebElement websiteAddTextbox;

	@FindBy(xpath = "//select[@id='serviceproviderform-currency']")
	@CacheLookup
	public static WebElement currenciesAddDropdown;

	@FindBy(xpath = "//input[@id='serviceproviderform-cp_revernue_percent']")
	@CacheLookup
	public static WebElement dealerRevueSharingAddTextbox;

	@FindBy(xpath = "//select[@id='serviceproviderform-status']")
	@CacheLookup
	public static WebElement statusAddDropdown;

	@FindBy(xpath = "//input[@id='serviceproviderform-username']")
	@CacheLookup
	public static WebElement accountNameAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-password']")
	@CacheLookup
	public static WebElement passwordAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-email']")
	@CacheLookup
	public static WebElement emailAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-confirm_password']")
	@CacheLookup
	public static WebElement confirmPasswordAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-phone_number']")
	@CacheLookup
	public static WebElement phoneNumberAddTextbox;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	public static WebElement createButton;

	@FindBy(xpath = "//a[@class='btn btn-default']")
	@CacheLookup
	public static WebElement cancelButton;

	@FindBy(xpath = "//div[@id='w16-success']")
	@CacheLookup
	public static WebElement createSuccessMessage;

	@FindBy(xpath = "//div[contains(text(),'Name cannot be blank.')]")
	@CacheLookup
	public static WebElement nameBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'cannot be blank.')]")
	@CacheLookup
	public static WebElement accountNameBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Account name already exists, please choose another')]")
	@CacheLookup
	public static WebElement accountNameExistMessage;

	@FindBy(xpath = "//div[contains(text(),'Password cannot be blank.')]")
	@CacheLookup
	public static WebElement passwordBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Invalid password. Password at least 8 characters')]")
	@CacheLookup
	public static WebElement passwordInvalidMessage;

	@FindBy(xpath = "//div[contains(text(),'Email cannot be blank.')]")
	@CacheLookup
	public static WebElement emailBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Email address is not valid')]")
	@CacheLookup
	public static WebElement emailInvalidMessage;

	@FindBy(xpath = "//div[contains(text(),'Confirm password cannot be blank.')]")
	@CacheLookup
	public static WebElement confirmPasswordBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Confirm password was wrong')]")
	@CacheLookup
	public static WebElement confirmPasswordInvalidMessage;

	@FindBy(xpath = "//div[contains(text(),'Phone number cannot be blank.')]")
	@CacheLookup
	public static WebElement phoneNumberBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Phone number must be number')]")
	@CacheLookup
	public static WebElement phoneNumberWrongFormatMessage;

	@FindBy(xpath = "//div[contains(text(),'Service provider name already exists, please choos')]")
	@CacheLookup
	public static WebElement serviceProviderExistedMessage;

	@FindBy(xpath = "//tr[5]//td[6]//a[1]//span[1]")
	@CacheLookup
	public static WebElement updateServiceProviderIcon;

	@FindBy(xpath = "//tr[19]//td[6]//a[2]//span[1]")
	@CacheLookup
	public static WebElement deleteServiceProviderIcon;

	@FindBy(xpath = "//tr[10]//td[6]//a[3]//span[1]")
	@CacheLookup
	public static WebElement listViewIcon;


	@FindBy(xpath = "//input[@id='site-name']")
	@CacheLookup
	public static WebElement nameUpdateTextbox;

	@FindBy(xpath = "//textarea[@id='site-description']")
	@CacheLookup
	public static WebElement descriptionUpdateTextbox;

	@FindBy(xpath = "//input[@id='site-website']")
	@CacheLookup
	public static WebElement websiteUpdateTextbox;

	@FindBy(xpath = "//input[@id='site-cp_revernue_percent']")
	@CacheLookup
	public static WebElement dealerRevenueSharingUpdateTextbox;

	@FindBy(xpath = "//select[@id='site-currency']")
	@CacheLookup
	public static WebElement currenciesUpdateDropdown;

	@FindBy(xpath = "//select[@id='site-status']")
	@CacheLookup
	public static WebElement statusUpdateDropdown;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	@CacheLookup
	public static WebElement updateButton;

	@FindBy(xpath = "//a[@class='btn btn-default']")
	@CacheLookup
	public static WebElement cancelUpdateButton;
	
	@FindBy(xpath = "//div[@id='w16-success']")
	@CacheLookup
	public static WebElement updateSuccessMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Name cannot be blank.')]")
	@CacheLookup
	public static WebElement nameUpdateBlankMessage;
	
	@FindBy(xpath = "//div[@id='w16-success']")
	@CacheLookup
	public static WebElement deleteSuccessMessage;
	
	@FindBy(xpath = "//button[@class = 'btn btn-warning']")
	@CacheLookup
	public static WebElement OKButtonInDeleteConfirmAlert;
	
	@FindBy(xpath = "//button[@class = 'btn btn-default']")
	@CacheLookup
	public static WebElement CancelButtonInDeleteConfirmAlert;

	public static String resultCompareText = "chang10";
}
