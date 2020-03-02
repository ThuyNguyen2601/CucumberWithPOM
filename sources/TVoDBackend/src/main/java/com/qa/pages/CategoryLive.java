package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;

public class CategoryLive extends AbstractTest{
	
	@FindBy(xpath = "//a[contains(text(),'Create Category Live')]")
	@CacheLookup
	public WebElement createCategoryLiveButton;
	
	@FindBy(xpath = "//input[@id='category-display_name']")
	@CacheLookup
	public WebElement categoryLiveNameTxt;
	
	@FindBy(xpath = "//textarea[@id='category-description']")
	@CacheLookup
	public WebElement descriptionTxt;
	
	@FindBy(xpath = "//input[@id='category-images']")
	@CacheLookup
	public WebElement avatarBrowserButton;
	
	@FindBy(xpath = "//select[@id='category-status']")
	@CacheLookup
	public WebElement statusSelection;
	
	@FindBy(xpath = "//select[@id='category-parent_id']")
	@CacheLookup
	public WebElement parentCategorySelection;
	
	@FindBy(xpath = "//div[@id = 'category-assignment_sites']//div[@class = 'checkbox']//input")
	@CacheLookup
	public List<WebElement> listServiceProviderCheckbox;
	
	@FindBy(xpath = "//button[contains(text(),'Create Category')]")
	@CacheLookup
	public WebElement createButton;
	
	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	@CacheLookup
	public WebElement cancelCreateButton;
	
	@FindBy(xpath = "//tr[1]//td[5]//a[1]//span[1]")
	@CacheLookup
	public WebElement updateCategoryLiveIcon;
	
	@FindBy(xpath = "//button[contains(text(),'Update')]")
	@CacheLookup
	public WebElement updateButton;
	
	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	@CacheLookup
	public WebElement cancelUpdateCategoryLiveButton;
	
	@FindBy(xpath = "//tr[1]//td[5]//a[2]//span[1]")
	@CacheLookup
	public WebElement deleteCategoryLiveIcon;
	
	@FindBy(xpath = "//button[@class = 'btn btn-default']")
	@CacheLookup
	public WebElement cancelDeleteCategoryLiveButton;
	
	@FindBy(xpath = "//button[@class = 'btn btn-warning']")
	@CacheLookup
	public WebElement okDeleteCategoryLiveButton;
	
	@FindBy(xpath = "//div[contains(text(),'Name of category cannot be blank')]")
	@CacheLookup
	public WebElement categoryLiveNameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Service Provider cannot be blank')]")
	@CacheLookup
	public WebElement serviceProviderBlankMessage;
	
	@FindBy(xpath = "//div[@id='w18-success']")
	@CacheLookup
	public WebElement createCategoryLiveSuccessMessage;
	
	@FindBy(xpath = "//div[@id = 'w18-success']")
	@CacheLookup
	public WebElement updateCategoryLiveSuccessMessage;
	
	@FindBy(xpath = "//div[@id='w21-success']")
	@CacheLookup
	public WebElement deleteCategoryLiveSuccessMessage;
	
	public CategoryLive() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfPage() {
		return getPageTitle();
	}
	
	public void createCategoryLive(String categoryLiveName, String description, String status, String parentCategory, String button) throws Throwable {
		waitForElementVisible(categoryLiveNameTxt);
		sendKeyToElement(categoryLiveNameTxt, categoryLiveName);
		
		waitForElementVisible(descriptionTxt);
		sendKeyToElement(descriptionTxt, description);
		
		waitForElementVisible(avatarBrowserButton);
		uploadFile(avatarBrowserButton);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(parentCategorySelection);
		selectItemHtmlDropdownByValue(parentCategorySelection, parentCategory);
		
		for(int i = 0; i < listServiceProviderCheckbox.size(); i ++) {
			waitForElementVisible(listServiceProviderCheckbox.get(1));
			checkTheCheckbox(listServiceProviderCheckbox.get(1));
		}
		
		if(button == "Create Category") {
			waitForElementClickalbe(createButton);
			clickToElement(createButton);
		}
		else {
			waitForElementClickalbe(cancelCreateButton);
			clickToElement(cancelCreateButton);
		}
	}
	
	public void createCategoryLiveWithoutServiceProvider(String categoryLiveName, String description, String status, String parentCategory, String button) throws Throwable {
		waitForElementVisible(categoryLiveNameTxt);
		sendKeyToElement(categoryLiveNameTxt, categoryLiveName);
		
		waitForElementVisible(descriptionTxt);
		sendKeyToElement(descriptionTxt, description);
		
		waitForElementVisible(avatarBrowserButton);
		uploadFile(avatarBrowserButton);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(parentCategorySelection);
		selectItemHtmlDropdownByValue(parentCategorySelection, parentCategory);
		
//		for(int i = 0; i < listServiceProviderCheckbox.size(); i ++) {
//			waitForElementVisible(listServiceProviderCheckbox.get(1));
//			checkTheCheckbox(listServiceProviderCheckbox.get(1));
//		}
		
		if(button == "Create Category") {
			waitForElementClickalbe(createButton);
			clickToElement(createButton);
		}
		else {
			waitForElementClickalbe(cancelCreateButton);
			clickToElement(cancelCreateButton);
		}
	}
	
	public void updateCategoryLive(String categoryLiveName, String description, String status, String parentCategory, String button) {
		waitForElementVisible(categoryLiveNameTxt);
		clearToElement(categoryLiveNameTxt);
		sendKeyToElement(categoryLiveNameTxt, categoryLiveName);
		
		waitForElementVisible(descriptionTxt);
		clearToElement(descriptionTxt);
		sendKeyToElement(descriptionTxt, description);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(parentCategorySelection);
		selectItemHtmlDropdownByValue(parentCategorySelection, parentCategory);
		
		if(button == "Update") {
			waitForElementClickalbe(updateButton);
			clickToElement(updateButton);
		}
		else {
			waitForElementClickalbe(cancelUpdateCategoryLiveButton);
			clickToElement(cancelUpdateCategoryLiveButton);
		}
	}
	
	public void updateCategoryLiveWithoutServiceProvider(String categoryLiveName, String description, String status, String parentCategory, String button) {
		waitForElementVisible(categoryLiveNameTxt);
		clearToElement(categoryLiveNameTxt);
		sendKeyToElement(categoryLiveNameTxt, categoryLiveName);
		
		waitForElementVisible(descriptionTxt);
		clearToElement(descriptionTxt);
		sendKeyToElement(descriptionTxt, description);
		
		waitForElementVisible(statusSelection);
		selectItemHtmlDropdownByValue(statusSelection, status);
		
		waitForElementVisible(parentCategorySelection);
		selectItemHtmlDropdownByValue(parentCategorySelection, parentCategory);
		
		waitForElementVisible(listServiceProviderCheckbox.get(1));
		checkTheCheckbox(listServiceProviderCheckbox.get(1));
		
		if(button == "Update") {
			waitForElementClickalbe(updateButton);
			clickToElement(updateButton);
		}
		else {
			waitForElementClickalbe(cancelUpdateCategoryLiveButton);
			clickToElement(cancelUpdateCategoryLiveButton);
		}
	}
	
	public boolean verifyCategoryLiveNameBlankMessage() {
		waitForElementVisible(categoryLiveNameBlankMessage);
		return isControlDisplayed(categoryLiveNameBlankMessage);
	}
	
	public boolean verifyServiceProviderBlankMessage() {
		waitForElementVisible(serviceProviderBlankMessage);
		return isControlDisplayed(serviceProviderBlankMessage);
	}
	
	public boolean verifyCreateCategoryLiveSuccessMessage() {
		waitForElementVisible(createCategoryLiveSuccessMessage);
		return isControlDisplayed(createCategoryLiveSuccessMessage);
	}
	
	public boolean verifyUpdateCategoryLiveSuccessMessage() {
		waitForElementVisible(updateCategoryLiveSuccessMessage);
		return isControlDisplayed(updateCategoryLiveSuccessMessage);
	}
	
	public boolean verifyDeleteCategoryLiveSuccessMessage() {
		waitForElementVisible(deleteCategoryLiveSuccessMessage);
		return isControlDisplayed(deleteCategoryLiveSuccessMessage);
	}
	
	
	
}
