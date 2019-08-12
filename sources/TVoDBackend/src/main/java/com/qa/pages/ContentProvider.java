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
	
	@FindBy(xpath = "//tr[3]//td[5]//a[2]//span[1]")
	public WebElement updateContentProviderIcon;
	
	@FindBy(xpath = "//a[contains(text(),'»')]")
	public WebElement nextPageIcon;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_name']")
	public WebElement nameUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_mst']")
	public WebElement taxCodeUpdateTextbox;
	
	@FindBy(xpath = "//textarea[@id='contentproviderform-cp_address']")
	public WebElement addressUpdateTextbox;
	
	@FindBy(xpath = "//select[@id='contentproviderform-status']")
	public WebElement statusUpdateDropdown;
	
	@FindBy(xpath = "//input[@id='contentproviderform-email']")
	public WebElement emailUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-phone_number']")
	public WebElement phoneNumberUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-password']")
	public WebElement passwordUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-confirm_password']")
	public WebElement confirmPasswordUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-fullname']")
	public WebElement fullNameUpdateTextbox;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	public WebElement cancelUpdateButton;
	
	@FindBy(xpath = "//div[@id='w13-success']")
	public WebElement updateContentProviderSuccessMessage;
	
	@FindBy(xpath = "//div[@id='w13-success']")
	public WebElement changeStatusSuccessMessage;
	
	@FindBy(xpath = "//tr[13]//td[5]//a[3]//span[1]")
	public WebElement changeStatusIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-default']")
	public WebElement cancelChangeStatusButton;
	
	@FindBy(xpath = "//button[@class='btn btn-warning']")
	public WebElement okChangeStatusButton;
	
	@FindBy(xpath = "//tr[14]//td[5]//a[4]//span[1]")
	public WebElement deleteContentProviderIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-default']")
	public WebElement cancelDeleteContentProviderButton;
	
	@FindBy(xpath = "//button[@class='btn btn-warning']")
	public WebElement okDeleteContentProviderButton;
	
	@FindBy(xpath = "//div[@id='w16-success']")
	public WebElement deleteContentProviderSuccessMessage;
	
	
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
	
	public void updateContentProvider(String name, String taxCode, String address, String status, String email, String phoneNumber, String password, String confirmPassword, String fullname, String command) {
		clearToElement(nameUpdateTextbox);
		sendKeyToElement(nameUpdateTextbox, name);
		
		clearToElement(taxCodeUpdateTextbox);
		sendKeyToElement(taxCodeUpdateTextbox, taxCode);
		
		clearToElement(addressUpdateTextbox);
		sendKeyToElement(statusUpdateDropdown, status);
		
		clearToElement(emailUpdateTextbox);
		sendKeyToElement(emailUpdateTextbox, email);
		
		clearToElement(phoneNumberUpdateTextbox);
		sendKeyToElement(phoneNumberUpdateTextbox, phoneNumber);
		
		clearToElement(passwordUpdateTextbox);
		sendKeyToElement(passwordUpdateTextbox, password);
		
		clearToElement(confirmPasswordUpdateTextbox);
		sendKeyToElement(confirmPasswordUpdateTextbox, confirmPassword);
		
		clearToElement(fullNameUpdateTextbox);
		sendKeyToElement(fullNameUpdateTextbox, fullname);
		if(command == "UPDATE") {
			clickToElement(updateButton);
		}
		else if(command == "CANCEL") {
			clickToElement(cancelUpdateButton);
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
	
	public boolean verifyPhoneNumberBlankMessage() throws Throwable {
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
	
	public boolean verifyUpdateContentProviderSuccessMessage() throws Throwable {
		return isControlDisplayed(updateContentProviderSuccessMessage);
	}
	
	public boolean verifyChangeStatusSuccessMessage() {
		return isControlDisplayed(changeStatusSuccessMessage);
	}
	
	public boolean verifyDeleteContentProviderSuccessMessage() {
		return isControlDisplayed(deleteContentProviderSuccessMessage);
	}

}
