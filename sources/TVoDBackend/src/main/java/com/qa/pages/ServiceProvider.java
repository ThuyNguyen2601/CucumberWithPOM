package com.qa.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.util.TestBase;

public class ServiceProvider extends TestBase {
	@FindBy(xpath = "//input[@name='SiteSearch[name]']")
	public WebElement nameCriteria;

	@FindBy(xpath = ".//*[@id='w0-container']/table/thead/tr/th")
	public By collumnResult;

	@FindBy(xpath = ".//*[@id='w0-container']/table/tbody/tr/td[1]")
	public List<WebElement> rowResults;

	@FindBy(xpath = "//input[@name='SiteSearch[description]']")
	public WebElement descriptionCriteria;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	public WebElement createServiceProviderButton;

	@FindBy(xpath = "//tr[1]//td[6]//a[1]//span[1]")
	public WebElement updateIcon;

	@FindBy(xpath = "//tr[1]//td[6]//a[2]//span[1]")
	public WebElement deleteIcon;

	@FindBy(xpath = "//tr[1]//td[6]//a[3]//span[1]")
	public WebElement viewIcon;

	@FindBy(xpath = "//tr[1]//td[6]//a[4]//span[1]")
	public WebElement contentDeliveryIcon;

	@FindBy(xpath = "//input[@id='serviceproviderform-name']")
	public WebElement nameAddTextbox;

	@FindBy(xpath = "//textarea[@id='serviceproviderform-description']")
	public WebElement descriptionAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-website']")
	public WebElement websiteAddTextbox;

	@FindBy(xpath = "//select[@id='serviceproviderform-currency']")
	public WebElement currenciesAddDropdown;

	@FindBy(xpath = "//input[@id='serviceproviderform-cp_revernue_percent']")
	public WebElement dealerRevueSharingAddTextbox;

	@FindBy(xpath = "//select[@id='serviceproviderform-status']")
	public WebElement statusAddDropdown;

	@FindBy(xpath = "//input[@id='serviceproviderform-username']")
	public WebElement accountNameAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-password']")
	public WebElement passwordAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-email']")
	public WebElement emailAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-confirm_password']")
	public WebElement confirmPasswordAddTextbox;

	@FindBy(xpath = "//input[@id='serviceproviderform-phone_number']")
	public WebElement phoneNumberAddTextbox;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	public WebElement createButton;

	@FindBy(xpath = "//a[@class='btn btn-default']")
	public WebElement cancelButton;

	@FindBy(xpath = "//div[@id='w16-success']")
	public WebElement createSuccessMessage;

	@FindBy(xpath = "//div[contains(text(),'Name cannot be blank.')]")
	public WebElement nameBlankMessage;

	@FindBy(xpath = "//div[text()='Account name  cannot be blank.']")
	public WebElement accountNameBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Account name already exists, please choose another')]")
	public WebElement accountNameExistMessage;

	@FindBy(xpath = "//div[contains(text(),'Password cannot be blank.')]")
	public WebElement passwordBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Invalid password. Password at least 8 characters')]")
	public WebElement passwordInvalidMessage;

	@FindBy(xpath = "//div[contains(text(),'Email cannot be blank.')]")
	public WebElement emailBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Email address is not valid')]")
	public WebElement emailInvalidMessage;

	@FindBy(xpath = "//div[contains(text(),'Confirm password cannot be blank.')]")
	public WebElement confirmPasswordBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Confirm password was wrong')]")
	public WebElement confirmPasswordInvalidMessage;

	@FindBy(xpath = "//div[contains(text(),'Phone number cannot be blank.')]")
	public WebElement phoneNumberBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Phone number must be number')]")
	public WebElement phoneNumberWrongFormatMessage;

	@FindBy(xpath = "//div[contains(text(),'Service provider name already exists, please choos')]")
	public WebElement serviceProviderExistedMessage;

	@FindBy(xpath = "//tr[5]//td[6]//a[1]//span[1]")
	public WebElement updateServiceProviderIcon;

	@FindBy(xpath = "//tr[19]//td[6]//a[2]//span[1]")
	public WebElement deleteServiceProviderIcon;

	@FindBy(xpath = "//tr//td[6]//a[3]//span[1]")
	public List<WebElement> listViewIcon;

	@FindBy(xpath = "//tr//td[6]//a[4]//span[1]")
	public List<WebElement> listDeliveryContentIcon;

	@FindBy(xpath = "//input[@id='site-name']")
	public WebElement nameUpdateTextbox;

	@FindBy(xpath = "//textarea[@id='site-description']")
	public WebElement descriptionUpdateTextbox;

	@FindBy(xpath = "//input[@id='site-website']")
	public WebElement websiteUpdateTextbox;

	@FindBy(xpath = "//input[@id='site-cp_revernue_percent']")
	public WebElement dealerRevenueSharingUpdateTextbox;

	@FindBy(xpath = "//select[@id='site-currency']")
	public WebElement currenciesUpdateDropdown;

	@FindBy(xpath = "//select[@id='site-status']")
	public WebElement statusUpdateDropdown;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement updateButton;

	@FindBy(xpath = "//a[@class='btn btn-default']")
	public WebElement cancelUpdateButton;
	
	@FindBy(xpath = "//div[@id='w16-success']")
	public WebElement updateSuccessMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Name cannot be blank.')]")
	public WebElement nameUpdateBlankMessage;
	
	@FindBy(xpath = "//div[@id='w16-success']")
	public WebElement deleteSuccessMessage;
	
	@FindBy(xpath = "//button[@class = 'btn btn-warning']")
	public WebElement OKButtonInDeleteConfirmAlert;
	
	@FindBy(xpath = "//button[@class = 'btn btn-default']")
	public WebElement CancelButtonInDeleteConfirmAlert;

	String resultCompareText = "chang10";

	public ServiceProvider() {
		PageFactory.initElements(driver, this);
	}

	public String getServiceProviderTitle() {
		return getPageTitle();
	}

	public void searchServiceProviderByName(String value) throws Throwable {
		sendKeyToElement(nameCriteria, value);
		sendKeyboardToElement(nameCriteria, Keys.ENTER);
		Thread.sleep(3000);
		for (int i = 1; i < rowResults.size() + 1; i++) {
			String resultText = driver.findElement(By.xpath("//tbody//tr[" + i + "]//td[1]")).getText();
			if (compareContainText(resultText, value)) {
				System.out.print("The result is true\n");
			} else {
				System.out.print("No results found!\n");
			}
		}
	}

	public void createServiceProvider(String name, String accountName, String email, String phoneNumber,
			String password, String confirmPassword) {
		sendKeyToElement(nameAddTextbox, name);
		sendKeyToElement(accountNameAddTextbox, accountName);
		sendKeyToElement(emailAddTextbox, email);
		sendKeyToElement(phoneNumberAddTextbox, phoneNumber);
		sendKeyToElement(passwordAddTextbox, password);
		sendKeyToElement(confirmPasswordAddTextbox, confirmPassword);
		clickToElement(createButton);
	}
	
	public void createServiceProviderButCancel(String name, String accountName, String email, String phoneNumber,
			String password, String confirmPassword) {
		sendKeyToElement(nameAddTextbox, name);
		sendKeyToElement(accountNameAddTextbox, accountName);
		sendKeyToElement(emailAddTextbox, email);
		sendKeyToElement(phoneNumberAddTextbox, phoneNumber);
		sendKeyToElement(passwordAddTextbox, password);
		sendKeyToElement(confirmPasswordAddTextbox, confirmPassword);
		clickToElement(cancelButton);
	}

	public void createServiceProviderWithFullValue(String name, String description, String website, String currencies,
			String dealer, String status, String accountName, String email, String phoneNumber, String password,
			String confirmPassword) throws Throwable {
		sendKeyToElement(nameAddTextbox, name);
		// Thread.sleep(1000);
		sendKeyToElement(descriptionAddTextbox, description);
		// Thread.sleep(1000);
		sendKeyToElement(websiteAddTextbox, website);
		// Thread.sleep(1000);
		selectItemHtmlDropdown(currenciesAddDropdown, currencies);
		// Thread.sleep(1000);
		sendKeyToElement(dealerRevueSharingAddTextbox, dealer);
		// Thread.sleep(1000);
		selectItemHtmlDropdown(statusAddDropdown, status);
		// Thread.sleep(1000);
		sendKeyToElement(accountNameAddTextbox, accountName);
		// Thread.sleep(1000);
		sendKeyToElement(emailAddTextbox, email);
		// Thread.sleep(1000);
		sendKeyToElement(phoneNumberAddTextbox, password);
		// Thread.sleep(1000);
		sendKeyToElement(passwordAddTextbox, password);
		// Thread.sleep(2000);
		sendKeyToElement(confirmPasswordAddTextbox, confirmPassword);
		// Thread.sleep(2000);
		clickToElement(createButton);
	}

	public void updateServiceProvider(String name, String description, String website, String dealer, String currencies, String status) {
		clearToElement(nameUpdateTextbox);
		sendKeyToElement(nameUpdateTextbox, name);
		
		clearToElement(descriptionUpdateTextbox);
		sendKeyToElement(descriptionUpdateTextbox, description);
		
		clearToElement(websiteUpdateTextbox);
		sendKeyToElement(websiteUpdateTextbox, website);
		
		clearToElement(dealerRevenueSharingUpdateTextbox);
		sendKeyToElement(dealerRevenueSharingUpdateTextbox, dealer);
		
		sendKeyToElement(currenciesUpdateDropdown, currencies);
		
		sendKeyToElement(statusUpdateDropdown, status);
		
		clickToElement(updateButton);
	}
	
	public void updateServiceProviderButCancel(String name, String description, String website, String dealer, String currencies, String status) {
		sendKeyToElement(nameUpdateTextbox, name);
		sendKeyToElement(descriptionUpdateTextbox, description);
		sendKeyToElement(websiteUpdateTextbox, website);
		sendKeyToElement(dealerRevenueSharingUpdateTextbox, dealer);
		sendKeyToElement(currenciesUpdateDropdown, currencies);
		sendKeyToElement(statusUpdateDropdown, status);
		clickToElement(cancelUpdateButton);
	}

	public boolean verifyNameBlankMessage() {
		return isControlDisplayed(nameBlankMessage);
	}

	public boolean verifyAccountNameBlankMessage() {
		return isControlDisplayed(accountNameBlankMessage);
	}

	public boolean verifyEmailBlankMessage() {
		return isControlDisplayed(emailBlankMessage);
	}

	public boolean verifyPasswordBlankMessage() {
		return isControlDisplayed(passwordBlankMessage);
	}

	public boolean verifyConfirmPasswordBlankMessage() {
		return isControlDisplayed(confirmPasswordBlankMessage);
	}

	public boolean verifyPhoneNumberBlankMessage() {
		return isControlDisplayed(phoneNumberBlankMessage);
	}

	public boolean verifyAccountNameExistedMessage() {
		return isControlDisplayed(accountNameExistMessage);
	}

	public boolean verifyPasswordInvalidMessage() {
		return isControlDisplayed(passwordInvalidMessage);
	}

	public boolean verifyConfirmPasswordInvalidMessage() {
		return isControlDisplayed(confirmPasswordInvalidMessage);
	}

	public boolean verifyEmailInvalidMessage() {
		return isControlDisplayed(emailInvalidMessage);
	}

	public boolean verifyPhoneNumberWrongFormat() {
		return isControlDisplayed(phoneNumberWrongFormatMessage);
	}

	public boolean verifyServiceProviderExistedMessage() {
		return isControlDisplayed(serviceProviderExistedMessage);
	}

	public boolean verifyCreateServiceProviderSuccessMessage() {
		return isControlDisplayed(createSuccessMessage);
	}
	
	public boolean verifyUpdateServiceProviderSuccessMessage() {
		return isControlDisplayed(updateSuccessMessage);
	}
	
	public boolean verifyNameUpdateBlankMessage() {
		return isControlDisplayed(nameUpdateBlankMessage);
	}
	
	public boolean verifyDeleteSuccessMessage() {
		return isControlDisplayed(deleteSuccessMessage);
	}
	

}
