package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginPageSteps extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
		TestBase.initialization();
	}

	@When("^user in the login page$")
	public void user_in_the_login_page() throws Throwable {
		loginPage = new LoginPage();
		Thread.sleep(5000);
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals(title, "Login");
	}

	@Then("^user logs into the page$")
	public void user_logs_into_the_page() throws Throwable {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		Thread.sleep(3000);
		String homePageTitle = homePage.getHomePageTitle();
		Assert.assertEquals("TVOD-Backend", homePageTitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
		boolean flag = homePage.verifyCorrectUserName();
		Assert.assertTrue(flag);
	}
	
	
	@Then("^user logs into the page with username blank$")
	public void user_logs_into_the_page_with_username_blank() throws Throwable {
		homePage = loginPage.login("", prop.getProperty("password"));
	}

	@Then("^validate the username blank message$")
	public void validate_the_username_blank_message() throws Throwable {
		boolean flag = loginPage.verifyUsernameBlankDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Then("^user logs into the page with password blank$")
	public void user_logs_into_the_page_with_password_blank() throws Throwable{
		homePage = loginPage.login(prop.getProperty("username"), " ");
	}
	
	@Then("^validate the password blank message$")
	public void validate_the_password_blank_message() throws Throwable{
		boolean flag = loginPage.verifyPasswordBlankDisplayed();
		Assert.assertTrue(flag);
	}
	

}
