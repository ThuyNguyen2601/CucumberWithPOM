package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.util.TestBase;

public class ServiceProvider extends TestBase{
	@FindBy(xpath = "//input[@name='SiteSearch[name]']")
	WebElement nameCriteria;
	
	@FindBy(xpath = ".//*[@id='w0-container']/table/thead/tr/th")
	By collumnResult;
	
	@FindBy(xpath = ".//*[@id='w0-container']/table/tbody/tr")
	By rowResult;
	
	@FindBy(xpath = "//input[@name='SiteSearch[description]']")
	WebElement descriptionCriteria;
	
	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement createServiceProviderButton;
	
	@FindBy(xpath = "//tr[1]//td[6]//a[1]//span[1]")
	WebElement updateIcon;
	
	@FindBy(xpath = "//tr[1]//td[6]//a[2]//span[1]")
	WebElement deleteIcon;
	
	@FindBy(xpath = "//tr[1]//td[6]//a[3]//span[1]")
	WebElement viewIcon;
	
	@FindBy(xpath = "//tr[1]//td[6]//a[4]//span[1]")
	WebElement contentDeliveryIcon;
	
	@FindBy(xpath = "//input[@id='serviceproviderform-name']")
	WebElement nameAddTextbox;
	
	@FindBy(xpath = "//textarea[@id='serviceproviderform-description']")
	WebElement descriptionAddTextbox;
	
	@FindBy(xpath = "//input[@id='serviceproviderform-website']")
	WebElement websiteAddTextbox;
	
	@FindBy(xpath = "//select[@id='serviceproviderform-currency']")
	WebElement currenciesAddDropdown;
	
	@FindBy(xpath = "//input[@id='serviceproviderform-cp_revernue_percent']")
	WebElement dealerRevueSharingAddTextbox;
	
	@FindBy(xpath = "//select[@id='serviceproviderform-status']")
	WebElement statusAddDropdown;
	
	@FindBy(xpath = "//input[@id='serviceproviderform-username']")
	WebElement accountNameAddTextbox;
	
	@FindBy(xpath = "//input[@id='serviceproviderform-password']")
	WebElement passwordAddTextbox;
	
	@FindBy(xpath = "//input[@id='serviceproviderform-email']")
	WebElement emailAddTextbox;
	
	@FindBy(xpath = "//input[@id='serviceproviderform-confirm_password']")
	WebElement confirmPasswordAddTextbox;
	
	@FindBy(xpath = "//input[@id='serviceproviderform-phone_number']")
	WebElement phoneNumberAddTextbox;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement createButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement cancelButton;
	
	@FindBy(xpath = "//div[@id='w16-success']")
	WebElement createSuccessMessage;
	
	String resultCompareText = "chang10";
	
	public ServiceProvider() {
		PageFactory.initElements(driver, this);
	}
	
	public String getServiceProviderTitle() {
		return getPageTitle();
	}
	
	public void searchServiceProviderByName(String value) {
		sendKeyToElement(nameCriteria, value);
		sendKeyboardToElement(nameCriteria, Keys.ENTER);
		List <WebElement> rows = driver.findElements(rowResult);
		for(int i = 1; i < rows.size(); i++) {
			String resultText = driver.findElement(By.xpath("html/body/div[1]/div[13]/talbe/tbody/tr[\\\" + (i+1) + \\\"]/td[1]")).getText();
			Assert.assertEquals(resultText, resultCompareText);
			//Assert.assertSame(resultText, resultCompareText);
		}
	}
	
	
}
