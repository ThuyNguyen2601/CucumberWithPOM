package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;
import com.qa.util.TestBase;

public class ContentProvider extends AbstractTest{
	
	@FindBy(xpath = "//input[@name='ContentProviderSearch[cp_name]']")
	@CacheLookup
	public WebElement nameCriteria;
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-calendar']")
	@CacheLookup
	public WebElement calendarIcon;
	
	@FindBy(xpath = "//a[text()='Create Content Provider']")
	@CacheLookup
	public WebElement createContentProviderButton;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_name']")
	@CacheLookup
	public WebElement nameAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_mst']")
	@CacheLookup
	public WebElement taxCodeAddTextbox;
	
	@FindBy(xpath = "//textarea[@id='contentproviderform-cp_address']")
	@CacheLookup
	public WebElement addressAddTextbox;
	
	@FindBy(xpath = "//select[@id='contentproviderform-status']")
	@CacheLookup
	public WebElement statusAddDropdown;
	
	@FindBy(xpath = "//input[@id='contentproviderform-username']")
	@CacheLookup
	public WebElement accountNameAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-password']")
	@CacheLookup
	public WebElement passwordAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-email']")
	@CacheLookup
	public WebElement emailAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-confirm_password']")
	@CacheLookup
	public WebElement confirmPasswordAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-phone_number']")
	@CacheLookup
	public WebElement phoneNumberAddTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-fullname']")
	@CacheLookup
	public WebElement fullNameAddTextbox;
	
	@FindBy(xpath = "//div[contains(text(),'Provider name cannot be blank.')]")
	@CacheLookup
	public WebElement nameBlankMessage;
	
	@FindBy(xpath = "//div[@class = 'help-block' and contains(text(),'cannot be blank.')]")
	@CacheLookup
	public WebElement accountNameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Account name already exists, please choose another name')]")
	@CacheLookup
	public WebElement accountNameExistedMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Password cannot be blank.')]")
	@CacheLookup
	public WebElement passwordBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Invalid password. Password at least 8 characters')]")
	@CacheLookup
	public WebElement wrongPasswordFormatMessage;

	@FindBy(xpath = "//div[contains(text(),'Email of the representative cannot be blank.')]")
	@CacheLookup
	public WebElement emailBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Email address is not valid')]")
	@CacheLookup
	public WebElement wrongEmailFormatMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Confirm password cannot be blank.')]")
	@CacheLookup
	public WebElement confirmPasswordBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Confirm password was wrong.')]")
	@CacheLookup
	public WebElement wrongConfirmPasswordMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Phone number of representative cannot be blank.')]")
	@CacheLookup
	public WebElement phoneNumberBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Phone number must be number')]")
	@CacheLookup
	public WebElement wrongPhoneNumberFormatMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Full name of representative cannot be blank.')]")
	@CacheLookup
	public WebElement fullNameBlankMessage;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	public WebElement createButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	@CacheLookup
	public WebElement cancelButton;
	
	@FindBy(xpath = "//div[@id='w13-success']")
	@CacheLookup
	public WebElement createContentProviderSuccessMessage;
	
	
	@FindBy(xpath = ".//*[@id='w0-container']/table/tbody/tr/td[1]")
	@CacheLookup
	public List<WebElement> listRowResult;
	
	@FindBy(xpath = "//tr[13]//td[5]//a[2]//span[1]")
	@CacheLookup
	public WebElement updateContentProviderIcon;
	
	@FindBy(xpath = "//a[contains(text(),'»')]")
	@CacheLookup
	public WebElement nextPageIcon;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_name']")
	@CacheLookup
	public WebElement nameUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-cp_mst']")
	@CacheLookup
	public WebElement taxCodeUpdateTextbox;
	
	@FindBy(xpath = "//textarea[@id='contentproviderform-cp_address']")
	@CacheLookup
	public WebElement addressUpdateTextbox;
	
	@FindBy(xpath = "//select[@id='contentproviderform-status']")
	@CacheLookup
	public WebElement statusUpdateDropdown;
	
	@FindBy(xpath = "//input[@id='contentproviderform-email']")
	@CacheLookup
	public WebElement emailUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-phone_number']")
	@CacheLookup
	public WebElement phoneNumberUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-password']")
	@CacheLookup
	public WebElement passwordUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-confirm_password']")
	@CacheLookup
	public WebElement confirmPasswordUpdateTextbox;
	
	@FindBy(xpath = "//input[@id='contentproviderform-fullname']")
	@CacheLookup
	public WebElement fullNameUpdateTextbox;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	public WebElement updateButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	@CacheLookup
	public WebElement cancelUpdateButton;
	
	@FindBy(xpath = "//div[@id='w13-success']")
	@CacheLookup
	public WebElement updateContentProviderSuccessMessage;
	
	@FindBy(xpath = "//div[@id='w13-success']")
	@CacheLookup
	public WebElement changeStatusSuccessMessage;
	
	@FindBy(xpath = "//tr[2]//td[5]//a[3]//span[1]")
	@CacheLookup
	public WebElement changeStatusIcon;
	
	@FindBy(xpath = "//div[@class='bootstrap-dialog-footer-buttons']//button[@class='btn btn-default']")
	@CacheLookup
	public WebElement cancelChangeStatusButton;
	
	@FindBy(xpath = "//div[@class='bootstrap-dialog-footer-buttons']//button[@class='btn btn-warning']")
	@CacheLookup
	public WebElement okChangeStatusButton;
	
	@FindBy(xpath = "//tr[3]//td[5]//a[4]//span[1]")
	@CacheLookup
	public WebElement deleteContentProviderIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-default']")
	@CacheLookup
	public WebElement cancelDeleteContentProviderButton;
	
	@FindBy(xpath = "//button[@class='btn btn-warning']")
	@CacheLookup
	public WebElement okDeleteContentProviderButton;
	
	@FindBy(xpath = "//div[@id='w16-success']")
	@CacheLookup
	public WebElement deleteContentProviderSuccessMessage;
	
	public ContentProvider() {
		PageFactory.initElements(driver, this);
	}
	
	public String getContentProviderPageTitle() {
		return getPageTitle();
	}
	
	public void createContentProvider(String name, String taxCode, String address, String status, String accountName, String email, String phoneNumber, String password, String confirmPassword, String fullName, String command) throws Throwable {
		waitForElementVisible(nameAddTextbox);
		sendKeyToElement(nameAddTextbox, name);
		
		waitForElementVisible(taxCodeAddTextbox);
		sendKeyToElement(taxCodeAddTextbox, taxCode);
		
		waitForElementVisible(addressAddTextbox);
		sendKeyToElement(addressAddTextbox, address);
		
		waitForElementVisible(statusAddDropdown);
		sendKeyToElement(statusAddDropdown, status);
		
		waitForElementVisible(accountNameAddTextbox);
		sendKeyToElement(accountNameAddTextbox, accountName);
		
		waitForElementVisible(emailAddTextbox);
		sendKeyToElement(emailAddTextbox, email);
		
		waitForElementVisible(phoneNumberAddTextbox);
		sendKeyToElement(phoneNumberAddTextbox, phoneNumber);
		
		waitForElementVisible(passwordAddTextbox);
		sendKeyToElement(passwordAddTextbox, password);
		
		waitForElementVisible(confirmPasswordAddTextbox);
		sendKeyToElement(confirmPasswordAddTextbox, confirmPassword);
		
		waitForElementVisible(fullNameAddTextbox);
		sendKeyToElement(fullNameAddTextbox, fullName);
		if(command == "CREATE") {
			clickToElementByJavaScript(createButton);
		}
		else if(command == "CANCEL") {
			clickToElementByJavaScript(cancelButton);
		}
	}
	
	public void updateContentProvider(String name, String taxCode, String address, String status, String email, String phoneNumber, String password, String confirmPassword, String fullname, String command) {
		waitForElementVisible(nameUpdateTextbox);
		clearToElement(nameUpdateTextbox);
		sendKeyToElement(nameUpdateTextbox, name);
		
		waitForElementVisible(taxCodeUpdateTextbox);
		clearToElement(taxCodeUpdateTextbox);
		sendKeyToElement(taxCodeUpdateTextbox, taxCode);
		
		waitForElementVisible(addressUpdateTextbox);
		clearToElement(addressUpdateTextbox);
		sendKeyToElement(statusUpdateDropdown, status);
		
		waitForElementVisible(emailUpdateTextbox);
		clearToElement(emailUpdateTextbox);
		sendKeyToElement(emailUpdateTextbox, email);
		
		waitForElementVisible(phoneNumberUpdateTextbox);
		clearToElement(phoneNumberUpdateTextbox);
		sendKeyToElement(phoneNumberUpdateTextbox, phoneNumber);
		
		waitForElementVisible(passwordUpdateTextbox);
		clearToElement(passwordUpdateTextbox);
		sendKeyToElement(passwordUpdateTextbox, password);
		
		waitForElementVisible(confirmPasswordUpdateTextbox);
		clearToElement(confirmPasswordUpdateTextbox);
		sendKeyToElement(confirmPasswordUpdateTextbox, confirmPassword);
		
		waitForElementVisible(fullNameUpdateTextbox);
		clearToElement(fullNameUpdateTextbox);
		sendKeyToElement(fullNameUpdateTextbox, fullname);
		if(command == "UPDATE") {
			waitForElementClickalbe(updateButton);
			clickToElementByJavaScript(updateButton);
		}
		else if(command == "CANCEL") {
			waitForElementClickalbe(cancelUpdateButton);
			clickToElementByJavaScript(cancelUpdateButton);
		}
			
	}
	
	public void searchByName(List<WebElement> elements, WebElement nameCriteria, String value) throws Throwable {
		sendKeyToElement(nameCriteria, value);
		sendKeyboardToElement(nameCriteria, Keys.ENTER);
		Thread.sleep(2000);
		for (int i = 1; i < elements.size(); i++) {
			scrollToBottomPage();
			String resultText = driver.findElement(By.xpath("//tbody//tr[" + i + "]//td[1]")).getText();
			if (compareContainText(resultText, value)) {
				System.out.print("The result is true\n");
			} else {
				System.out.print("No results found!\n");
			}
		}
	}
	
	public boolean verifyNameBlankMessage() {
		waitForElementVisible(nameBlankMessage);
		return isControlDisplayed(nameBlankMessage);
	}
	
	public boolean verifyAccountNameBlankMessage() throws Throwable {
		waitForElementVisible(accountNameBlankMessage);
		return isControlDisplayed(accountNameBlankMessage);
	}
	
	public boolean verifyAccountNameExistedMessage() {
		waitForElementVisible(accountNameExistedMessage);
		return isControlDisplayed(accountNameExistedMessage);
	}
	
	public boolean verifyEmailBlankMessage() {
		waitForElementVisible(emailBlankMessage);
		return isControlDisplayed(emailBlankMessage);
	}
	
	public boolean verifyWrongEmailFormatMessage() {
		waitForElementVisible(wrongEmailFormatMessage);
		return isControlDisplayed(wrongEmailFormatMessage);
	}
	
	public boolean verifyPasswordBlankMessage() {
		waitForElementVisible(passwordBlankMessage);
		return isControlDisplayed(passwordBlankMessage);
	}
	
	public boolean verifyWrongPasswordFormatMessage() {
		waitForElementVisible(wrongPasswordFormatMessage);
		return isControlDisplayed(wrongPasswordFormatMessage);
	}
	
	public boolean verifyConfirmPasswordBlankMessage() {
		waitForElementVisible(confirmPasswordBlankMessage);
		return isControlDisplayed(confirmPasswordBlankMessage);
	}
	
	public boolean verifyWrongConfirmPasswordFormat() {
		waitForElementVisible(wrongConfirmPasswordMessage);
		return isControlDisplayed(wrongConfirmPasswordMessage);
	}
	
	public boolean verifyPasswordAndConfirmPasswordNotMatchedMessage() {
		waitForElementVisible(wrongConfirmPasswordMessage);
		return isControlDisplayed(wrongConfirmPasswordMessage);
	}
	
	public boolean verifyPhoneNumberBlankMessage() throws Throwable {
		waitForElementVisible(phoneNumberBlankMessage);
		return isControlDisplayed(phoneNumberBlankMessage);
	}
	
	public boolean verifyWrongPhoneNumberFormatMessage() {
		waitForElementVisible(wrongPhoneNumberFormatMessage);
		return isControlDisplayed(wrongPhoneNumberFormatMessage);
	}
	
	public boolean verifyFullNameBlankMessage() {
		waitForElementVisible(fullNameBlankMessage);
		return isControlDisplayed(fullNameBlankMessage);
	}
	
	public boolean verifyCreateContentProviderSuccessMessage() {
		waitForElementVisible(createContentProviderSuccessMessage);
		return isControlDisplayed(createContentProviderSuccessMessage);
	}
	
	public boolean verifyUpdateContentProviderSuccessMessage() throws Throwable {
		waitForElementVisible(updateContentProviderSuccessMessage);
		return isControlDisplayed(updateContentProviderSuccessMessage);
	}
	
	public boolean verifyChangeStatusSuccessMessage() {
		waitForElementVisible(changeStatusSuccessMessage);
		return isControlDisplayed(changeStatusSuccessMessage);
	}
	
	public boolean verifyDeleteContentProviderSuccessMessage() {
		waitForElementVisible(deleteContentProviderSuccessMessage);
		return isControlDisplayed(deleteContentProviderSuccessMessage);
	}

}
