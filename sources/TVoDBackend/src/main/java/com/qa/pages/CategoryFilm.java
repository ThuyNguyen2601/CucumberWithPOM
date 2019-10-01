package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.qa.util.AbstractTest;

public class CategoryFilm extends AbstractTest{
	
	@FindBy(xpath = "//span[@id='select2-categorysearch-status-container']")
	@CacheLookup
	public WebElement statusCollumn;
	
	@FindBy(xpath = "//a[text() = 'Content ']")
	public WebElement contentMenu;
	
	@FindBy(xpath = "//ul[@id='w8']/li[1]/a[1]")
	public WebElement filmSubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Category Films')]")
	public WebElement categoryFilmSubSubMenu;
	
	@FindBy(xpath = "//a[text() = 'Create Category Film']")
	@CacheLookup
	public WebElement createCategoryFilmButton;
	
	@FindBy(xpath = "//input[@id='category-display_name']")
	public WebElement categoryNameAddTextbox;
	
	@FindBy(xpath = "//textarea[@id='category-description']")
	public WebElement descriptionAddTextbox;
	
	@FindBy(xpath = "//input[@placeholder='Select file...']")
	public WebElement avatarAddTextbox;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	public WebElement cancelUploadAvatarAddButton;
	
	@FindBy(xpath = "//input[@id='category-images']")
	public WebElement browserAddButton;
	
	@FindBy(xpath = "//select[@id='category-status']")
	public WebElement statusCategoryAddDropdown;
	
	@FindBy(xpath = "//input[@id='category-is_series']")
	public WebElement categoryIsSeriesAddCheckbox;
	
	@FindBy(xpath = "//div[@id = 'category-assignment_sites']//div[@class = 'checkbox']//input")
	public List<WebElement> serviceProviderAddCheckboxList;
	
	@FindBy(xpath = "//button[@class = 'btn btn-success' and text() = 'Create Category']")
	public WebElement createCategoryAddButton;
	
	@FindBy(xpath = "//a[text() = 'Cancel']")
	public WebElement cancelAddButton;
	
	

}
