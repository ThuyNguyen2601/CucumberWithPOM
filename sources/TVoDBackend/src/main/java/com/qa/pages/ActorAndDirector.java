package com.qa.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;

public class ActorAndDirector extends AbstractTest {

	@FindBy(xpath = "//input[@name='ActorDirectorSearch[name]']")
	@CacheLookup
	public WebElement nameSearchBox;

	@FindBy(xpath = "//div[@id = 'w0-container']//tbody//tr//td[4]//a[3]")
	public List<WebElement> resultSearchList;

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

	@FindBy(xpath = "//tr[1]//td[4]//a[2]//span[1]")
	@CacheLookup
	public WebElement updateIcon;

	@FindBy(xpath = "//button[@class='btn btn-primary' and text() = 'Update']")
	@CacheLookup
	public WebElement updateButton;

	@FindBy(xpath = "//a[@class='btn btn-default' and text() = 'Cancel']")
	@CacheLookup
	public WebElement cancelUpdateButton;

	@FindBy(xpath = "//tr[1]//td[4]//a[3]//span[1]")
	@CacheLookup
	public WebElement deleteIcon;

	@FindBy(xpath = "//button[@class = 'btn btn-default' and text() = ' Cancel']")
	@CacheLookup
	public WebElement cancelDeleteButton;

	@FindBy(xpath = "//button[@class = 'btn btn-warning' and text() = ' Ok']")
	@CacheLookup
	public WebElement okDeleteButton;

	@FindBy(xpath = "//div[contains(text(),'Display name cannot be blank')]")
	@CacheLookup
	public WebElement displayNameBlankMessage;

	@FindBy(xpath = "//div[contains(text(),'Avatar cannot be blank')]")
	@CacheLookup
	public WebElement avatarBlankMessage;

	@FindBy(xpath = "//div[@id='w16-success']")
	@CacheLookup
	public WebElement addNewActorDirectorSuccessMessage;

	@FindBy(xpath = "//div[@id='w16-error']")
	@CacheLookup
	public WebElement deleteErrorMessage;

	@FindBy(xpath = "//div[@id='w16-success']")
	@CacheLookup
	public WebElement deleteSuccessMessage;

	public ActorAndDirector() {
		PageFactory.initElements(driver, this);
	}

	public String getTitleOfActorDirectorPage() {
		return getPageTitle();
	}

	public void addNewActorDirector(String displayName, String type, String button) throws Exception {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);

		// waitForElementVisible(browserAvatarButton);
		uploadFile(browserAvatarButton);

		waitForElementVisible(actorDirectorDropdown);
		selectItemHtmlDropdownByValue(actorDirectorDropdown, type);

		if (button == "Add new") {
			clickToElement(addButton);
		} else {
			clickToElement(cancelButton);
		}
	}

	public void addNewActorDirectorWithoutAvatar(String displayName, String type, String button) {
		waitForElementVisible(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);

		waitForElementVisible(actorDirectorDropdown);
		selectItemHtmlDropdownByValue(actorDirectorDropdown, type);

		if (button == "Add new") {
			clickToElement(addButton);
		} else {
			clickToElement(cancelButton);
		}
	}

	public void updateActorOrDirector(String displayName, String type, String button) {
		waitForElementVisible(displayNameTxt);
		clearToElement(displayNameTxt);
		sendKeyToElement(displayNameTxt, displayName);

		waitForElementVisible(actorDirectorDropdown);
		sendKeyToElement(actorDirectorDropdown, type);

		if (button == "Update") {
			waitForElementClickalbe(updateButton);
			clickToElement(updateButton);
		} else {
			waitForElementClickalbe(cancelUpdateButton);
			clickToElement(cancelUpdateButton);
		}
	}

	public void deleteActorOrDirector(String searchValue, String button) throws Exception {
		waitForElementVisible(nameSearchBox);
		clearToElement(nameSearchBox);
		sendKeyToElement(nameSearchBox, searchValue);
		sendKeyboardToElement(nameSearchBox, Keys.ENTER);
		Thread.sleep(5000);
		waitForElementClickalbe(resultSearchList.get(0));
		clickToElementByAction(resultSearchList.get(0));
		Thread.sleep(5000);
		if (button == " Ok") {
			waitForElementClickalbe(okDeleteButton);
			clickToElement(okDeleteButton);
		} else {
			waitForElementClickalbe(cancelDeleteButton);
			clickToElement(cancelDeleteButton);
		}
	}

	public boolean verifyDisplayNameBlankMessage() {
		waitForElementVisible(displayNameBlankMessage);
		return isControlDisplayed(displayNameBlankMessage);
	}

	public boolean verifyAvatarBlankMessage() {
		waitForElementVisible(avatarBlankMessage);
		return isControlDisplayed(avatarBlankMessage);
	}

	public boolean verifyAddNewActorDirectorSuccessMessage() {
		waitForElementVisible(addNewActorDirectorSuccessMessage);
		return isControlDisplayed(addNewActorDirectorSuccessMessage);
	}

	public boolean verifyDeleteActorDirectorSuccessMessage() {
		waitForElementVisible(deleteSuccessMessage);
		return isControlDisplayed(deleteSuccessMessage);
	}

}
