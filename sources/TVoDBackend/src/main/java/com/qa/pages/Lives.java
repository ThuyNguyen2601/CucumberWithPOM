package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;

public class Lives extends AbstractTest{
	
	@FindBy(xpath = "//a[text() = 'Create Live']")
	public WebElement createLiveButton;
	
	@FindBy(xpath = "//input[@id='content-display_name']")
	public WebElement displayNameTxt;
	
	@FindBy(xpath = "//input[@id='content-is_push']")
	public WebElement pushNotificationCheckbox;
	
	@FindBy(xpath = "//input[@id='content-year']")
	public WebElement productYearTxt;
	
	@FindBy(xpath = "//input[@id='content-country']")
	public WebElement countryTxt;
	
	@FindBy(xpath = "//input[@id='content-activated_at-disp']")
	public WebElement activationDateTxt;
	
	@FindBy(xpath = "//input[@id='content-expired_at-disp']")
	public WebElement expirationDateTxt;
	
	@FindBy(xpath = "//select[@id='content-status']")
	public WebElement statusSelection;
	
	@FindBy(xpath = "//select[@id='content-honor']")
	public WebElement honorSelection;
	
	@FindBy(xpath = "//input[@id='content-feature_title']")
	public WebElement featureTitleTxt;
	
	@FindBy(xpath = "//input[@id='content-order']")
	public WebElement arrangementTxt;
	
	@FindBy(xpath = "//input[@id='content-tags']")
	public WebElement tickTxt;
	
	@FindBy(xpath = "//input[@id='content-thumbnail']")
	public WebElement posterImageBrowserButton;
	
	@FindBy(xpath = "//input[@id='content-screenshoot']")
	public WebElement slideShowImageBrowserButton;
	
	@FindBy(xpath = "//div[@id = 'list-site']//div[@class = 'checkbox']//input")
	public List<WebElement> serviceProviderListCheckbox;
	
	@FindBy(xpath = "//select[@id='content-default_site_id']")
	public WebElement originServiceProviderSelection;
	
	@FindBy(xpath = "//div[@id = 'jstree0']//ul[@class = 'jstree-container-ul jstree-children']//i[@class = 'jstree-icon jstree-checkbox']")
	public List<WebElement> categoryListCheckbox;
	
	@FindBy(xpath = "//button[text() = 'Create']")
	public WebElement createButton;
	
	@FindBy(xpath = "//div[contains(text(),'Display name cannot be blank')]")
	public WebElement displayNameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Image Poster vertical cannot be blank')]")
	public WebElement posterImageBlankMessage;
	
	@FindBy(xpath = "//div[@class='form-group field-content-screenshoot has-error']//div[@class='help-block'][contains(text(),'cannot be blank')]")
	public WebElement slideShowImageBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Service Provider cannot be blank')]")
	public WebElement serviceProviderBlankMessag;
	
	@FindBy(xpath = "//div[contains(text(),'Category content cannot be blank')]")
	public WebElement categoryBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Channel name already exists')]")
	public WebElement displayNameAlreadyExistsMessag;
	
	@FindBy(xpath = "//div[@id='w32-success']")
	public WebElement createLivesSuccessMessage;
	
	
	
	public Lives() {
		PageFactory.initElements(driver, this);
	}
	
	public void createLives(String displayName, String productYear, String country, String activationDate, String experitionDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, experitionDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		sendKeyToElement(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		sendKeyToElement(tickTxt, tick);
		
		waitForElementVisible(posterImageBrowserButton);
		uploadFile(posterImageBrowserButton);
		
		//Thao tac nhan icon upload
		
		waitForElementVisible(slideShowImageBrowserButton);
		uploadFile(slideShowImageBrowserButton);
		
		//Thao tac nhan icon upload
		
		for(int i = 0; i < serviceProviderListCheckbox.size(); i ++) {
			waitForElementVisible(serviceProviderListCheckbox.get(0));
			checkTheCheckbox(serviceProviderListCheckbox.get(0));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
		for(int i = 0; i < categoryListCheckbox.size(); i ++) {
			waitForElementVisible(categoryListCheckbox.get(0));
			checkTheCheckbox(categoryListCheckbox.get(0));
		}
		
		waitForElementClickalbe(createButton);
		clickToElement(createButton);
		
	}

	public void createLivesWithoutPosterImage(String displayName, String productYear, String country, String activationDate, String experitionDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, experitionDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		sendKeyToElement(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		sendKeyToElement(tickTxt, tick);
		
//		waitForElementVisible(posterImageBrowserButton);
//		uploadFile(posterImageBrowserButton);
		
		//Thao tac nhan icon upload
		
		waitForElementVisible(slideShowImageBrowserButton);
		uploadFile(slideShowImageBrowserButton);
		
		//Thao tac nhan icon upload
		
		for(int i = 0; i < serviceProviderListCheckbox.size(); i ++) {
			waitForElementVisible(serviceProviderListCheckbox.get(0));
			checkTheCheckbox(serviceProviderListCheckbox.get(0));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
		for(int i = 0; i < categoryListCheckbox.size(); i ++) {
			waitForElementVisible(categoryListCheckbox.get(0));
			checkTheCheckbox(categoryListCheckbox.get(0));
		}
		
		waitForElementClickalbe(createButton);
		clickToElement(createButton);
	}
	
	public void createLivesWithoutSlideShowImage(String displayName, String productYear, String country, String activationDate, String experitionDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, experitionDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		sendKeyToElement(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		sendKeyToElement(tickTxt, tick);
		
		waitForElementVisible(posterImageBrowserButton);
		uploadFile(posterImageBrowserButton);
		
		//Thao tac nhan icon upload
		
//		waitForElementVisible(slideShowImageBrowserButton);
//		uploadFile(slideShowImageBrowserButton);
		
		//Thao tac nhan icon upload
		
		for(int i = 0; i < serviceProviderListCheckbox.size(); i ++) {
			waitForElementVisible(serviceProviderListCheckbox.get(0));
			checkTheCheckbox(serviceProviderListCheckbox.get(0));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
		for(int i = 0; i < categoryListCheckbox.size(); i ++) {
			waitForElementVisible(categoryListCheckbox.get(0));
			checkTheCheckbox(categoryListCheckbox.get(0));
		}
		
		waitForElementClickalbe(createButton);
		clickToElement(createButton);
	}
	
	public void createLivesWithoutServiceProvider(String displayName, String productYear, String country, String activationDate, String experitionDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, experitionDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		sendKeyToElement(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		sendKeyToElement(tickTxt, tick);
		
		waitForElementVisible(posterImageBrowserButton);
		uploadFile(posterImageBrowserButton);
		
		//Thao tac nhan icon upload
		
		waitForElementVisible(slideShowImageBrowserButton);
		uploadFile(slideShowImageBrowserButton);
		
		//Thao tac nhan icon upload
		
//		for(int i = 0; i < serviceProviderListCheckbox.size(); i ++) {
//			waitForElementVisible(serviceProviderListCheckbox.get(0));
//			checkTheCheckbox(serviceProviderListCheckbox.get(0));
//		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
		for(int i = 0; i < categoryListCheckbox.size(); i ++) {
			waitForElementVisible(categoryListCheckbox.get(0));
			checkTheCheckbox(categoryListCheckbox.get(0));
		}
		
		waitForElementClickalbe(createButton);
		clickToElement(createButton);
	}
	
	public void createLivesWithoutCategory(String displayName, String productYear, String country, String activationDate, String experitionDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, experitionDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		sendKeyToElement(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		sendKeyToElement(tickTxt, tick);
		
		waitForElementVisible(posterImageBrowserButton);
		uploadFile(posterImageBrowserButton);
		
		//Thao tac nhan icon upload
		
		waitForElementVisible(slideShowImageBrowserButton);
		uploadFile(slideShowImageBrowserButton);
		
		//Thao tac nhan icon upload
		
		for(int i = 0; i < serviceProviderListCheckbox.size(); i ++) {
			waitForElementVisible(serviceProviderListCheckbox.get(0));
			checkTheCheckbox(serviceProviderListCheckbox.get(0));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
//		for(int i = 0; i < categoryListCheckbox.size(); i ++) {
//			waitForElementVisible(categoryListCheckbox.get(0));
//			checkTheCheckbox(categoryListCheckbox.get(0));
//		}
		
		waitForElementClickalbe(createButton);
		clickToElement(createButton);
	}
	
	public boolean verifyDisplayNameBlankMessage() {
		waitForElementVisible(displayNameBlankMessage);
		return isControlDisplayed(displayNameBlankMessage);
	}
	
	public boolean verifyDisplayNameAlreadyExistsMessage() {
		waitForElementVisible(displayNameAlreadyExistsMessag);
		return isControlDisplayed(displayNameAlreadyExistsMessag);
	}
	
	public boolean verifyPosterImageBlankMessage() {
		waitForElementVisible(posterImageBlankMessage);
		return isControlDisplayed(posterImageBlankMessage);
	}
	
	public boolean verifySlideShowImageBlankMessage() {
		waitForElementVisible(slideShowImageBlankMessage);
		return isControlDisplayed(slideShowImageBlankMessage);
	}
	
	public boolean verifyServiceProviderBlankMessage() {
		waitForElementVisible(serviceProviderBlankMessag);
		return isControlDisplayed(serviceProviderBlankMessag);
	}
	
	public boolean verifyCategoryBlankMessage() {
		waitForElementVisible(categoryBlankMessage);
		return isControlDisplayed(categoryBlankMessage);
	}
	
	public boolean verifyCreateLivesSuccessMessage() {
		waitForElementVisible(createLivesSuccessMessage);
		return isControlDisplayed(createLivesSuccessMessage);
	}
	
}
