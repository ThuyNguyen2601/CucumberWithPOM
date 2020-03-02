package com.qa.stepDefinitions;

import com.qa.pages.CategoryLive;
import com.qa.pages.HomePage;
import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;

import cucumber.api.java.en.Then;

public class CategoryLiveSteps extends AbstractTest{
	
	HomePage homePage;
	CategoryLive categoryLive;
	
	String categoryLiveName = "ThuyNT Live " + randomData();
	String description = "Live is created by ThuyNT " + randomData();
	String status = "10";
	String parentCategory = "2";
	
	
	@Then("^user goes to the Category Live page$")
	public void user_goes_to_the_Category_Live_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		categoryLive = homePage.gotoCategoryLive();
		waitForLoad();
	}

	@Then("^user clicks to the Create Category Live button$")
	public void user_clicks_to_the_Create_Category_Live_button() throws Throwable {
	    waitForElementClickalbe(categoryLive.createCategoryLiveButton);
	    clickToElement(categoryLive.createCategoryLiveButton);
	}

	@Then("^user creates new category live without name of category$")
	public void user_creates_new_category_live_without_name_of_category() throws Throwable {
	    categoryLive.createCategoryLive(categoryLiveName, description, status, parentCategory, "Create Category");
	}

	@Then("^user checks the blank name of category live message$")
	public void user_checks_the_blank_name_of_category_live_message() throws Throwable {
	    boolean flag = categoryLive.verifyCategoryLiveNameBlankMessage();
	    verifyTrue(flag);
	    log.info("Check create category live without name is " + flag);
	    waitForLoad();
	}
	
	@Then("^user creates new category live without service provider$")
	public void user_creates_new_category_live_without_service_provider() throws Throwable {
	    categoryLive.createCategoryLiveWithoutServiceProvider(categoryLiveName, description, status, parentCategory, "Create Category");
	}

	@Then("^user checks the service provicder blank message$")
	public void user_checks_the_service_provicder_blank_message() throws Throwable {
	    boolean flag = categoryLive.verifyServiceProviderBlankMessage();
	    verifyTrue(flag);
	    log.info("Check create category live without service provider is " + flag);
	    waitForLoad();
	}
	
	@Then("^user creates new category live but press cancel button$")
	public void user_creates_new_category_live_but_press_cancel_button() throws Throwable {
	    categoryLive.createCategoryLive(categoryLiveName, description, status, parentCategory, "Cancel");
	}

	@Then("^user checks the title of page when press cancel create Category Live$")
	public void user_checks_the_title_of_page_when_press_cancel_create_Category_Live() throws Throwable {
	    String pageTitle = categoryLive.getPageTitle();
	    verifyEquals(pageTitle, "Manage category Live");
	    log.info("Check create category live but press cancel button is done!");
	    waitForLoad();
	}
	
	@Then("^user creates new category live with valid values$")
	public void user_creates_new_category_live_with_valid_values() throws Throwable {
	    categoryLive.createCategoryLive(categoryLiveName, description, status, parentCategory, "Create Category");
	}

	@Then("^user checks create category live successful message$")
	public void user_checks_create_category_live_successful_message() throws Throwable {
	    boolean flag = categoryLive.verifyCreateCategoryLiveSuccessMessage();
	    verifyTrue(flag);
	    log.info("Check create category live successful is " + flag);
	    waitForLoad();
	}
	
	@Then("^user clicks to the update Category Live icon$")
	public void user_clicks_to_the_update_Category_Live_icon() throws Throwable {
		waitForElementClickalbe(categoryLive.updateCategoryLiveIcon);
	    clickToElement(categoryLive.updateCategoryLiveIcon);
	}

	@Then("^user updates new category live without name of category$")
	public void user_updates_new_category_live_without_name_of_category() throws Throwable {
	    categoryLive.updateCategoryLive("", description, status, parentCategory, "Update");
	}

	@Then("^user checks the update blank name of category live message$")
	public void user_checks_the_update_blank_name_of_category_live_message() throws Throwable {
	    boolean flag = categoryLive.verifyCategoryLiveNameBlankMessage();
	    verifyTrue(flag);
	    log.info("Check update category live without category of name is " + flag);
	    waitForLoad();
	}
	
	@Then("^user updates new category live without service provider$")
	public void user_updates_new_category_live_without_service_provider() throws Throwable {
	    categoryLive.updateCategoryLiveWithoutServiceProvider(categoryLiveName, description, status, parentCategory, "Update");
	}

	@Then("^user checks the update blank service provider message$")
	public void user_checks_the_update_blank_service_provider_message() throws Throwable {
	    boolean flag = categoryLive.verifyServiceProviderBlankMessage();
	    verifyTrue(flag);
	    log.info("Check update category live without service provider is " + flag);
	    waitForLoad();
	}
	
	@Then("^user updates new category live but press cancel button$")
	public void user_updates_new_category_live_but_press_cancel_button() throws Throwable {
	    categoryLive.updateCategoryLive(categoryLiveName, description, status, parentCategory, "Cancel");
	}

	@Then("^user checks the title of page after pressing calcel button$")
	public void user_checks_the_title_of_page_after_pressing_calcel_button() throws Throwable {
	    String pageTitle = categoryLive.getPageTitle();
	    verifyEquals(pageTitle, "Manage category Live");
	    log.info("Check update category live but press cancel button is done!");
	    waitForLoad();
	}
	
	@Then("^user updates new category live with valid values$")
	public void user_updates_new_category_live_with_valid_values() throws Throwable {
	    categoryLive.updateCategoryLive(categoryLiveName, description, status, parentCategory, "Update");
	}

	@Then("^user checks update category live successful message$")
	public void user_checks_update_category_live_successful_message() throws Throwable {
	    boolean flag = categoryLive.verifyUpdateCategoryLiveSuccessMessage();
	    verifyTrue(flag);
	    log.info("check update category live success is " + flag);
	    waitForLoad();
	}
	
	@Then("^user clicks to the delete category live icon$")
	public void user_clicks_to_the_delete_category_live_icon() throws Throwable {
		waitForElementClickalbe(categoryLive.deleteCategoryLiveIcon);
	    clickToElement(categoryLive.deleteCategoryLiveIcon);
	}

	@Then("^user clicks to the cancel button in confirm alert$")
	public void user_clicks_to_the_cancel_button_in_confirm_alert() throws Throwable {
		waitForElementClickalbe(categoryLive.cancelDeleteCategoryLiveButton);
	    clickToElement(categoryLive.cancelDeleteCategoryLiveButton);
	}

	@Then("^user check delete category live but pressing cancel$")
	public void user_check_delete_category_live_but_pressing_cancel() throws Throwable {
	    String pageTitle = categoryLive.getPageTitle();
	    verifyEquals(pageTitle, "Manage category Live");
	    log.info("Check delete category live but press cancel is done");
	    waitForLoad();
	}
	
	@Then("^user clicks to the OK button in confirm alert$")
	public void user_clicks_to_the_OK_button_in_confirm_alert() throws Throwable {
		waitForElementClickalbe(categoryLive.okDeleteCategoryLiveButton);
	    clickToElement(categoryLive.okDeleteCategoryLiveButton);
	}

	@Then("^user check delete category live successful message$")
	public void user_check_delete_category_live_successful_message() throws Throwable {
	    boolean flag = categoryLive.verifyDeleteCategoryLiveSuccessMessage();
	    verifyTrue(flag);
	    log.info("check delete category live success is " + flag);
	    waitForLoad();
	}


	
}
