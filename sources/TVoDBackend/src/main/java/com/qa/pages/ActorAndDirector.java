package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;

public class ActorAndDirector extends AbstractTest{
	
	@FindBy(xpath = "//a[@class='btn blue']")
	@CacheLookup
	public WebElement addNewButton;
	
	@FindBy(xpath = "//input[@id='actordirector-name']")
	@CacheLookup
	public WebElement displayNameTxt;
	
	@FindBy(xpath = "//input[@placeholder='Select file...']")
	@CacheLookup
	public WebElement avatarInput;
	
	@FindBy(xpath = "//input[@id='actordirector-image']")
	@CacheLookup
	public WebElement browserAvatarButton;
	
	@FindBy(xpath = "//select[@id='actordirector-type']")
	@CacheLookup
	public WebElement actorDirectorDropdown;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	public WebElement addButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	@CacheLookup
	public WebElement cancelButton;
	
	@FindBy(xpath = "//div[contains(text(),'Display name cannot be blank')]")
	public WebElement displayNameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Avatar cannot be blank')]")
	public WebElement avatarBlankMessage;
	
	public ActorAndDirector() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfActorDirectorPage() {
		return getPageTitle();
	}
	
	public void addNewActorDirector(String displayName, String avatar, String button) {
		waitForElementClickalbe(addNewButton);
		clickToElement(addNewButton);
		
	}

}
