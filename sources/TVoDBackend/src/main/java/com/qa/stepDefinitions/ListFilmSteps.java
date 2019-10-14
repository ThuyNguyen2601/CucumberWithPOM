package com.qa.stepDefinitions;

import com.qa.pages.CategoryFilm;
import com.qa.pages.HomePage;
import com.qa.pages.ListFilm;
import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;

import cucumber.api.java.en.Then;

public class ListFilmSteps extends AbstractTest{
	
	HomePage homePage;
	ListFilm listFilm;
	
	String displayName = "Thuy Film " + randomData();
	String description = "Thuy describe the Film " + randomData();
	String shortDescription = "Thuy short describe the Film " + randomData();
	String featureTitle = "Feature title is: "+ randomData();
	String tick = "Tick is: " + randomData();
	String activatedDate = "10-10-2019 10:35";
	String expiredDate = "20-10-2019 10:35";
	
	@Then("^user goes to the List Film page$")
	public void user_goes_to_the_List_Film_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		Thread.sleep(1000);
		listFilm = homePage.gotoListFilmPage();
		waitForLoad();
	}

	@Then("^user search Film by displayed name$")
	public void user_search_Film_by_displayed_name() throws Throwable {
	    listFilm.searchFilmByName("a");
	}
	
	@Then("^user clicks to Create Film button$")
	public void user_clicks_to_Create_Film_button() throws Throwable {
		clickToElementByJavaScript(listFilm.createFilmButton);
	}
	
	@Then("^user creates film without display name$")
	public void user_creates_film_without_display_name() throws Throwable {
		listFilm.createFilm(" ", activatedDate, expiredDate, featureTitle, tick);
	}

	@Then("^user checks the display name blank message$")
	public void user_checks_the_display_name_blank_message() throws Throwable {
		boolean flag = listFilm.verifyDisplayNameBlank();
		verifyTrue(flag);
		log.info("Check create film without display name is: " + flag);
		waitForLoad();
	}
	


}
