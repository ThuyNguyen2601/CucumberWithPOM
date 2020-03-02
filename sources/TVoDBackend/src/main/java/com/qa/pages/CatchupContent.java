package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.AbstractTest;

public class CatchupContent extends AbstractTest{
	
	@FindBy(xpath = "//a[@class = 'btn btn-success'][contains(text(),'Create Live Contents')]")
	public WebElement createLiveContentsButton;
	
	@FindBy(xpath = "//input[@id='content-display_name']")
	public WebElement displayNameTxt;
	
	@FindBy(xpath = "//input[@id='content-is_push']")
	public WebElement pushNotificationCheckbox;
	
	@FindBy(xpath = "//select[@id='content-live_channel']")
	public WebElement liveChanelSelection;
	
	@FindBy(xpath = "//input[@id='content-started_at-disp']")
	public WebElement startedTimeTxt;
	
	@FindBy(xpath = "//input[@id='content-ended_at-disp']")
	public WebElement endedTimeTxt;
	
	@FindBy(xpath = "//input[@id='thumbnail_epg-preview']")
	public WebElement posterImageBrowserButton;
	
	//get element cua icon upload
	
	@FindBy(xpath = "//input[@id='content-year']")
	public WebElement productYearTxt;
	
	@FindBy(xpath = "//input[@id='content-country']")
	public WebElement countryTxt;
	
	@FindBy(xpath = "//input[@id='content-activated_at-disp']")
	public WebElement activationDateTxt;
	
	@FindBy(xpath = "//input[@id='content-expired_at-disp']")
	public WebElement experitionDateTxt;
	
	@FindBy(xpath = "//select[@id='content-status']")
	public WebElement statusSelection;
	
	@FindBy(xpath = "//select[@id='content-epg_status']")
	public WebElement EPGStatusSelection;
	
	@FindBy(xpath = "//select[@id='content-honor']")
	public WebElement honorSelection;
	
	@FindBy(xpath = "//input[@id='content-feature_title']")
	public WebElement featureTitleTxt;
	
	@FindBy(xpath = "//input[@id='content-tags']")
	public WebElement tickTxt;
	
	@FindBy(xpath = "//button[@class='btn btn-success'][contains(text(),'Create')]")
	public WebElement createButton;
	
	@FindBy(xpath = "//div[contains(text(),'Display name cannot be blank')]")
	public WebElement displayNameBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Start time cannot be blank')]")
	public WebElement startTimeBlankMessage;
	
	@FindBy(xpath = "//div[contains(text(),'End time cannot be blank')]")
	public WebElement endTimeBlankMessage;
	
	@FindBy(xpath = "//div[@id='w12-error']")
	public WebElement createContentFailedMessage;
	
	public CatchupContent() {
		PageFactory.initElements(driver, this);
	}

}
