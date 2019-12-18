package com.qa.stepDefinitions;

import com.qa.pages.ActorAndDirector;
import com.qa.pages.HomePage;
import com.qa.util.AbstractTest;
import com.qa.util.PageGeneratorManager;

import cucumber.api.java.en.Then;

public class ActorAndDirectorSteps extends AbstractTest{
	HomePage homePage;
	ActorAndDirector actorAndDirector;
	
	String displayName = "Thuy " + randomData();
	String type = "1";
	String searchValue = "thuy";
	
	
	@Then("^user goes to the Manage Actor Director page$")
	public void user_goes_to_the_Manage_Actor_Director_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		actorAndDirector = homePage.gotoActorAndDirectorPage();
		
	}
	
	@Then("^user clicks to Add new button$")
	public void user_clicks_to_Add_new_button() throws Throwable {
		clickToElement(actorAndDirector.addNewButton);
	}

	@Then("^user adds new Actor or Director without display name$")
	public void user_adds_new_Actor_or_Director_without_display_name() throws Throwable {
		actorAndDirector.addNewActorDirector(" ", type, "Add new");
	}

	@Then("^user checks the blank display name message$")
	public void user_checks_the_blank_display_name_message() throws Throwable {
		boolean flag = actorAndDirector.verifyDisplayNameBlankMessage();
		verifyTrue(flag);
		log.info("check add new actor or direcor without display name is: " + flag);
		waitForLoad();
	}
	
	@Then("^user adds new Actor or Director without avatar$")
	public void user_adds_new_Actor_or_Director_without_avatar() throws Throwable {
		actorAndDirector.addNewActorDirectorWithoutAvatar(displayName, type, "Add new");
		//Thread.sleep(1000);
	}

	@Then("^user checks the blank avatar message$")
	public void user_checks_the_blank_avatar_message() throws Throwable {
		boolean flag = actorAndDirector.verifyAvatarBlankMessage();
		verifyTrue(flag);
		log.info("Check add new actor or director without avatar is: " + flag);
		waitForLoad();
	}
	
	@Then("^user adds new Actor or Director but press Cancel button$")
	public void user_adds_new_Actor_or_Director_but_press_Cancel_button() throws Throwable {
		actorAndDirector.addNewActorDirector(displayName, type, "Cancel");
	}

	@Then("^user checks the title of page$")
	public void user_checks_the_title_of_page() throws Throwable {
		String titleOfPage = actorAndDirector.getPageTitle();
		verifyEquals(titleOfPage, "Management Actor / Director");
		log.info("Check add new actor or director but press Cancel button is: Done!");
		waitForLoad();
	}
	
	@Then("^user adds new Actor or Director and press Add new button$")
	public void user_adds_new_Actor_or_Director_and_press_Add_new_button() throws Throwable {
		actorAndDirector.addNewActorDirector(displayName, type, "Add new");
	}

	@Then("^user checks the add new actor or director successful message$")
	public void user_checks_the_add_new_actor_or_director_successful_message() throws Throwable {
		boolean flag = actorAndDirector.verifyAddNewActorDirectorSuccessMessage();
		verifyTrue(flag);
		log.info("Check add new actor or director successful: " + flag);
		waitForLoad();
	}
	
	@Then("^user clicks to update icon$")
	public void user_clicks_to_update_icon() throws Throwable {
		clickToElement(actorAndDirector.updateIcon);
	}

	@Then("^user updates new Actor or Director without display name$")
	public void user_updates_new_Actor_or_Director_without_display_name() throws Throwable {
		actorAndDirector.updateActorOrDirector(" ", type, "Update");
	}

	@Then("^user checks the update blank display name message$")
	public void user_checks_the_update_blank_display_name_message() throws Throwable {
		boolean flag = actorAndDirector.verifyDisplayNameBlankMessage();
		verifyTrue(flag);
		log.info("Check update actor or director with display name is: " + flag);
		waitForLoad();
	}
	
	@Then("^user updates new Actor or Director when press Cancel button$")
	public void user_updates_new_Actor_or_Director_when_press_Cancel_button() throws Throwable {
		actorAndDirector.updateActorOrDirector(displayName, type, "Cancel");
	}

	@Then("^user checks the page title after pressing Cancel button$")
	public void user_checks_the_page_title_after_pressing_Cancel_button() throws Throwable {
		String titleOfPage = actorAndDirector.getPageTitle();
		verifyEquals(titleOfPage, "Management Actor / Director");
		log.info("Check update the actor or director but press Cancel is: Done!");
		waitForLoad();
	}
	
	@Then("^user updates Actor or Director when press Update button$")
	public void user_updates_Actor_or_Director_when_press_Update_button() throws Throwable {
		actorAndDirector.updateActorOrDirector(displayName, type, "Update");
	}

	@Then("^user checks the update actor or director successful message$")
	public void user_checks_the_update_actor_or_director_successful_message() throws Throwable {
	    boolean flag = actorAndDirector.verifyAddNewActorDirectorSuccessMessage();
	    verifyTrue(flag);
	    log.info("Check update actor or director successful is: " + true);
	    waitForLoad();
	}
	
	@Then("^user clicks to delete icon but press Cancel$")
	public void user_clicks_to_delete_icon_but_press_Cancel() throws Throwable {
		actorAndDirector.deleteActorOrDirector(searchValue, " Cancel");
	}

	@Then("^user checks the page title after press Cancel button deleting$")
	public void user_checks_the_page_title_after_press_Cancel_button_deleting() throws Throwable {
	    String titleOfPage = actorAndDirector.getPageTitle();
	    verifyEquals(titleOfPage, "Management Actor / Director");
	    log.info("Check delete actor or director when pressing Cancel is: Done!");
	    waitForLoad();
	}

	@Then("^user clicks to delete icon and press OK button$")
	public void user_clicks_to_delete_icon_and_press_OK_button() throws Throwable {
		actorAndDirector.deleteActorOrDirector(searchValue, " Ok");
	}

	@Then("^user checks the delete actor or director successful message$")
	public void user_checks_the_delete_actor_or_director_successful_message() throws Throwable {
		boolean flag = actorAndDirector.verifyDeleteActorDirectorSuccessMessage();
		verifyTrue(flag);
		log.info("Check delete actor or director success is: "+ flag);
		waitForLoad();
	}



}
