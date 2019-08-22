package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContentProviderUI {
	
	@FindBy(xpath = "//input[@name='ContentProviderSearch[cp_name]']")
	@CacheLookup
	public static WebElement nameCriteria;
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-calendar']")
	@CacheLookup
	public WebElement calendarIcon;
	
	@FindBy(xpath = "//a[text()='Create Content Provider']")
	@CacheLookup
	public static WebElement createContentProviderButton;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_name']")
	@CacheLookup
	public static WebElement nameAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_mst']")
	@CacheLookup
	public static WebElement taxCodeAddTextbox;
	
	@FindBy(xpath = "//textarea[@id='contentproviderform-cp_address']")
	@CacheLookup
	public static WebElement addressAddTextbox;
	
	@FindBy(xpath = "//select[@id='contentproviderform-status']")
	@CacheLookup
	public static WebElement statusAddDropdown;
	
	@FindBy(xpath = "//input[@id='contentproviderform-username']")
	@CacheLookup
	public static WebElement accountNameAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-password']")
	@CacheLookup
	public static WebElement passwordAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-email']")
	@CacheLookup
	public static WebElement emailAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-confirm_password']")
	@CacheLookup
	public static WebElement confirmPasswordAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-phone_number']")
	@CacheLookup
	public static WebElement phoneNumberAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-fullname']")
	@CacheLookup
	public static WebElement fullNameAddTextbox;
	
	@FindBy(xpath = "//div[contains(text(),'Provider name cannot be blank.')]")
	@CacheLookup
	public static WebElement nameBlankMessage;
	
	@FindBy(xpath = "//div[@class = 'help-block' and contains(text(),'cannot be blank.')]")
	@CacheLookup
	public static WebElement accountNameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Account name already exists, please choose another name')]")
	@CacheLookup
	public static WebElement accountNameExistedMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Password cannot be blank.')]")
	@CacheLookup
	public static WebElement passwordBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Invalid password. Password at least 8 characters')]")
	@CacheLookup
	public static WebElement wrongPasswordFormatMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Email of the representative cannot be blank.')]")
	@CacheLookup
	public static WebElement emailBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Email address is not valid')]")
	@CacheLookup
	public static WebElement wrongEmailFormatMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Confirm password cannot be blank.')]")
	@CacheLookup
	public static WebElement confirmPasswordBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Confirm password was wrong.')]")
	@CacheLookup
	public static WebElement wrongConfirmPasswordMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Phone number of representative cannot be blank.')]")
	@CacheLookup
	public static WebElement phoneNumberBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Phone number must be number')]")
	@CacheLookup
	public static WebElement wrongPhoneNumberFormatMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Full name of representative cannot be blank.')]")
	@CacheLookup
	public static WebElement fullNameBlankMessage;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	public static WebElement createButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	@CacheLookup
	public static WebElement cancelButton;
	
	@FindBy(xpath = "//div[@id='w13-success']")
	@CacheLookup
	public static WebElement createContentProviderSuccessMessage;
	
	
	@FindBy(xpath = ".//*[@id='w0-container']/table/tbody/tr/td[1]")
	@CacheLookup
	public static List<WebElement> listRowResult;
	
	@FindBy(xpath = "//tr[15]//td[5]//a[2]//span[1]")
	@CacheLookup
	public static WebElement updateContentProviderIcon;
	
	@FindBy(xpath = "//a[contains(text(),'»')]")
	@CacheLookup
	public static WebElement nextPageIcon;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_name']")
	@CacheLookup
	public static WebElement nameUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_mst']")
	@CacheLookup
	public static WebElement taxCodeUpdateTextbox;
	
	@FindBy(xpath = "//textarea[@id='contentproviderform-cp_address']")
	@CacheLookup
	public static WebElement addressUpdateTextbox;
	
	@FindBy(xpath = "//select[@id='contentproviderform-status']")
	@CacheLookup
	public static WebElement statusUpdateDropdown;
	
	@FindBy(xpath = "//input[@id='contentproviderform-email']")
	@CacheLookup
	public static WebElement emailUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-phone_number']")
	@CacheLookup
	public static WebElement phoneNumberUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-password']")
	@CacheLookup
	public static WebElement passwordUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-confirm_password']")
	@CacheLookup
	public static WebElement confirmPasswordUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-fullname']")
	@CacheLookup
	public static WebElement fullNameUpdateTextbox;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	public static WebElement updateButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	@CacheLookup
	public static WebElement cancelUpdateButton;
	
	@FindBy(xpath = "//div[@id='w13-success']")
	@CacheLookup
	public static WebElement updateContentProviderSuccessMessage;
	
	@FindBy(xpath = "//div[@id='w13-success']")
	@CacheLookup
	public static WebElement changeStatusSuccessMessage;
	
	@FindBy(xpath = "//tr[13]//td[5]//a[3]//span[1]")
	@CacheLookup
	public static WebElement changeStatusIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-default']")
	@CacheLookup
	public static WebElement cancelChangeStatusButton;
	
	@FindBy(xpath = "//button[@class='btn btn-warning']")
	@CacheLookup
	public static WebElement okChangeStatusButton;
	
	@FindBy(xpath = "//tr[14]//td[5]//a[4]//span[1]")
	@CacheLookup
	public static WebElement deleteContentProviderIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-default']")
	@CacheLookup
	public static WebElement cancelDeleteContentProviderButton;
	
	@FindBy(xpath = "//button[@class='btn btn-warning']")
	@CacheLookup
	public static WebElement okDeleteContentProviderButton;
	
	@FindBy(xpath = "//div[@id='w16-success']")
	@CacheLookup
	public static WebElement deleteContentProviderSuccessMessage;

}
