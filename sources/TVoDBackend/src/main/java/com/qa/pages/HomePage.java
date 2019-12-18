package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;

public class HomePage extends AbstractTest{
	
	@FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
	@CacheLookup
	public WebElement userNameLabel;
	
	@FindBy(xpath = "//a[contains(text(),'Service Provider')]")
	@CacheLookup
	public WebElement serviceProviderMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Manage service provider')]")
	@CacheLookup
	public WebElement managementServiceProviderLink;
	
	@FindBy(xpath = "//a[contains(text(),'Content Provider')]")
	@CacheLookup
	public WebElement contentProviderMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Manage content provider')]")
	@CacheLookup
	public WebElement manageContentProviderMenu;
	
	@FindBy(xpath = "//a[text() = 'Content ']")
	@CacheLookup
	public WebElement contentMenu;
	
	@FindBy(xpath = "//ul[contains(@id, 'w')]/li[1]/a[text() = 'Film']")
	@CacheLookup
	public WebElement filmSubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Category Films')]")
	@CacheLookup
	public WebElement categoryFilmSubSubMenu;
	
	@FindBy(xpath = "//li[@class='menu-dropdown mega-menu-dropdown open']//li[1]//ul[1]//li[2]//a[1]")
	@CacheLookup
	public WebElement filmSubSubMenu;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-default']//a[contains(text(),'Management Actor / Director')]")
	@CacheLookup
	public WebElement actorAndDirectorSubMenu;
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		waitForElementVisible(userNameLabel);
		return isControlDisplayed(userNameLabel);
	}
	
	public void clickToManagementServiceProvider() {
		Actions action = new Actions(driver);
		action.moveToElement(serviceProviderMenu).build().perform();
		clickToElementByJavaScript(managementServiceProviderLink);
	}
	
	public ServiceProvider gotoServiceProviderPage() throws Throwable {
		moveToElementByJS(serviceProviderMenu);
		clickToElementByJavaScript(managementServiceProviderLink);
		return PageGeneratorManager.getServiceProvider();
	}
	
	public ContentProvider gotoContentProviderPage() throws Throwable {
		moveToElementByJS(contentProviderMenu);
		clickToElementByJavaScript(manageContentProviderMenu);
		return PageGeneratorManager.getContentProvider();
	}
	
	public CategoryFilm gotoCategoryFilmPage() throws Throwable {
		moveToElement(contentMenu);
		moveToElement(filmSubMenu);
		clickToElementByAction(categoryFilmSubSubMenu);
		return PageGeneratorManager.getCategoryFilm();
	}
	
	public ListFilm gotoListFilmPage() throws Throwable {
		moveToElement(contentMenu);
		moveToElement(filmSubMenu);
		clickToElementByAction(filmSubSubMenu);
		return PageGeneratorManager.getListFilm();
	}
	
	public ActorAndDirector gotoActorAndDirectorPage() throws Throwable {
		moveToElement(contentMenu);
		moveToElement(filmSubMenu);
		//Thread.sleep(1000);
		clickToElementByJavaScript(actorAndDirectorSubMenu);
		//clickToElementByAction(actorAndDirectorSubMenu);
		return PageGeneratorManager.getActorAndDirector();
	}

}
