package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ContentProvider extends TestBase{
	
	@FindBy(xpath = "//input[@name='ContentProviderSearch[cp_name]']")
	public WebElement nameCriteria;
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-calendar']")
	public WebElement calendarIcon;
	
	@FindBy(xpath = "//a[@class='btn btn-success']")
	public WebElement createContentProviderButton;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_name']")
	public WebElement nameAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_mst']")
	public WebElement taxCodeAddTextbox;
	
	@FindBy(xpath = "//textarea[@id='contentproviderform-cp_address']")
	public WebElement addressAddTextbox;
	
	@FindBy(xpath = "//select[@id='contentproviderform-status']")
	public WebElement statusAddDropdown;
	
	@FindBy(xpath = "//input[@id='contentproviderform-username']")
	public WebElement accountNameAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-password']")
	public WebElement passwordAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-email']")
	public WebElement emailAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-confirm_password']")
	public WebElement confirmPasswordAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-phone_number']")
	public WebElement phoneNumberAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-fullname']")
	public WebElement fullNameAddTextbox;
	
	@FindBy(xpath = "//div[contains(text(),'Provider name cannot be blank.')]")
	public WebElement nameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'cannot be blank.')]")
	public WebElement accountNameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Account name already exists, please choose another')]")
	public WebElement accountNameExistedMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Password cannot be blank.')]")
	public WebElement passwordBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Invalid password. Password at least 8 characters')]")
	public WebElement wrongPasswordFormatMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Email of the representative cannot be blank.')]")
	public WebElement emailBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Email address is not valid')]")
	public WebElement wrongEmailFormatMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Confirm password cannot be blank.')]")
	public WebElement confirmPasswordBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Confirm password was wrong.')]")
	public WebElement wrongConfirmPasswordMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Phone number of representative cannot be blank.')]")
	public WebElement phoneNumberBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Phone number must be number')]")
	public WebElement wrongPhoneNumberFormatMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Full name of representative cannot be blank.')]")
	public WebElement fullNameBlankMessage;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	public WebElement createButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	public WebElement cancelButton;
	
	@FindBy(xpath = "//div[@id='w13-success']")
	public WebElement createContentProviderSuccessMessage;
	
	
	@FindBy(xpath = ".//*[@id='w0-container']/table/tbody/tr/td[1]")
	public List<WebElement> listRowResult;
	
	public ContentProvider() {
		PageFactory.initElements(driver, this);
	}
	
	public String getContentProviderPageTitle() {
		return getPageTitle();
	}
	
	public void createContentProvider(String name, String taxCode, String address, String status, String accountName, String email, String phoneNumber, String password, String confirmPassword, String fullName, String command) {
		sendKeyToElement(nameAddTextbox, name);
		sendKeyToElement(taxCodeAddTextbox, taxCode);
		sendKeyToElement(addressAddTextbox, address);
		sendKeyToElement(statusAddDropdown, status);
		sendKeyToElement(accountNameAddTextbox, accountName);
		sendKeyToElement(emailAddTextbox, email);
		sendKeyToElement(phoneNumberAddTextbox, phoneNumber);
		sendKeyToElement(passwordAddTextbox, password);
		sendKeyToElement(confirmPasswordAddTextbox, confirmPassword);
		sendKeyToElement(fullNameAddTextbox, fullName);
		if(command == "CREATE") {
			clickToElement(createButton);
		}
		else if(command == "CANCEL") {
			clickToElement(cancelButton);
		}
	}
	
	public boolean verifyNameBlankMessage() {
		return isControlDisplayed(nameBlankMessage);
	}
	
	public boolean verifyAccountNameBlankMessage() {
		return isControlDisplayed(accountNameBlankMessage);
	}
	
	public boolean verifyAccountNameExistedMessage() {
		return isControlDisplayed(accountNameExistedMessage);
	}
	
	public boolean verifyEmailBlankMessage() {
		return isControlDisplayed(emailBlankMessage);
	}
	
	public boolean verifyWrongEmailFormatMessage() {
		return isControlDisplayed(wrongEmailFormatMessage);
	}
	
	public boolean verifyPasswordBlankMessage() {
		return isControlDisplayed(passwordBlankMessage);
	}
	
	public boolean verifyWrongPasswordFormatMessage() {
		return isControlDisplayed(wrongPasswordFormatMessage);
	}
	
	public boolean verifyConfirmPasswordBlankMessage() {
		return isControlDisplayed(confirmPasswordBlankMessage);
	}
	
	public boolean verifyWrongConfirmPasswordFormat() {
		return isControlDisplayed(wrongConfirmPasswordMessage);
	}
	
	public boolean verifyPasswordAndConfirmPasswordNotMatchedMessage() {
		return isControlDisplayed(wrongConfirmPasswordMessage);
	}
	
	public boolean verifyPhoneNumberBlankMessage() {
		return isControlDisplayed(phoneNumberBlankMessage);
	}
	
	public boolean verifyWrongPhoneNumberFormatMessage() {
		return isControlDisplayed(wrongPhoneNumberFormatMessage);
	}
	
	public boolean verifyFullNameBlankMessage() {
		return isControlDisplayed(fullNameBlankMessage);
	}
	
	public boolean verifyCreateContentProviderSuccessMessage() {
		return isControlDisplayed(createContentProviderSuccessMessage);
	}
	

}
