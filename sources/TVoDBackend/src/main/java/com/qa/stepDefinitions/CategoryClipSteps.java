package com.qa.stepDefinitions;

import com.qa.pages.CategoryClip;
import com.qa.pages.HomePage;
import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;

import cucumber.api.java.en.Then;

public class CategoryClipSteps extends AbstractTest{
	
	HomePage homePage;
	CategoryClip categoryClip;
	
	int serviceProvider = 1;
	String nameCategory = "Category " + randomData();
	String description = "Thuy create category " + randomData();
	String status = "10";
	String parentCategory = "3";
	
	
	@Then("^user goes to the Category Clip page$")
	public void user_goes_to_the_Category_Clip_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		categoryClip = homePage.gotoCategoryClipPage();
	}

	@Then("^user clicks to the Create Category Clip button$")
	public void user_clicks_to_the_Create_Category_Clip_button() throws Throwable {
		waitForElementClickalbe(categoryClip.createCategoryClipButton);
		clickToElement(categoryClip.createCategoryClipButton);
	}

	@Then("^user creates new category clip without name of category$")
	public void user_creates_new_category_clip_without_name_of_category() throws Throwable {
		categoryClip.createCategoryClip(" ", description, status, parentCategory, serviceProvider, "Create Category");
	}

	@Then("^user checks the blank name of category clip message$")
	public void user_checks_the_blank_name_of_category_clip_message() throws Throwable {
		boolean flag = categoryClip.verifyNameOfCategoryBlankMessage();
		verifyTrue(flag);
		log.info("Check create category clip without name is: " + flag);
		waitForLoad();
	}
	
	@Then("^user creates new category clip without service provider$")
	public void user_creates_new_category_clip_without_service_provider() throws Throwable {
		categoryClip.createCategoryClipWithoutServiceProvider(nameCategory, description, status, parentCategory, "Create Category");
	}

	@Then("^user checks the blank service provider message$")
	public void user_checks_the_blank_service_provider_message() throws Throwable {
		boolean flag = categoryClip.verifyServiceProviderBlankMessage();
		verifyTrue(flag);
		log.info("Check create category clip without service provider is: " + flag);
		waitForLoad();
	}
	
	@Then("^user creates new category clip but press Cancel button$")
	public void user_creates_new_category_clip_but_press_Cancel_button() throws Throwable {
		categoryClip.createCategoryClip(" ", description, status, parentCategory, serviceProvider, "Cancel");
	}

	@Then("^user checks the page title after canceling create category clip$")
	public void user_checks_the_page_title_after_canceling_create_category_clip() throws Throwable {
		String titleOfPage = categoryClip.getTitleOfPage();
		verifyEquals(titleOfPage, "Manage category Clip");
		log.info("Check create category clip but press Cancel button is: Done!");
		waitForLoad();
	}
	
	@Then("^user creates new category clip$")
	public void user_creates_new_category_clip() throws Throwable {
		categoryClip.createCategoryClip(nameCategory, description, status, parentCategory, serviceProvider, "Create Category");
	}

	@Then("^user checks the create category clip successful message$")
	public void user_checks_the_create_category_clip_successful_message() throws Throwable {
		boolean flag = categoryClip.verifyCreateCategoryClipSuccessMessage();
		verifyTrue(flag);
		log.info("Check create category clip success is: " + flag);
		waitForLoad();
	}
	
	@Then("^user clicks to the update Category Clip icon$")
	public void user_clicks_to_the_update_Category_Clip_icon() throws Throwable {
		waitForElementClickalbe(categoryClip.updateCategoryClipIcon);
		clickToElement(categoryClip.updateCategoryClipIcon);
	}

	@Then("^user updates Category Clip without name$")
	public void user_updates_Category_Clip_without_name() throws Throwable {
		categoryClip.updateCategoryClip("", "Update");
	}

	@Then("^user check the update Category Clip without name message$")
	public void user_check_the_update_Category_Clip_without_name_message() throws Throwable {
	    boolean flag = categoryClip.verifyNameOfCategoryBlankMessage();
	    verifyTrue(flag);
	    log.info("Check update category clip without name Category is: " + flag);
		waitForLoad();
	}
	
	@Then("^user updates Category Clip without service provider$")
	public void user_updates_Category_Clip_without_service_provider() throws Throwable {
	    categoryClip.updateCategoryClipWithoutServiceProvider(nameCategory, serviceProvider, "Update");
	}

	@Then("^user check the update Category Clip without service provider message$")
	public void user_check_the_update_Category_Clip_without_service_provider_message() throws Throwable {
	    boolean flag = categoryClip.verifyServiceProviderBlankMessage();
	    verifyTrue(flag);
	    log.info("Check update category clip without name Service Provider is: " + flag);
	    waitForLoad();
	}
	
	@Then("^user updates Category Clip with valid values$")
	public void user_updates_Category_Clip_with_valid_values() throws Throwable {
	    categoryClip.updateCategoryClip(nameCategory, "Update");
	}

	@Then("^user check the update Category Clip successful message$")
	public void user_check_the_update_Category_Clip_successful_message() throws Throwable {
	    boolean flag = categoryClip.verifyUpdateCategoryClipSuccessMessage();
	    verifyTrue(flag);
	    log.info("Check update Category Clip is: " + flag);
	    waitForLoad();
	}

	@Then("^user clicks to the delete Category Clip icon$")
	public void user_clicks_to_the_delete_Category_Clip_icon() throws Throwable {
		clickToElementByJavaScript(categoryClip.deleteCategoryClipIcon);
		Thread.sleep(2000);
	    //clickToElement(categoryClip.deleteCategoryClipIcon);
	}

	@Then("^user presses cancel button in the confirm alert$")
	public void user_presses_cancel_button_in_the_confirm_alert() throws Throwable {
		//clickToElementByAction(categoryClip.cancelDeleteCategoryClipButton);
		clickToElementByJavaScript(categoryClip.cancelDeleteCategoryClipButton);
	}

	@Then("^user check the delete Category Clip but press cancel button$")
	public void user_check_the_delete_Category_Clip_but_press_cancel_button() throws Throwable {
	    String titlePage = categoryClip.getPageTitle();
	    verifyEquals(titlePage, "Manage category Film");
	    log.info("check delete Category Clip but press Cancel button is done!");
	    waitForLoad();
	}


}
