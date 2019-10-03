package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;

public class CategoryFilm extends AbstractTest{
	
	@FindBy(xpath = "//span[@id='select2-selection__arrow']")
	@CacheLookup
	public WebElement parentDropdown;
	
	@FindBy(xpath = "//span[text()='Active']")
	@CacheLookup
	public WebElement selectedItem;
	
	@FindBy(xpath = "//a[text() = 'Create Category Film']")
	@CacheLookup
	public WebElement createCategoryFilmButton;
	
	@FindBy(xpath = "//input[@id='category-display_name']")
	@CacheLookup
	public WebElement categoryNameTextbox;
	
	@FindBy(xpath = "//textarea[@id='category-description']")
	@CacheLookup
	public WebElement descriptionTextbox;
	
	@FindBy(xpath = "//input[@placeholder='Select file...']")
	@CacheLookup
	public WebElement avatarTextbox;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	@CacheLookup
	public WebElement cancelUploadAvatarButton;
	
	@FindBy(xpath = "//input[@id='category-images']")
	@CacheLookup
	public WebElement browserButton;
	
	@FindBy(xpath = "//select[@id='category-status']")
	@CacheLookup
	public WebElement statusCategoryDropdown;
	
	@FindBy(xpath = "//input[@id='category-is_series']")
	@CacheLookup
	public WebElement categoryIsSeriesCheckbox;
	
	@FindBy(xpath = "//div[@id = 'category-assignment_sites']//div[@class = 'checkbox']//input")
	@CacheLookup
	public List<WebElement> serviceProviderCheckboxList;
	
	@FindBy(xpath = "//button[@class = 'btn btn-success' and text() = 'Create Category']")
	@CacheLookup
	public WebElement createCategoryAddButton;
	
	@FindBy(xpath = "//a[text() = 'Cancel']")
	@CacheLookup
	public WebElement cancelButton;
	
	@FindBy(xpath = "//tr[1]//td[5]//a[1]//span[1]")
	@CacheLookup
	public WebElement viewCategoryFilmIcon;
	
	@FindBy(xpath = "//tr[1]//td[5]//a[2]//span[1]")
	@CacheLookup
	public WebElement updateCategoryFilmIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	@CacheLookup
	public WebElement updateCategoryFilmButton;
	
	@FindBy(xpath = "//tr[1]//td[5]//a[3]//span[1]")
	@CacheLookup
	public WebElement deleteCategoryFilmIcon;
	
	@FindBy(xpath = "//div[@class = 'bootstrap-dialog-footer-buttons']//button[@class = 'btn btn-default']")
	@CacheLookup
	public WebElement cancelInConfirmAlertButton;
	
	public CategoryFilm() {
		PageFactory.initElements(driver, this);
	}
	
	public String getCategoryFilmPageTitle() {
		return getPageTitle();
	}
	
	public void selectItemInStatusDropdownSearch(WebElement statusDropdown, WebElement selectedItemInDropdown) {
		clickToElementByJavaScript(statusDropdown);
		clickToElementByJavaScript(selectedItemInDropdown);
		waitForLoad();
	}

}
