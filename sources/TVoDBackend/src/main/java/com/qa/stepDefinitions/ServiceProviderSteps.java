package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ServiceProvider;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ServiceProviderSteps extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	ServiceProvider serviceProvider;
	
	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {
		TestBase.initialization();
	}
	
	@And("^user goto the login page$")
	public void user_goto_the_page() throws Throwable {
		loginPage = new LoginPage();
		Thread.sleep(3000);
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals(title, "Login");
	}
	
	@And("^user logins into the page$")
	public void user_logins_into_the_page() throws Throwable {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@When("^user go to Service Provider page$")
	public void user_go_to_Service_Provider_page() throws Throwable {
		serviceProvider = homePage.gotoServiceProviderPage();
	}

	@Then("^user check the title of page$")
	public void user_check_the_title_of_page() throws Throwable {
		String spTitle = serviceProvider.getServiceProviderTitle();
		Assert.assertEquals(spTitle, "Manage Service Provider");
	}

	@Then("^user search service provider by name$")
	public void user_search_service_provider_by_name() throws Throwable {
		serviceProvider.searchServiceProviderByName("chang");
	}
	

}
