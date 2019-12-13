package com.qa.stepDefinitions;

import com.qa.pages.ActorAndDirector;
import com.qa.pages.HomePage;
import com.qa.util.PageGeneratorManager;

import cucumber.api.java.en.Then;

public class ActorAndDirectorSteps {
	HomePage homePage;
	ActorAndDirector actorAndDirector;
	
	@Then("^user goes to the Manage Actor Director page$")
	public void user_goes_to_the_Manage_Actor_Director_page() throws Throwable {
		homePage = PageGeneratorManager.getHomePage();
		actorAndDirector = homePage.gotoActorAndDirectorPage();
		
	}

	@Then("^user adds new Actor or Director without display name$")
	public void user_adds_new_Actor_or_Director_without_display_name() throws Throwable {
		
	}

	@Then("^user checks the blank display name message$")
	public void user_checks_the_blank_display_name_message() throws Throwable {

	}


}
