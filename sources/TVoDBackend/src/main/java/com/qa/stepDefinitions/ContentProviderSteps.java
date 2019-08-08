package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.ContentProvider;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContentProviderSteps extends TestBase{
	HomePage homePage;
	ContentProvider contentProvider;
	LoginPage loginPage;
	
	@Given("^user opens the browser page$")
	public void user_opens_the_browser_page() throws Throwable {
		initialization();
	}

	@Given("^user goes to the TVoD login page$")
	public void user_goes_to_the_TVoD_login_page() throws Throwable {
		loginPage = new LoginPage();
		Thread.sleep(3000);
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals(title, "Login");
	}

	@Given("^user logs into the TVoD page$")
	public void user_logs_into_the_TVoD_page() throws Throwable {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@When("^user goes to the Content Provider page$")
	public void user_goes_to_the_Content_Provider_page() throws Throwable {
		//Thread.sleep(3000);
		contentProvider = homePage.gotoContentProviderPage();
	}

	@Then("^user checks the title of Content Provider page$")
	public void user_checks_the_title_of_Content_Provider_page() throws Throwable {
		String title = contentProvider.getContentProviderPageTitle();
		Assert.assertEquals(title, "Manage Content Provider");
	}

	@Then("^user searches Content Provider by name$")
	public void user_searches_Content_Provider_by_name() throws Throwable {
		searchByName(contentProvider.listRowResult, contentProvider.nameCriteria, "123");
	}
	
	@After("@CP1")
	public void closeBrowser1() {
		tearDown();
	}
	
	@Then("^user searches Content Provider by calendar$")
	public void user_searches_Content_Provider_by_calendar() throws Throwable {
		selectValueInDateTiemPicker("04/07/2019");
		System.out.print("Check searches Content Provider by calendar success!");
	}
	
	//@After("@CP2")
	public void closeBrowser2() {
		tearDown();
	}

	
}
