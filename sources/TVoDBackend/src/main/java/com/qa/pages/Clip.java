package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;
import com.thoughtworks.selenium.webdriven.commands.DeselectPopUp;

public class Clip extends AbstractTest{
	@FindBy(xpath = "//a[text() = 'Create Clip']")
	@CacheLookup
	public WebElement createClipButton;
	
	@FindBy(xpath = "//input[@id='content-display_name']")
	@CacheLookup
	public WebElement displayNameTxt;
	
	@FindBy(xpath = "//input[@id='content-is_push']")
	@CacheLookup
	public WebElement pushNotificationCheckbox;
	
	@FindBy(xpath = "//input[@id='content-inbox']")
	@CacheLookup
	public WebElement sendToInboxCheckbox;
	
	@FindBy(xpath = "//input[@id='content-year']")
	public WebElement productYearTxt;
	
	@FindBy(xpath = "//input[@id='content-country']")
	@CacheLookup
	public WebElement countryTxt;
	
	@FindBy(xpath = "//input[@id='content-activated_at-disp']")
	@CacheLookup
	public WebElement activationDateTxt;
	
	@FindBy(xpath = "//input[@id='content-expired_at-disp']")
	@CacheLookup
	public WebElement expirationDateTxt;
	
	@FindBy(xpath = "//select[@id='content-status']")
	@CacheLookup
	public WebElement statusSelection;
	
	@FindBy(xpath = "//select[@id='content-honor']")
	@CacheLookup
	public WebElement honorSelection;
	
	@FindBy(xpath = "//input[@id='content-feature_title']")
	@CacheLookup
	public WebElement featureTitleTxt;
	
	@FindBy(xpath = "//input[@id='content-tags']")
	@CacheLookup
	public WebElement tickTxt;
	
	@FindBy(xpath = "//input[@id='content-thumbnail']")
	@CacheLookup
	public WebElement browserUploadPosterImageButton;
	
	//thieu 2 icon upload file
	
	@FindBy(xpath = "//input[@id='content-screenshoot']")
	@CacheLookup
	public WebElement browserUploadSlideshowImageButton;
	
	@FindBy(xpath = "//div[@class = 'col-md-10']//div[@class = 'checkbox']//input")
	@CacheLookup
	public List<WebElement> serviceProviderCheckbox;
	
	@FindBy(xpath = "//select[@id='content-default_site_id']")
	@CacheLookup
	public WebElement originServiceProviderSelection;
	
	@FindBy(xpath = "//li[@id='44']//i[contains(@class,'jstree-icon jstree-ocl')]")
	@CacheLookup
	public WebElement categorySelection;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-success')]")
	@CacheLookup
	public WebElement createButton;
	
	@FindBy(xpath = "//div[contains(text(),'Display name cannot be blank')]")
	@CacheLookup
	public WebElement displayNameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Image Poster vertical cannot be blank')]")
	@CacheLookup
	public WebElement posterImageBlankMessage;
	
	@FindBy(xpath = "//div[contains(@class,'form-group field-content-screenshoot has-error')]//div[contains(@class,'help-block')][contains(text(),'cannot be blank')]")
	@CacheLookup
	public WebElement slideShowBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Service Provider cannot be blank')]")
	@CacheLookup
	public WebElement serviceProviderBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Category content cannot be blank')]")
	@CacheLookup
	public WebElement categoryContentBlankMessage;
	
	@FindBy(xpath = "//div[@id='w28-success']")
	@CacheLookup
	public WebElement createClipSuccessMessage;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	@CacheLookup
	public WebElement updateClipButton;
	
	@FindBy(xpath = "//tr[1]//td[7]//a[1]//span[1]")
	@CacheLookup
	public WebElement viewClipIcon;
	
	@FindBy(xpath = "//tr[1]//td[7]//a[2]//span[1]")
	@CacheLookup
	public WebElement updateClipIcon;
	
	@FindBy(xpath = "//div[@id='jstree0']//ul[@class='jstree-children']//i[@class='jstree-icon jstree-checkbox']")
	@CacheLookup
	public WebElement categoryAssignedCheckbox;
	
	@FindBy(xpath = "//button[@id='setSpAllContent']")
	@CacheLookup
	public WebElement assignCategoryToSPButton;
	
	@FindBy(xpath = "//select[@id='list-site']")
	@CacheLookup
	public WebElement serviceProviderToAssignSelection;
	
	@FindBy(xpath = "//button[@id='runSetSpAllContent']")
	@CacheLookup
	public WebElement assignButton;
	
	@FindBy(xpath = "//button[@id='runCancelContent']")
	@CacheLookup
	public WebElement cancelAssignButton;
	
	@FindBy(xpath = "//select[@id='approveSite']")
	@CacheLookup
	public WebElement serviceProviderToAssignDirect;
	
	@FindBy(xpath = "//button[contains(text(),'Publish')]")
	@CacheLookup
	public WebElement publishButton;
	
	@FindBy(xpath = "//button[contains(text(),'Unpublish')]")
	@CacheLookup
	public WebElement unPublishButton;
	
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	@CacheLookup
	public WebElement deleteButton;
	
	
	
	public Clip() {
		PageFactory.initElements(driver, this);
	}
	
	public void createClip(String displayName, String productYear, String country, String activationDate, String expirationDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(pushNotificationCheckbox);
		checkTheCheckbox(pushNotificationCheckbox);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, expirationDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		selectItemHtmlDropdownByValue(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		selectItemHtmlDropdownByValue(tickTxt, tick);
		
		waitForElementVisible(browserUploadPosterImageButton);
		uploadFile(browserUploadPosterImageButton);
		//buoc click vao icon upload
		
		waitForElementVisible(browserUploadSlideshowImageButton);
		uploadFile(browserUploadSlideshowImageButton);
		//buoc click vao icon upload
		
		for(int i = 0; i < serviceProviderCheckbox.size(); i++) {
			waitForElementVisible(serviceProviderCheckbox.get(i));
			checkTheCheckbox(serviceProviderCheckbox.get(i));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
		waitForElementVisible(categorySelection);
		checkTheCheckbox(categorySelection);
		
		waitForElementVisible(createButton);
		clickToElement(createButton);
		
	}
	
	public void createClipWithoutPosterImage(String displayName, String productYear, String country, String activationDate, String expirationDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(pushNotificationCheckbox);
		checkTheCheckbox(pushNotificationCheckbox);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, expirationDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		selectItemHtmlDropdownByValue(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		selectItemHtmlDropdownByValue(tickTxt, tick);
		
		waitForElementVisible(browserUploadSlideshowImageButton);
		uploadFile(browserUploadSlideshowImageButton);
		//buoc click vao icon upload
		
		for(int i = 0; i < serviceProviderCheckbox.size(); i++) {
			waitForElementVisible(serviceProviderCheckbox.get(i));
			checkTheCheckbox(serviceProviderCheckbox.get(i));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
		waitForElementVisible(categorySelection);
		checkTheCheckbox(categorySelection);
		
		waitForElementVisible(createButton);
		clickToElement(createButton);
	}
	
	public void createClipWithoutSlideShowImage(String displayName, String productYear, String country, String activationDate, String expirationDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(pushNotificationCheckbox);
		checkTheCheckbox(pushNotificationCheckbox);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, expirationDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		selectItemHtmlDropdownByValue(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		selectItemHtmlDropdownByValue(tickTxt, tick);
		
		waitForElementVisible(browserUploadPosterImageButton);
		uploadFile(browserUploadPosterImageButton);
		//buoc click vao icon upload
		
		for(int i = 0; i < serviceProviderCheckbox.size(); i++) {
			waitForElementVisible(serviceProviderCheckbox.get(i));
			checkTheCheckbox(serviceProviderCheckbox.get(i));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
		waitForElementVisible(categorySelection);
		checkTheCheckbox(categorySelection);
		
		waitForElementVisible(createButton);
		clickToElement(createButton);
	}
	
	public void createClipWithoutServiceProvider(String displayName, String productYear, String country, String activationDate, String expirationDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(pushNotificationCheckbox);
		checkTheCheckbox(pushNotificationCheckbox);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, expirationDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		selectItemHtmlDropdownByValue(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		selectItemHtmlDropdownByValue(tickTxt, tick);
		
		waitForElementVisible(browserUploadPosterImageButton);
		uploadFile(browserUploadPosterImageButton);
		//buoc click vao icon upload
		
		waitForElementVisible(browserUploadSlideshowImageButton);
		uploadFile(browserUploadSlideshowImageButton);
		//buoc click vao icon upload
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
		waitForElementVisible(categorySelection);
		checkTheCheckbox(categorySelection);
		
		waitForElementVisible(createButton);
		clickToElement(createButton);
	}
	
	public void createClipWithoutCategory(String displayName, String productYear, String country, String activationDate, String expirationDate, String status, String honor, String featureTitle, String tick, String originServiceProvider) throws Throwable {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(pushNotificationCheckbox);
		checkTheCheckbox(pushNotificationCheckbox);
		
		waitForElementVisible(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDate);
		
		waitForElementVisible(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, expirationDate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honor);
		
		waitForElementVisible(featureTitleTxt);
		selectItemHtmlDropdownByValue(featureTitleTxt, featureTitle);
		
		waitForElementVisible(tickTxt);
		selectItemHtmlDropdownByValue(tickTxt, tick);
		
		waitForElementVisible(browserUploadPosterImageButton);
		uploadFile(browserUploadPosterImageButton);
		//buoc click vao icon upload
		
		waitForElementVisible(browserUploadSlideshowImageButton);
		uploadFile(browserUploadSlideshowImageButton);
		//buoc click vao icon upload
		
		for(int i = 0; i < serviceProviderCheckbox.size(); i++) {
			waitForElementVisible(serviceProviderCheckbox.get(i));
			checkTheCheckbox(serviceProviderCheckbox.get(i));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProvider);
		
		//waitForElementVisible(categorySelection);
		//checkTheCheckbox(categorySelection);
		
		waitForElementVisible(createButton);
		clickToElement(createButton);
	}
	
	public void updateClip(String displayName, String productYear, String country, String activationDateUpdate, String expirationDateUpdate, String status, String honorUpdate, String featureTitleUpdate, String tickUpdate, String originServiceProviderUpdate) throws Throwable {
		waitForElementVisible(displayNameTxt);
		clearToElement(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(sendToInboxCheckbox);
		checkTheCheckbox(sendToInboxCheckbox);
		
		waitForElementVisible(productYearTxt);
		clearToElement(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		clearToElement(productYearTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		clearToElement(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDateUpdate);
		
		waitForElementVisible(expirationDateTxt);
		clearToElement(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, expirationDateUpdate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honorUpdate);
		
		waitForElementVisible(featureTitleTxt);
		selectItemHtmlDropdownByValue(featureTitleTxt, featureTitleUpdate);
		
		waitForElementVisible(tickTxt);
		selectItemHtmlDropdownByValue(tickTxt, tickUpdate);
		
		waitForElementVisible(browserUploadPosterImageButton);
		uploadFile(browserUploadPosterImageButton);
		//buoc click vao icon upload
		
		waitForElementVisible(browserUploadSlideshowImageButton);
		uploadFile(browserUploadSlideshowImageButton);
		//buoc click vao icon upload
		
//		for(int i = 0; i < serviceProviderCheckbox.size(); i++) {
//			waitForElementVisible(serviceProviderCheckbox.get(i));
//			checkTheCheckbox(serviceProviderCheckbox.get(i));
//		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProviderUpdate);
		
		//waitForElementVisible(categorySelection);
		//checkTheCheckbox(categorySelection);
		
		waitForElementVisible(updateClipButton);
		clickToElement(updateClipButton);
	}
	
	public void updateClipWithoutServiceProvider(String displayName, String productYear, String country, String activationDateUpdate, String expirationDateUpdate, String status, String honorUpdate, String featureTitleUpdate, String tickUpdate, String originServiceProviderUpdate) throws Throwable {
		waitForElementVisible(displayNameTxt);
		clearToElement(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(sendToInboxCheckbox);
		checkTheCheckbox(sendToInboxCheckbox);
		
		waitForElementVisible(productYearTxt);
		clearToElement(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		clearToElement(productYearTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		clearToElement(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDateUpdate);
		
		waitForElementVisible(expirationDateTxt);
		clearToElement(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, expirationDateUpdate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honorUpdate);
		
		waitForElementVisible(featureTitleTxt);
		selectItemHtmlDropdownByValue(featureTitleTxt, featureTitleUpdate);
		
		waitForElementVisible(tickTxt);
		selectItemHtmlDropdownByValue(tickTxt, tickUpdate);
		
		waitForElementVisible(browserUploadPosterImageButton);
		uploadFile(browserUploadPosterImageButton);
		//buoc click vao icon upload
		
		waitForElementVisible(browserUploadSlideshowImageButton);
		uploadFile(browserUploadSlideshowImageButton);
		//buoc click vao icon upload
		
		for(int i = 0; i < serviceProviderCheckbox.size(); i++) {
			waitForElementVisible(serviceProviderCheckbox.get(i));
			checkTheCheckbox(serviceProviderCheckbox.get(i));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProviderUpdate);
		
		//waitForElementVisible(categorySelection);
		//checkTheCheckbox(categorySelection);
		
		waitForElementVisible(updateClipButton);
		clickToElement(updateClipButton);
	}
	
	public void updateClipWithoutCategory(String displayName, String productYear, String country, String activationDateUpdate, String expirationDateUpdate, String status, String honorUpdate, String featureTitleUpdate, String tickUpdate, String originServiceProviderUpdate) throws Throwable {
		waitForElementVisible(displayNameTxt);
		clearToElement(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);
		
		waitForElementVisible(sendToInboxCheckbox);
		checkTheCheckbox(sendToInboxCheckbox);
		
		waitForElementVisible(productYearTxt);
		clearToElement(productYearTxt);
		sendKeyToElement(productYearTxt, productYear);
		
		waitForElementVisible(countryTxt);
		clearToElement(productYearTxt);
		sendKeyToElement(countryTxt, country);
		
		waitForElementVisible(activationDateTxt);
		clearToElement(activationDateTxt);
		sendKeyToElement(activationDateTxt, activationDateUpdate);
		
		waitForElementVisible(expirationDateTxt);
		clearToElement(expirationDateTxt);
		sendKeyToElement(expirationDateTxt, expirationDateUpdate);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(honorSelection);
		selectItemHtmlDropdownByValue(honorSelection, honorUpdate);
		
		waitForElementVisible(featureTitleTxt);
		selectItemHtmlDropdownByValue(featureTitleTxt, featureTitleUpdate);
		
		waitForElementVisible(tickTxt);
		selectItemHtmlDropdownByValue(tickTxt, tickUpdate);
		
		waitForElementVisible(browserUploadPosterImageButton);
		uploadFile(browserUploadPosterImageButton);
		//buoc click vao icon upload
		
		waitForElementVisible(browserUploadSlideshowImageButton);
		uploadFile(browserUploadSlideshowImageButton);
		//buoc click vao icon upload
		
		for(int i = 0; i < serviceProviderCheckbox.size(); i++) {
			waitForElementVisible(serviceProviderCheckbox.get(i));
			checkTheCheckbox(serviceProviderCheckbox.get(i));
		}
		
		waitForElementVisible(originServiceProviderSelection);
		selectItemHtmlDropdownByValue(originServiceProviderSelection, originServiceProviderUpdate);
		
		waitForElementVisible(categorySelection);
		if(isControlSelected(categorySelection)) {
			checkTheCheckbox(categorySelection);//check lan thu 2 = bo check
		}
		
		waitForElementVisible(updateClipButton);
		clickToElement(updateClipButton);
	}
	
	public boolean verifyDisplayNameBlankMessage() {
		waitForElementVisible(displayNameBlankMessage);
		return isControlDisplayed(displayNameBlankMessage);
	}
	
	public boolean verifyPosterImageBlankMessage() {
		waitForElementVisible(posterImageBlankMessage);
		return isControlDisplayed(posterImageBlankMessage);
	}
	
	public boolean verifySlideShowImageBlankMessage() {
		waitForElementVisible(slideShowBlankMessage);
		return isControlDisplayed(slideShowBlankMessage);
	}
	
	public boolean verifyServiceProviderBlankMessage() {
		waitForElementVisible(serviceProviderBlankMessage);
		return isControlDisplayed(serviceProviderBlankMessage);
	}
	
	public boolean verifyCategoryBlankMessage() {
		waitForElementVisible(categoryContentBlankMessage);
		return isControlDisplayed(categoryContentBlankMessage);
	}
	
	public boolean verifyCreateClipSuccessMessage() {
		waitForElementVisible(createClipSuccessMessage);
		return isControlDisplayed(createClipSuccessMessage);
	}
	
	
}
