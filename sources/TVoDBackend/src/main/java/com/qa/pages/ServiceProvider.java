package com.qa.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.util.TestBase;

public class ServiceProvider extends TestBase {
	

	public ServiceProvider() {
		PageFactory.initElements(driver, this);
	}

	public String getServiceProviderTitle() {
		return getPageTitle();
	}

	public void searchServiceProviderByName(String value) throws Throwable {
		sendKeyToElement(ServiceProviderUI.nameCriteria, value);
		sendKeyboardToElement(ServiceProviderUI.nameCriteria, Keys.ENTER);
		Thread.sleep(3000);
		for (int i = 1; i < ServiceProviderUI.rowResults.size() + 1; i++) {
			String resultText = driver.findElement(By.xpath("//tbody//tr[" + i + "]//td[1]")).getText();
			if (compareContainText(resultText, value)) {
				System.out.print("The result is true\n");
			} else {
				System.out.print("No results found!\n");
			}
		}
	}

	public void createServiceProvider(String name, String accountName, String email, String phoneNumber,
			String password, String confirmPassword) throws Throwable {
		sendKeyToElement(ServiceProviderUI.nameAddTextbox, name);
		sendKeyToElement(ServiceProviderUI.accountNameAddTextbox, accountName);
		sendKeyToElement(ServiceProviderUI.emailAddTextbox, email);
		sendKeyToElement(ServiceProviderUI.phoneNumberAddTextbox, phoneNumber);
		sendKeyToElement(ServiceProviderUI.passwordAddTextbox, password);
		sendKeyToElement(ServiceProviderUI.confirmPasswordAddTextbox, confirmPassword);
		Thread.sleep(1000);
		//clickToElementByJavaScript(createButton);
		clickToElement(ServiceProviderUI.createButton);
	}
	
	public void createServiceProviderButCancel(String name, String accountName, String email, String phoneNumber,
			String password, String confirmPassword) throws Throwable {
		sendKeyToElement(ServiceProviderUI.nameAddTextbox, name);
		sendKeyToElement(ServiceProviderUI.accountNameAddTextbox, accountName);
		sendKeyToElement(ServiceProviderUI.emailAddTextbox, email);
		sendKeyToElement(ServiceProviderUI.phoneNumberAddTextbox, phoneNumber);
		sendKeyToElement(ServiceProviderUI.passwordAddTextbox, password);
		sendKeyToElement(ServiceProviderUI.confirmPasswordAddTextbox, confirmPassword);
		Thread.sleep(1000);
		//clickToElementByJavaScript(cancelButton);
		clickToElement(ServiceProviderUI.cancelButton);
	}

	public void createServiceProviderWithFullValue(String name, String description, String website, String currencies,
			String dealer, String status, String accountName, String email, String phoneNumber, String password,
			String confirmPassword) throws Throwable {
		sendKeyToElement(ServiceProviderUI.nameAddTextbox, name);
		// Thread.sleep(1000);
		sendKeyToElement(ServiceProviderUI.descriptionAddTextbox, description);
		// Thread.sleep(1000);
		sendKeyToElement(ServiceProviderUI.websiteAddTextbox, website);
		// Thread.sleep(1000);
		selectItemHtmlDropdown(ServiceProviderUI.currenciesAddDropdown, currencies);
		// Thread.sleep(1000);
		sendKeyToElement(ServiceProviderUI.dealerRevueSharingAddTextbox, dealer);
		// Thread.sleep(1000);
		selectItemHtmlDropdown(ServiceProviderUI.statusAddDropdown, status);
		// Thread.sleep(1000);
		sendKeyToElement(ServiceProviderUI.accountNameAddTextbox, accountName);
		// Thread.sleep(1000);
		sendKeyToElement(ServiceProviderUI.emailAddTextbox, email);
		// Thread.sleep(1000);
		sendKeyToElement(ServiceProviderUI.phoneNumberAddTextbox, password);
		// Thread.sleep(1000);
		sendKeyToElement(ServiceProviderUI.passwordAddTextbox, password);
		// Thread.sleep(2000);
		sendKeyToElement(ServiceProviderUI.confirmPasswordAddTextbox, confirmPassword);
		// Thread.sleep(2000);
		clickToElement(ServiceProviderUI.createButton);
	}

	public void updateServiceProvider(String name, String description, String website, String dealer, String currencies, String status) {
		clearToElement(ServiceProviderUI.nameUpdateTextbox);
		sendKeyToElement(ServiceProviderUI.nameUpdateTextbox, name);
		
		clearToElement(ServiceProviderUI.descriptionUpdateTextbox);
		sendKeyToElement(ServiceProviderUI.descriptionUpdateTextbox, description);
		
		clearToElement(ServiceProviderUI.websiteUpdateTextbox);
		sendKeyToElement(ServiceProviderUI.websiteUpdateTextbox, website);
		
		clearToElement(ServiceProviderUI.dealerRevenueSharingUpdateTextbox);
		sendKeyToElement(ServiceProviderUI.dealerRevenueSharingUpdateTextbox, dealer);
		
		sendKeyToElement(ServiceProviderUI.currenciesUpdateDropdown, currencies);
		
		sendKeyToElement(ServiceProviderUI.statusUpdateDropdown, status);
		
		clickToElement(ServiceProviderUI.updateButton);
	}
	
	public void updateServiceProviderButCancel(String name, String description, String website, String dealer, String currencies, String status) {
		sendKeyToElement(ServiceProviderUI.nameUpdateTextbox, name);
		sendKeyToElement(ServiceProviderUI.descriptionUpdateTextbox, description);
		sendKeyToElement(ServiceProviderUI.websiteUpdateTextbox, website);
		sendKeyToElement(ServiceProviderUI.dealerRevenueSharingUpdateTextbox, dealer);
		sendKeyToElement(ServiceProviderUI.currenciesUpdateDropdown, currencies);
		sendKeyToElement(ServiceProviderUI.statusUpdateDropdown, status);
		clickToElement(ServiceProviderUI.cancelUpdateButton);
	}

	public boolean verifyNameBlankMessage() {
		return isControlDisplayed(ServiceProviderUI.nameBlankMessage);
	}

	public boolean verifyAccountNameBlankMessage() throws Throwable {
		Thread.sleep(1000);
		return isControlDisplayed(ServiceProviderUI.accountNameBlankMessage);
	}

	public boolean verifyEmailBlankMessage() {
		return isControlDisplayed(ServiceProviderUI.emailBlankMessage);
	}

	public boolean verifyPasswordBlankMessage() {
		return isControlDisplayed(ServiceProviderUI.passwordBlankMessage);
	}

	public boolean verifyConfirmPasswordBlankMessage() {
		return isControlDisplayed(ServiceProviderUI.confirmPasswordBlankMessage);
	}

	public boolean verifyPhoneNumberBlankMessage() {
		return isControlDisplayed(ServiceProviderUI.phoneNumberBlankMessage);
	}

	public boolean verifyAccountNameExistedMessage() {
		return isControlDisplayed(ServiceProviderUI.accountNameExistMessage);
	}

	public boolean verifyPasswordInvalidMessage() {
		return isControlDisplayed(ServiceProviderUI.passwordInvalidMessage);
	}

	public boolean verifyConfirmPasswordInvalidMessage() {
		return isControlDisplayed(ServiceProviderUI.confirmPasswordInvalidMessage);
	}

	public boolean verifyEmailInvalidMessage() {
		return isControlDisplayed(ServiceProviderUI.emailInvalidMessage);
	}

	public boolean verifyPhoneNumberWrongFormat() {
		return isControlDisplayed(ServiceProviderUI.phoneNumberWrongFormatMessage);
	}

	public boolean verifyServiceProviderExistedMessage() {
		return isControlDisplayed(ServiceProviderUI.serviceProviderExistedMessage);
	}

	public boolean verifyCreateServiceProviderSuccessMessage() {
		return isControlDisplayed(ServiceProviderUI.createSuccessMessage);
	}
	
	public boolean verifyUpdateServiceProviderSuccessMessage() {
		return isControlDisplayed(ServiceProviderUI.updateSuccessMessage);
	}
	
	public boolean verifyNameUpdateBlankMessage() {
		return isControlDisplayed(ServiceProviderUI.nameUpdateBlankMessage);
	}
	
	public boolean verifyDeleteSuccessMessage() {
		return isControlDisplayed(ServiceProviderUI.deleteSuccessMessage);
	}
	

}
