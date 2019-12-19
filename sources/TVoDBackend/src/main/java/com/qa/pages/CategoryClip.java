package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;

public class CategoryClip extends AbstractTest{
	
	@FindBy(xpath = "//a[@class='btn btn-success' and text() = 'Create Category Clip']")
	@CacheLookup
	public WebElement createCategoryClipButton;
	
	@FindBy(xpath = "//input[@id='category-display_name']")
	@CacheLookup
	public WebElement categoryNameTxt;
	
	@FindBy(xpath = "//textarea[@id='category-description']")
	@CacheLookup
	public WebElement categoryDescriptionTxt;
	
	@FindBy(xpath = "//input[@id='category-images']")
	@CacheLookup
	public WebElement categoryAvatarBrowserButton;
	
	@FindBy(xpath = "//select[@id='category-status']")
	@CacheLookup
	public WebElement categoryStatusDropdown;
	
	@FindBy(xpath = "//input[@id='category-is_series']")
	@CacheLookup
	public WebElement categoryIsSeriesCheckbox;
	
	@FindBy(xpath = "//select[@id='category-parent_id']")
	@CacheLookup
	public WebElement categoryParentIdDropdown;
	
	@FindBy(xpath = "//input[@name = 'Category[assignment_sites][]']")
	@CacheLookup
	public List<WebElement> serviceProviderCheckboxList;
	
	@FindBy(xpath = "//a[@class='btn btn-default' and text() = 'Cancel']")
	@CacheLookup
	public WebElement cancelCreateButton;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	public WebElement createButton;
	
	@FindBy(xpath = "//div[contains(text(),'Name of category cannot be blank')]")
	@CacheLookup
	public WebElement nameOfCategoryBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Service Provider cannot be blank')]")
	@CacheLookup
	public WebElement serviceProviderBlankMessage;
	
	@FindBy(xpath = "//div[@class = 'alert-success alert fade in']")
	@CacheLookup
	public WebElement createSuccessMessage;
	
	@FindBy(xpath = "//tr[1]//td[5]//a[1]//span[1]")
	public WebElement updateCategoryClipIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	public WebElement cancelUpdateCategoryClipButton;
	
	
	public CategoryClip() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfPage() {
		return getPageTitle();
	}
	
	public void createCategoryClip(String nameCategory,String description, String status, String parentCategory, int serviceprovider, String button) throws Exception {
		waitForElementVisible(categoryNameTxt);
		sendKeyToElement(categoryNameTxt, nameCategory);
		
		waitForElementVisible(categoryDescriptionTxt);
		sendKeyToElement(categoryDescriptionTxt, description);
		
		//waitForElementVisible(categoryAvatarBrowserButton);
		uploadFile(categoryAvatarBrowserButton);
		
		scrollToElement(categoryStatusDropdown);
		waitForElementVisible(categoryStatusDropdown);
		selectItemHtmlDropdownByValue(categoryStatusDropdown, status);
		
		scrollToElement(categoryIsSeriesCheckbox);
		waitForElementVisible(categoryIsSeriesCheckbox);
		checkTheCheckbox(categoryIsSeriesCheckbox);
		
		scrollToElement(categoryParentIdDropdown);
		waitForElementVisible(categoryParentIdDropdown);
		selectItemHtmlDropdownByValue(categoryParentIdDropdown, parentCategory);
		
		scrollToElement(serviceProviderCheckboxList.get(serviceprovider));
		waitForElementVisible(serviceProviderCheckboxList.get(serviceprovider));
		checkTheCheckbox(serviceProviderCheckboxList.get(serviceprovider));
		if(button == "Create Category") {
			waitForElementClickalbe(createButton);
			clickToElement(createButton);
		} else {
			waitForElementClickalbe(cancelCreateButton);
			clickToElement(cancelCreateButton);
		}
	}
	
	public void createCategoryClipWithoutServiceProvider(String nameCategory,String description, String status, String parentCategory, String button) throws Exception {
		waitForElementVisible(categoryNameTxt);
		sendKeyToElement(categoryNameTxt, nameCategory);
		
		waitForElementVisible(categoryDescriptionTxt);
		sendKeyToElement(categoryDescriptionTxt, description);
		
		//waitForElementVisible(categoryAvatarBrowserButton);
		uploadFile(categoryAvatarBrowserButton);
		
		scrollToElement(categoryStatusDropdown);
		waitForElementVisible(categoryStatusDropdown);
		selectItemHtmlDropdownByValue(categoryStatusDropdown, status);
		
		scrollToElement(categoryIsSeriesCheckbox);
		waitForElementVisible(categoryIsSeriesCheckbox);
		checkTheCheckbox(categoryIsSeriesCheckbox);
		
		scrollToElement(categoryParentIdDropdown);
		waitForElementVisible(categoryParentIdDropdown);
		selectItemHtmlDropdownByValue(categoryParentIdDropdown, parentCategory);
		
		if(button == "Create Category") {
			waitForElementClickalbe(createButton);
			clickToElement(createButton);
		} else {
			waitForElementClickalbe(cancelCreateButton);
			clickToElement(cancelCreateButton);
		}
	}
	
	public boolean verifyNameOfCategoryBlankMessage() {
		waitForElementVisible(nameOfCategoryBlankMessage);
		return isControlDisplayed(nameOfCategoryBlankMessage);
	}
	
	public boolean verifyServiceProviderBlankMessage() {
		waitForElementVisible(serviceProviderBlankMessage);
		return isControlDisplayed(serviceProviderBlankMessage);
	}
	
	public boolean verifyCreateCategoryClipSuccessMessage() {
		waitForElementVisible(createSuccessMessage);
		return isControlDisplayed(createSuccessMessage);
	}
}
