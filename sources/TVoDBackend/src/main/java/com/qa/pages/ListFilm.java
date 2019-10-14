package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;

public class ListFilm extends AbstractTest{

	@FindBy(xpath = "//input[@name='ContentSearch[display_name]']")
	@CacheLookup
	public WebElement displayedNameTextbox;
	
	@FindBy(xpath = "//tbody//tr//td[2]")
	@CacheLookup
	public List<WebElement> resultSearchCollumn;
	
	@FindBy(xpath = "//a[@class='btn btn-success']")
	@CacheLookup
	public WebElement createFilmButton;
	
	@FindBy(xpath = "//input[@id='content-display_name']")
	@CacheLookup
	public WebElement contentDisplayNameTextbox;
	
	@FindBy(xpath = "//input[@id='content-is_series']")
	@CacheLookup
	public WebElement contentIsSeriesCheckbox;
	
	@FindBy(xpath = "//select[@id='content-cp_id']")
	@CacheLookup
	public WebElement contentProviderDropdown;
	
	@FindBy(xpath = "//input[@id='content-activated_at-disp']")
	@CacheLookup
	public WebElement activatedDateTextbox;
	
	@FindBy(xpath = "//input[@id='content-expired_at-disp']")
	@CacheLookup
	public WebElement expiredDateTextbox;
	
	@FindBy(xpath = "//select[@id='content-status']")
	@CacheLookup
	public WebElement contentStatusDropdown;
	
	@FindBy(xpath = "//select[@id='content-honor']")
	@CacheLookup
	public WebElement contentHonorDropdown;
	
	@FindBy(xpath = "//input[@id='content-feature_title']")
	@CacheLookup
	public WebElement contentFeatureTitleTextbox;
	
	@FindBy(xpath = "//input[@id='content-tags']")
	@CacheLookup
	public WebElement contentTickTextbox;
	
	@FindBy(xpath = "//input[@placeholder='Search for related content ...']")
	@CacheLookup
	public WebElement contentRelatedTextbox;
	
	@FindBy(xpath = "//iframe[@class = 'cke_wysiwyg_frame cke_reset']")
	@CacheLookup
	public WebElement descriptionIframe;
	
	@FindBy(xpath = "//ifram[@class = 'cke_wysiwyg_frame cke_reset']")
	@CacheLookup
	public WebElement shortDescriptionIframe;
	
	@FindBy(xpath = "//div[@class ='file-actions']//div[@class = 'file-footer-buttons']//button[@class = 'kv-file-upload btn btn-kv btn-default btn-outline-secondary']")
	@CacheLookup
	public WebElement uploadPosterImageIcon;
	
	@FindBy(xpath = "//input[@id='content-thumbnail']")
	@CacheLookup
	public WebElement browserPosterImageButton;
	
	@FindBy(xpath = "//input[@id='content-screenshoot']")
	@CacheLookup
	public WebElement browserSlideShowImageButton;
	
	@FindBy(xpath = "//div[contains(@class, 'field-content-screenshoot')]//div[@class ='file-actions']//div[@class = 'file-footer-buttons']//button[contains(@class, 'kv-file-upload') and not(contains(@style,'display:none'))]")
	@CacheLookup
	public WebElement uploadSlideShowImageIcon;
	
	@FindBy(xpath = "//div[@id = 'list-site']//div[@class = 'checkbox']//input")
	@CacheLookup
	public List<WebElement> serviceProviderCheckboxList;
	
	@FindBy(xpath = "//select[@id='content-default_site_id']")
	@CacheLookup
	public WebElement originServiceProviderDropdown;
	
	@FindBy(xpath = "//div[@id = 'jstree0']//i[@class = 'jstree-icon jstree-checkbox']")
	@CacheLookup
	public List<WebElement> categoryCheckboxList;
	
	@FindBy(xpath = "//span[@class='select2 select2-container select2-container--krajee select2-container--focus select2-container--below select2-container--open']//ul[@class='select2-selection__rendered']")
	@CacheLookup
	public WebElement directorTextbox;
	
	@FindBy(xpath = "//span[@class='select2 select2-container select2-container--krajee select2-container--below select2-container--focus select2-container--open']//ul[@class='select2-selection__rendered']")
	@CacheLookup
	public WebElement actorTextbox;
	
	@FindBy(xpath = "//input[@id='content-contentattr-2']")
	@CacheLookup
	public WebElement contentAttributeTextbox;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-success')]")
	@CacheLookup
	public WebElement createButton;
	
	@FindBy(xpath = "//div[contains(text(),'Display name cannot be blank')]")
	@CacheLookup
	public WebElement displayedNameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Poster cannot be blank')]")
	@CacheLookup
	public WebElement posterImageBlankMessage;
	
	@FindBy(xpath = "//div[@class='form-group field-content-screenshoot has-error']//div[@class='help-block'][contains(text(),'cannot be blank')]")
	@CacheLookup
	public WebElement slideShowImageBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Service Provider cannot be blank')]")
	@CacheLookup
	public WebElement serviceProviderBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Category content cannot be blank')]")
	@CacheLookup
	public WebElement contentAttributeBlankMessage;
	
	@FindBy(xpath = "//div[@id='w12-error']")
	@CacheLookup
	public WebElement createFailedMessage;
	
	@FindBy(xpath = "//div[@id='w24-success']")
	@CacheLookup
	public WebElement createSuccessfulMessage;
	
	public ListFilm() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchFilmByName(String value) throws Throwable {
		sendKeyToElement(displayedNameTextbox, value);
		sendKeyboardToElement(displayedNameTextbox, Keys.ENTER);
		Thread.sleep(5000);
		for(int i = 1; i < resultSearchCollumn.size(); i ++) {
			String resultText = driver.findElement(By.xpath("//tbody//tr[" + i +"]//td[2]")).getText();
			if(compareContainText(resultText, value)) {
				System.out.print("The result is true\n");
			} else {
				System.out.print("No results found!\n");
			}
		}
	}
	
	public void createFilm(String displayedName, String activatedDate, String expiredDate, String featureTitle, String tick) throws Throwable {
		waitForElementVisible(contentDisplayNameTextbox);
		sendKeyToElement(contentDisplayNameTextbox, displayedName);
		
		waitForElementVisible(contentIsSeriesCheckbox);
		checkTheCheckbox(contentIsSeriesCheckbox);
		
		waitForElementVisible(contentProviderDropdown);
		selectItemHtmlDropdownByValue(contentProviderDropdown, "2");
		
		waitForElementVisible(activatedDateTextbox);
		sendKeyToElement(activatedDateTextbox, activatedDate);
		
		waitForElementVisible(expiredDateTextbox);
		sendKeyToElement(expiredDateTextbox, expiredDate);
		
		waitForElementVisible(contentStatusDropdown);
		selectItemHtmlDropdownByValue(contentStatusDropdown, "10");
		
		waitForElementVisible(contentHonorDropdown);
		selectItemHtmlDropdownByValue(contentHonorDropdown, "2");
		
		waitForElementVisible(contentFeatureTitleTextbox);
		sendKeyToElement(contentFeatureTitleTextbox, featureTitle);
		
		waitForElementVisible(contentTickTextbox);
		sendKeyToElement(contentTickTextbox, tick);
		
		//switchToIframe(descriptionIframe);
		//sendKeyToElement(descriptionIframe, description);
		
		//switchToIframe(shortDescriptionIframe);
		//sendKeyToElement(shortDescriptionIframe, shortDescription);
		scrollToIntoviewElement(browserPosterImageButton);
		uploadFile(browserPosterImageButton);
		waitForElementVisible(uploadPosterImageIcon);
		clickToElement(uploadPosterImageIcon);
		
		//Thread.sleep(2000);
		scrollToIntoviewElement(browserSlideShowImageButton);
		uploadFile(browserSlideShowImageButton);
		waitForElementClickalbe(uploadSlideShowImageIcon);
		Thread.sleep(2000);
		clickToElementByJavaScript(uploadSlideShowImageIcon);
		
		for(int i = 3; i < serviceProviderCheckboxList.size(); i = i + 12) {
			waitForElementVisible(serviceProviderCheckboxList.get(i));
			checkTheCheckbox(serviceProviderCheckboxList.get(i));
		}
		
		waitForElementVisible(originServiceProviderDropdown);
		selectItemHtmlDropdownByValue(originServiceProviderDropdown, "15");
		
		for(int i = 1; i < categoryCheckboxList.size(); i = i + 2) {
			checkTheCheckbox(categoryCheckboxList.get(i));
		}
		
		waitForElementVisible(createButton);
		clickToElementByJavaScript(createButton);
	}
	
	public boolean verifyDisplayNameBlank() {
		waitForElementVisible(displayedNameBlankMessage);
		return isControlDisplayed(displayedNameBlankMessage);
	}
	
	public boolean verifyPosterImageBlank() {
		waitForElementVisible(posterImageBlankMessage);
		return isControlDisplayed(posterImageBlankMessage);
	}
	
	public boolean verifySlideShowImageBlank() {
		waitForElementVisible(slideShowImageBlankMessage);
		return isControlDisplayed(slideShowImageBlankMessage);
	}
	
	public boolean verifyServiceProviderBlank() {
		waitForElementVisible(serviceProviderBlankMessage);
		return isControlDisplayed(serviceProviderBlankMessage);
	}
	
	public boolean verifyCategoryBlank() {
		waitForElementVisible(contentAttributeBlankMessage);
		return isControlDisplayed(contentAttributeBlankMessage);
	}
	
	public boolean verifyCreateFailedMessage() {
		waitForElementVisible(createFailedMessage);
		return isControlDisplayed(createFailedMessage);
	}
	
}