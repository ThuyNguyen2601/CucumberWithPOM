package com.qa.stepDefinitions;

import com.qa.pages.Clip;
import com.qa.pages.HomePage;
import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;

import cucumber.api.java.en.Then;

public class ClipSteps extends AbstractTest{
	
	HomePage homePage;
	Clip clip;
	
	String displayName = "ThuyNT Clip " + randomData();
	String productYear = "2020";
	String country = "Viet Nam";
	String activationDate = "20/02/2020";
	String expirationDate = "30/03/2020";
	String status = "10";
	String honor = "1";
	String featureTitle = "ThuyNT create title " + randomData();
	String tick = "ThuyNT create tick " + randomData();
	String originServiceProvider = "7";
	
	
	@Then("^user goes to the Clip page$")
	public void user_goes_to_the_Clip_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		clip = homePage.gotoClipPage();
		waitForLoad();
	}

	@Then("^user clicks to the Create Clip button$")
	public void user_clicks_to_the_Create_Clip_button() throws Throwable {
	    waitForElementClickalbe(clip.createClipButton);
	    clickToElement(clip.createClipButton);
	}

	@Then("^user creates new clip without name of category$")
	public void user_creates_new_clip_without_name_of_category() throws Throwable {
	    clip.createClip("", productYear, country, activationDate, expirationDate, status, honor, featureTitle, tick, originServiceProvider);
	}

	@Then("^user checks the blank name of clip message$")
	public void user_checks_the_blank_name_of_clip_message() throws Throwable {
	    boolean flag = clip.verifyDisplayNameBlankMessage();
	    verifyTrue(flag);
	    log.info("Check create Clip without Display Name is: " + flag);
	    waitForLoad();
	}

}
