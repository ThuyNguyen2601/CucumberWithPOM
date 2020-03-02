package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.Lives;
import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;

import cucumber.api.java.en.Then;

public class LivesSteps extends AbstractTest{
	HomePage homePage;
	Lives lives;
	
	String displayName = "Lives " + randomData();
	String productYear = "2020";
	String country = "Viet Nam";
	String activationDate = "27-02-2020";
	String experitionDate = "30-0302020";
	String status = "10";
	String honor = "1";
	String featureTitle = "Lives Feature Title " + randomData();
	String tick = "Live Tick" + randomData();
	String originServiceProvider = "7";
	
	@Then("^user goes to the Lives page$")
	public void user_goes_to_the_Lives_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		lives = homePage.gotoLivesPage();
		waitForLoad();
	}

	@Then("^user clicks to the Create Lives button$")
	public void user_clicks_to_the_Create_Lives_button() throws Throwable {
	    waitForElementClickalbe(lives.createLiveButton);
	    clickToElement(lives.createLiveButton);
	}

	@Then("^user creates new category lives without display name$")
	public void user_creates_new_category_lives_without_display_name() throws Throwable {
		lives.createLives(displayName, productYear, country, activationDate, experitionDate, status, honor, featureTitle, tick, originServiceProvider);
	}
	
	@Then("^user checks the blank display name of Lives message$")
	public void user_checks_the_blank_display_name_of_Lives_message() throws Throwable {
	    boolean flag = lives.verifyDisplayNameBlankMessage();
	    verifyTrue(flag);
	    log.info("check create lives without display name is " + flag);
	    waitForLoad();
	}

}
