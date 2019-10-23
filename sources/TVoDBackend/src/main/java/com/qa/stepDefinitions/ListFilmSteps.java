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
	String expiredDateUpdate = "30-10-2019 10:35";
	String honor = "3";
	
	@Then("^user goes to the List Film page$")
	public void user_goes_to_the_List_Film_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		Thread.sleep(1000);
		listFilm = homePage.gotoListFilmPage();
		Thread.sleep(1000);
		//waitForLoad();
	}

	@Then("^user search Film by displayed name$")
	public void user_search_Film_by_displayed_name() throws Throwable {
	    listFilm.searchFilmByName("Thuy");
	    //Thread.sleep(1000);
	}
	
	@Then("^user clicks to Create Film button$")
	public void user_clicks_to_Create_Film_button() throws Throwable {
		clickToElementByJavaScript(listFilm.createFilmButton);
		Thread.sleep(1000);
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
	
	@Then("^user creates film without poster image$")
	public void user_creates_film_without_poster_image() throws Throwable {
	    listFilm.createFilmWithoutPosterImage(displayName, activatedDate, expiredDate, featureTitle, tick);
	}

	@Then("^user checks the poster image blank message$")
	public void user_checks_the_poster_image_blank_message() throws Throwable {
	    boolean flag = listFilm.verifyPosterImageBlank();
	    verifyTrue(flag);
	    log.info("Check create film without poster image is: " + flag);
	    waitForLoad();
	}
	
	@Then("^user creates film without slideshow image$")
	public void user_creates_film_without_slideshow_image() throws Throwable {
	    listFilm.createFilmWithoutSlideShowImage(displayName, activatedDate, expiredDate, featureTitle, tick);
	}

	@Then("^user checks the slideshow image blank message$")
	public void user_checks_the_slideshow_image_blank_message() throws Throwable {
	    boolean flag = listFilm.verifySlideShowImageBlank();
	    verifyTrue(flag);
	    log.info("Check create film with slideshow image is: " + flag);
	    waitForLoad();
	}

	@Then("^user creates film without service provider$")
	public void user_creates_film_without_service_provider() throws Throwable {
	    listFilm.createFilmWithoutServiceProvider(displayName, activatedDate, expiredDate, featureTitle, tick);
	}

	@Then("^user checks the service provider blank message$")
	public void user_checks_the_service_provider_blank_message() throws Throwable {
	    boolean flag = listFilm.verifyServiceProviderBlank();
	    verifyTrue(flag);
	    log.info("Check create film without Service Provider is: " + flag);
	    waitForLoad();
	}
	
	@Then("^user creates film without Category$")
	public void user_creates_film_without_Category() throws Throwable {
	    listFilm.createFilmWithoutCategory(displayName, activatedDate, expiredDate, featureTitle, tick);
	}

	@Then("^user checks the Category blank message$")
	public void user_checks_the_Category_blank_message() throws Throwable {
	    boolean flag = listFilm.verifyCategoryBlank();
	    verifyTrue(flag);
	    log.info("Check create Film without category is: " + flag);
	    waitForLoad();
	}
	
	@Then("^user creates film with valid values$")
	public void user_creates_film_with_valid_values() throws Throwable {
	    listFilm.createFilm(displayName, activatedDate, expiredDate, featureTitle, tick);
	}

	@Then("^user checks create Film successful message$")
	public void user_checks_create_Film_successful_message() throws Throwable {
	    boolean flag = listFilm.verifyCreateSuccessMessage();
	    verifyTrue(flag);
	    log.info("Check create Film successful is: " + flag);
	    waitForLoad();
	}
	
	@Then("^user clicks to change status button$")
	public void user_clicks_to_change_status_button() throws Throwable {
		clickToElementByAction(listFilm.changeStatusButton);
	    Thread.sleep(1000);
	}

	@Then("^user selects value in dropdown$")
	public void user_selects_value_in_dropdown() throws Throwable {
	    selectItemHtmlDropdownByValue(listFilm.statusDropdown, "4");
	}

	@Then("^user clicks to apply change status button$")
	public void user_clicks_to_apply_change_status_button() throws Throwable {
	    clickToElement(listFilm.applyChangeStatusButton);
	    waitForLoad();
	}
	
	@Then("^user clicks to the view film icon$")
	public void user_clicks_to_the_view_film_icon() throws Throwable {
	    clickToElementByJavaScript(listFilm.viewFilmIcon);
	}

	@Then("^user check the name of viewed film with title page$")
	public void user_check_the_name_of_viewed_film_with_title_page() throws Throwable {
	    String nameOfViewedFilm = listFilm.nameOfViewedFilm.getAttribute("value");
	    String titleOfPage = listFilm.getTitleOfFilmPage();
	    verifyEquals(nameOfViewedFilm, titleOfPage);
	    log.info("Check the view film is done!");
	    waitForLoad();
	}
	
	@Then("^user clicks to the update film icon$")
	public void user_clicks_to_the_update_film_icon() throws Throwable {
		clickToElement(listFilm.updateFilmIcon);
	}

	@Then("^user update the Film without Display name$")
	public void user_update_the_Film_without_Display_name() throws Throwable {
		listFilm.updateFilm(" ", activatedDate, expiredDateUpdate, honor, featureTitle, tick);
	}

	@Then("^user check the update Display name blank message$")
	public void user_check_the_update_Display_name_blank_message() throws Throwable {
		boolean flag = listFilm.verifyDisplayNameBlank();
		verifyTrue(flag);
		log.info("Check update Film without name is: " + flag);
		waitForLoad();
	}
	
	@Then("^user update the Film without Poster image$")
	public void user_update_the_Film_without_Poster_image() throws Throwable {
		listFilm.updateFilmWithoutPosterImage(displayName, activatedDate, expiredDateUpdate, honor, featureTitle, tick);
	}

	@Then("^user check the update Poster image blank message$")
	public void user_check_the_update_Poster_image_blank_message() throws Throwable {
		boolean flag = listFilm.verifyPosterImageBlank();
		verifyTrue(flag);
		log.info("Check update the Film without Poster image is: " + flag);
		waitForLoad();
	}
	
	@Then("^user update the Film without Slideshow image$")
	public void user_update_the_Film_without_Slideshow_image() throws Throwable {
		listFilm.updateFilmWithoutSlideShowImage(displayName, activatedDate, expiredDateUpdate, honor, featureTitle, tick);
	}

	@Then("^user check the update Slideshow image blank message$")
	public void user_check_the_update_Slideshow_image_blank_message() throws Throwable {
		boolean flag = listFilm.verifySlideShowImageBlank();
		verifyTrue(flag);
		log.info("Check update the Film without Slideshow image is: " + flag);
		waitForLoad();
	}

	@Then("^user update the Film without Service Provider$")
	public void user_update_the_Film_without_Service_Provider() throws Throwable {
		listFilm.updateFilmWithoutServiceProvider(displayName, activatedDate, expiredDateUpdate, honor, featureTitle, tick);
	}

	@Then("^user check the update Service Provider blank message$")
	public void user_check_the_update_Service_Provider_blank_message() throws Throwable {
		boolean flag = listFilm.verifySlideShowImageBlank();
		verifyTrue(flag);
		log.info("Check update the Film without Service Provider is: " + flag);
		waitForLoad();
	}


}
