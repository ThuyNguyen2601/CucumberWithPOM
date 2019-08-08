package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ContentProvider extends TestBase{
	
	@FindBy(xpath = "//input[@name='ContentProviderSearch[cp_name]']")
	public WebElement nameCriteria;
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-calendar']")
	public WebElement calendarIcon;
	
	
	
	@FindBy(xpath = ".//*[@id='w0-container']/table/tbody/tr/td[1]")
	public List<WebElement> listRowResult;
	
	public ContentProvider() {
		PageFactory.initElements(driver, this);
	}
	
	public String getContentProviderPageTitle() {
		return getPageTitle();
	}
	
	
	

}
