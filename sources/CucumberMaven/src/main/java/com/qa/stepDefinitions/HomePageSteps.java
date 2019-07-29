package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageSteps extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
		TestBase.initialization();
	}

	@When("^user in the login page$")
	public void user_in_the_login_page() throws Throwable {
		loginPage = new LoginPage();
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals("Login", title);
	}

	@When("^user logs into the page$")
	public void user_logs_into_the_page() throws Throwable {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {

	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
	
	}


}
