package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
import com.qa.pages.ContentProviderUI;

public class ContentProvider extends TestBase{
	
	
	public ContentProvider() {
		PageFactory.initElements(driver, this);
	}
	
	public String getContentProviderPageTitle() {
		return getPageTitle();
	}
	
	public void createContentProvider(String name, String taxCode, String address, String status, String accountName, String email, String phoneNumber, String password, String confirmPassword, String fullName, String command) throws Throwable {
		sendKeyToElement(ContentProviderUI.accountNameAddTextbox, name);
		sendKeyToElement(ContentProviderUI.taxCodeAddTextbox, taxCode);
		sendKeyToElement(ContentProviderUI.addressAddTextbox, address);
		sendKeyToElement(ContentProviderUI.statusAddDropdown, status);
		sendKeyToElement(ContentProviderUI.accountNameAddTextbox, accountName);
		sendKeyToElement(ContentProviderUI.emailAddTextbox, email);
		sendKeyToElement(ContentProviderUI.phoneNumberAddTextbox, phoneNumber);
		sendKeyToElement(ContentProviderUI.passwordAddTextbox, password);
		sendKeyToElement(ContentProviderUI.confirmPasswordAddTextbox, confirmPassword);
		sendKeyToElement(ContentProviderUI.fullNameAddTextbox, fullName);
		if(command == "CREATE") {
			//clickToElementByJavaScript(createButton);
			clickToElement(ContentProviderUI.createButton);
			Thread.sleep(1000);
		}
		else if(command == "CANCEL") {
			//clickToElementByJavaScript(cancelButton);
			clickToElement(ContentProviderUI.cancelButton);
			Thread.sleep(1000);
		}
	}
	
	public void updateContentProvider(String name, String taxCode, String address, String status, String email, String phoneNumber, String password, String confirmPassword, String fullname, String command) {
		clearToElement(ContentProviderUI.nameUpdateTextbox);
		sendKeyToElement(ContentProviderUI.nameUpdateTextbox, name);
		
		clearToElement(ContentProviderUI.taxCodeUpdateTextbox);
		sendKeyToElement(ContentProviderUI.taxCodeUpdateTextbox, taxCode);
		
		clearToElement(ContentProviderUI.addressUpdateTextbox);
		sendKeyToElement(ContentProviderUI.statusUpdateDropdown, status);
		
		clearToElement(ContentProviderUI.emailUpdateTextbox);
		sendKeyToElement(ContentProviderUI.emailUpdateTextbox, email);
		
		clearToElement(ContentProviderUI.phoneNumberUpdateTextbox);
		sendKeyToElement(ContentProviderUI.phoneNumberUpdateTextbox, phoneNumber);
		
		clearToElement(ContentProviderUI.passwordUpdateTextbox);
		sendKeyToElement(ContentProviderUI.passwordUpdateTextbox, password);
		
		clearToElement(ContentProviderUI.confirmPasswordUpdateTextbox);
		sendKeyToElement(ContentProviderUI.confirmPasswordUpdateTextbox, confirmPassword);
		
		clearToElement(ContentProviderUI.fullNameUpdateTextbox);
		sendKeyToElement(ContentProviderUI.fullNameUpdateTextbox, fullname);
		if(command == "UPDATE") {
			//clickToElementByJavaScript(updateButton);
			clickToElement(ContentProviderUI.updateButton);
		}
		else if(command == "CANCEL") {
			//clickToElementByJavaScript(cancelUpdateButton);
			clickToElement(ContentProviderUI.cancelUpdateButton);
		}
			
	}
	
	public boolean verifyNameBlankMessage() {
		return isControlDisplayed(ContentProviderUI.nameBlankMessage);
	}
	
	public boolean verifyAccountNameBlankMessage() throws Throwable {
		Thread.sleep(1000);
		return isControlDisplayed(ContentProviderUI.accountNameBlankMessage);
	}
	
	public boolean verifyAccountNameExistedMessage() {
		return isControlDisplayed(ContentProviderUI.accountNameExistedMessage);
	}
	
	public boolean verifyEmailBlankMessage() {
		return isControlDisplayed(ContentProviderUI.emailBlankMessage);
	}
	
	public boolean verifyWrongEmailFormatMessage() {
		return isControlDisplayed(ContentProviderUI.wrongEmailFormatMessage);
	}
	
	public boolean verifyPasswordBlankMessage() {
		return isControlDisplayed(ContentProviderUI.passwordBlankMessage);
	}
	
	public boolean verifyWrongPasswordFormatMessage() {
		return isControlDisplayed(ContentProviderUI.wrongPasswordFormatMessage);
	}
	
	public boolean verifyConfirmPasswordBlankMessage() {
		return isControlDisplayed(ContentProviderUI.confirmPasswordBlankMessage);
	}
	
	public boolean verifyWrongConfirmPasswordFormat() {
		return isControlDisplayed(ContentProviderUI.wrongConfirmPasswordMessage);
	}
	
	public boolean verifyPasswordAndConfirmPasswordNotMatchedMessage() {
		return isControlDisplayed(ContentProviderUI.wrongConfirmPasswordMessage);
	}
	
	public boolean verifyPhoneNumberBlankMessage() throws Throwable {
		return isControlDisplayed(ContentProviderUI.phoneNumberBlankMessage);
	}
	
	public boolean verifyWrongPhoneNumberFormatMessage() {
		return isControlDisplayed(ContentProviderUI.wrongPhoneNumberFormatMessage);
	}
	
	public boolean verifyFullNameBlankMessage() {
		return isControlDisplayed(ContentProviderUI.fullNameBlankMessage);
	}
	
	public boolean verifyCreateContentProviderSuccessMessage() {
		return isControlDisplayed(ContentProviderUI.createContentProviderSuccessMessage);
	}
	
	public boolean verifyUpdateContentProviderSuccessMessage() throws Throwable {
		return isControlDisplayed(ContentProviderUI.updateContentProviderSuccessMessage);
	}
	
	public boolean verifyChangeStatusSuccessMessage() {
		return isControlDisplayed(ContentProviderUI.changeStatusSuccessMessage);
	}
	
	public boolean verifyDeleteContentProviderSuccessMessage() {
		return isControlDisplayed(ContentProviderUI.deleteContentProviderSuccessMessage);
	}

}
