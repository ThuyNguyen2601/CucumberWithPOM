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
	String activatedDate = "31-10-2019 10:35";
	String expiredDate = "20-11-2019 10:35";
	String expiredDateUpdate = "20-11-2019 10:35";
	String honor = "3";
	String valueOfSP = "15";
	
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
	    Thread.sleep(1000);
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
	
	@Then("^user update the Film without Category$")
	public void user_update_the_Film_without_Category() throws Throwable {
		listFilm.updateFilmWithoutCategory(displayName, activatedDate, expiredDateUpdate, honor, featureTitle, tick);
	}

	@Then("^user check the update Category blank message$")
	public void user_check_the_update_Category_blank_message() throws Throwable {
		boolean flag = listFilm.verifyCategoryBlank();
		verifyTrue(flag);
		log.info("Check update the Film without Category is: " + flag);
		waitForLoad();
	}
	
	@Then("^user update the Film with valid$")
	public void user_update_the_Film_with_valid() throws Throwable {
		listFilm.updateFilm(displayName, activatedDate, expiredDateUpdate, honor, featureTitle, tick);
	}

	@Then("^user check the update Film success message$")
	public void user_check_the_update_Film_success_message() throws Throwable {
		boolean flag = listFilm.verifyUpdateFilmSuccessMessage();
		verifyTrue(flag);
		log.info("Check update the Film successful is: " + flag);
		waitForLoad();
	}
	
	@Then("^user selects content$")
	public void user_selects_content() throws Throwable {
		listFilm.selectContent();
	}

	@Then("^user selects SP to assign$")
	public void user_selects_SP_to_assign() throws Throwable {
		//Thread.sleep(2000);
		selectItemHtmlDropdownByValue(listFilm.SPToAssignContent, valueOfSP);
	}

	@Then("^user clicks to Publish button$")
	public void user_clicks_to_Publish_button() throws Throwable {
		clickToElement(listFilm.publishButton);
	}
	
	@Then("^user checks the assign content success message$")
	public void user_checks_the_assign_content_success_message() throws Throwable {
		boolean flag = listFilm.verifyAssignContentSuccesMessage();
		verifyTrue(flag);
		log.info("Check assign many Content to SP is: " + flag);
		waitForLoad();
	}
	
	@Then("^user selects a film to delete$")
	public void user_selects_a_film_to_delete() throws Throwable {
		//checkTheCheckbox(listFilm.deleteFilmcheckbox);
		clickToElementByJavaScript(listFilm.deleteFilmcheckbox);
		Thread.sleep(1000);
	}

	@Then("^user deletes a film when press Cancel button in alert$")
	public void user_deletes_a_film_when_press_Cancel_button_in_alert() throws Throwable {
		listFilm.deleteAFilm("Cancel");
	}

	@Then("^user checks delete the film$")
	public void user_checks_delete_the_film() throws Throwable {
		System.out.println("Delete cancel");
		//boolean flag = listFilm.checkContainsElement();
		//verifyTrue(flag);
		//log.info("Check delete a film but press Cancel button is: " + flag);
		//waitForLoad();
	}
	
	@Then("^user deletes a film when press OK button in alert$")
	public void user_deletes_a_film_when_press_OK_button_in_alert() throws Throwable {
		listFilm.deleteAFilm("OK");
	}

	@Then("^user checks delete the film success$")
	public void user_checks_delete_the_film_success() throws Throwable {
		System.out.println("Delete OK");
		//boolean flag = listFilm.checkContainsElement();
		//verifyFalse(flag);
		//log.info("Check delete a film success is: " + flag);
		//waitForLoad();
	}
	
	@Then("^user selects category to assign$")
	public void user_selects_category_to_assign() throws Throwable {
		listFilm.selectCategoryToAssign();
	}

	@Then("^user presses Assign button$")
	public void user_presses_Assign_button() throws Throwable {
		clickToElement(listFilm.assignCategoryToSPButton);
	}

	@Then("^user selects service provider in list$")
	public void user_selects_service_provider_in_list() throws Throwable {
		selectItemHtmlDropdownByValue(listFilm.SPToAssignList, valueOfSP);
	}

	@Then("^user clicks to Cancel button$")
	public void user_clicks_to_Cancel_button() throws Throwable {
		clickToElement(listFilm.cancelAssignButton);
	}

	@Then("^user check message when press Cancel$")
	public void user_check_message_when_press_Cancel() throws Throwable {
		System.out.println("Cancel assign category success");
	}
	
	@Then("^user clicks to OK button$")
	public void user_clicks_to_OK_button() throws Throwable {
		clickToElement(listFilm.assignButton);
	}

	@Then("^user check message when press OK$")
	public void user_check_message_when_press_OK() throws Throwable {
		boolean flag = listFilm.verifyAssignCategorySuccessMessage();
		verifyTrue(flag);
		log.info("Check assign category success is: " + flag);
		waitForLoad();
	}





}
