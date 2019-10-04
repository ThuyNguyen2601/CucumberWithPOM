package com.qa.stepDefinitions;

import com.qa.pages.CategoryFilm;
import com.qa.pages.HomePage;
import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoryFilmSteps extends AbstractTest{
	
	HomePage homePage;
	CategoryFilm categoryFilm;
	
	String categoryName = "Thuy category " + randomData();
	String description = "Thuy describe the Category Film " + randomData();
	
	@Then("^user goes to the Manage Category Film page$")
	public void user_goes_to_the_Manage_Category_Film_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		categoryFilm = homePage.gotoCategoryFilmPage();
		waitForLoad();
	}

	@Then("^user chooses status in status collumn$")
	public void user_chooses_status_in_status_collumn() throws Throwable {
		categoryFilm.selectItemInStatusDropdownSearch(categoryFilm.parentDropdown, categoryFilm.selectedItem);
	}

	@Then("^user check the status of displayed records$")
	public void user_check_the_status_of_displayed_records() throws Throwable {
	    
	}

	@Then("^user clicks to the Create Category Film button$")
	public void user_clicks_to_the_Create_Category_Film_button() throws Throwable {
		clickToElementByAction(categoryFilm.createCategoryFilmButton);
	}

	@Then("^user creates the category film without Category name$")
	public void user_creates_the_category_film_without_Category_name() throws Throwable {
	    categoryFilm.createCategoryFilm(" ", description, categoryFilm.browserButton, "Active", "43", "Create Category");
	}

	@Then("^user checks the Category name blank message$")
	public void user_checks_the_Category_name_blank_message() throws Throwable {
	    boolean flag = categoryFilm.verifyCategoryNameBlank();
	    verifyTrue(flag);
	    log.info("Check create Catefory Film without name is: " + flag);
	    waitForLoad();
	}

	@Then("^user creates the category film without Service Provider$")
	public void user_creates_the_category_film_without_Service_Provider() throws Throwable {
	    categoryFilm.createCategoryFilmWithoutServiceProvider(categoryName, "Create Category");
	}

	@Then("^user checks the Service Provider blank message$")
	public void user_checks_the_Service_Provider_blank_message() throws Throwable {
	    boolean flag = categoryFilm.verifyServiceProviderBlank();
	    verifyTrue(flag);
	    log.info("Check create Category Film without service provider is: " + flag);
	    waitForLoad();
	}

	@Then("^user creates the category film with valid values but press Cancel button$")
	public void user_creates_the_category_film_with_valid_values_but_press_Cancel_button() throws Throwable {
	    categoryFilm.createCategoryFilm(categoryName, description, categoryFilm.browserButton, "Active", "43", "Cancel");
	}

	@Then("^user checks the title of page after pressing cancel button$")
	public void user_checks_the_title_of_page_after_pressing_cancel_button() throws Throwable {
		waitForLoad();
	    String titlePage = categoryFilm.getCategoryFilmPageTitle();
	    verifyEquals(titlePage, "Manage category Film");
	    log.info("Check create Category Film but press Cancel button done!");
	}

	@Then("^user creates the category film with valid values$")
	public void user_creates_the_category_film_with_valid_values() throws Throwable {
	    categoryFilm.createCategoryFilm(categoryName, description, categoryFilm.browserButton, "Active", "43", "Create Category");
	}

	@Then("^user check the create category film successful message$")
	public void user_check_the_create_category_film_successful_message() throws Throwable {
	    boolean flag = categoryFilm.verifyAddNewSuccessMessage();
	    verifyTrue(flag);
	    log.info("Check create Category Film success is: " + flag);
	    waitForLoad();
	}

	@Then("^user clicks to the view category film icon$")
	public void user_clicks_to_the_view_category_film_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user check the title of page when viewing category film$")
	public void user_check_the_title_of_page_when_viewing_category_film() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user clicks to the edit category icon$")
	public void user_clicks_to_the_edit_category_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user updates the category film without Category name$")
	public void user_updates_the_category_film_without_Category_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user checks the Category name blank message when updating$")
	public void user_checks_the_Category_name_blank_message_when_updating() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user updates the category film without Service Provider$")
	public void user_updates_the_category_film_without_Service_Provider() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user checks the Service Provider blank message when updating$")
	public void user_checks_the_Service_Provider_blank_message_when_updating() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user clicks to the edit category film icon$")
	public void user_clicks_to_the_edit_category_film_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user updates the category film with valid values but pressing Cancel button$")
	public void user_updates_the_category_film_with_valid_values_but_pressing_Cancel_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user checks the status of page after canceling update$")
	public void user_checks_the_status_of_page_after_canceling_update() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user updates the category film with valid values$")
	public void user_updates_the_category_film_with_valid_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user checks the update category film success message$")
	public void user_checks_the_update_category_film_success_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user clicks to the delete category film icon$")
	public void user_clicks_to_the_delete_category_film_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user presses the Cancel button in the confirm alert$")
	public void user_presses_the_Cancel_button_in_the_confirm_alert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user checks the title of page when canceling delete$")
	public void user_checks_the_title_of_page_when_canceling_delete() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user presses the OK button in the confirm alert$")
	public void user_presses_the_OK_button_in_the_confirm_alert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user checks the delete category film success message$")
	public void user_checks_the_delete_category_film_success_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
