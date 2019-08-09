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
	
	String name = "Thuy content provider auto " + randomData();
	String email = "abc" + randomData() + "@gmail.com";
	String address = "124 Hoang Quoc Viet";
	String taxCode = "100";
	String status = "Active";
	String accountName = "admin " + randomData();
	String phoneNumber = "0941912591";
	String password = "12345678";
	String confirmPassword = "12345678";
	String fullName = "Nguyen Thi Thuy " + randomData();
	
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
	
	@After("@CP2")
	public void closeBrowser2() {
		tearDown();
	}
	
	@Then("^user presses Create Content Provider button$")
	public void user_presses_Create_Content_Provider_button() throws Throwable {
		clickToElement(contentProvider.createContentProviderButton);
	}

	@Then("^user create Content Provider without name$")
	public void user_create_Content_Provider_without_name() throws Throwable {
		contentProvider.createContentProvider(" ", taxCode, address, status, accountName, email, phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the name blank message$")
	public void verify_the_name_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without name is: " + flag + "\n");
	}
	
	@After("@CP3")
	public void closeBrowser3() {
		tearDown();
	}

	@Then("^user create Content Provider without account name$")
	public void user_create_Content_Provider_without_account_name() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, " ", email, phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the account name blank message$")
	public void verify_the_account_name_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyAccountNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without account name is: " + flag + "\n");
	}
	
	@After("@CP4")
	public void closeBrowser4() {
		tearDown();
	}

	@Then("^user create Content Provider with existed account name$")
	public void user_create_Content_Provider_with_existed_account_name() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, "admin", email, phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the existed account name message$")
	public void verify_the_existed_account_name_message() throws Throwable {
		boolean flag = contentProvider.verifyAccountNameExistedMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP with existed account name is: " + flag + "\n");
	}
	
	@After("@CP5")
	public void closeBrowser5() {
		tearDown();
	}

	@Then("^user create Content Provider without email$")
	public void user_create_Content_Provider_without_email() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, " ", phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the email blank message$")
	public void verify_the_email_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyEmailBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without email is: " + flag + "\n");
	}
	
	@After("@CP6")
	public void closeBrowser6() {
		tearDown();
	}

	@Then("^user create Content Provider with wrong email format$")
	public void user_create_Content_Provider_with_wrong_email_format() throws Throwable {
		
	}

	@Then("^verify the wrong email format message$")
	public void verify_the_wrong_email_format_message() throws Throwable {
		
	}

	@Then("^user create Content Provider without phone number$")
	public void user_create_Content_Provider_without_phone_number() throws Throwable {
		
	}

	@Then("^verify the phone number blank message$")
	public void verify_the_phone_number_blank_message() throws Throwable {
		
	}

	@Then("^user create Content Provider with wrong phone number format$")
	public void user_create_Content_Provider_with_wrong_phone_number_format() throws Throwable {
		
	}

	@Then("^verify the wrong phone number format message$")
	public void verify_the_wrong_phone_number_format_message() throws Throwable {
		
	}

	@Then("^user create Content Provider without password$")
	public void user_create_Content_Provider_without_password() throws Throwable {
		
	}

	@Then("^verify the password blank message$")
	public void verify_the_password_blank_message() throws Throwable {
		
	}

	@Then("^user create Content Provider with wrong password format$")
	public void user_create_Content_Provider_with_wrong_password_format() throws Throwable {
		
	}

	@Then("^verify the wrong password format message$")
	public void verify_the_wrong_password_format_message() throws Throwable {
		
	}

	@Then("^user create Content Provider without confirm password$")
	public void user_create_Content_Provider_without_confirm_password() throws Throwable {
		
	}

	@Then("^verify the confirm password blank message$")
	public void verify_the_confirm_password_blank_message() throws Throwable {
		
	}

	@Then("^user create Content Provider with wrong confirm password format$")
	public void user_create_Content_Provider_with_wrong_confirm_password_format() throws Throwable {
		
	}

	@Then("^verify the wrong confirm password format message$")
	public void verify_the_wrong_confirm_password_format_message() throws Throwable {
		
	}

	@Then("^user create Content Provider with password and confirm password not matched$")
	public void user_create_Content_Provider_with_password_and_confirm_password_not_matched() throws Throwable {
		
	}

	@Then("^verify the password and confirm password not matched message$")
	public void verify_the_password_and_confirm_password_not_matched_message() throws Throwable {
		
	}

	@Then("^user create Content Provider without full name$")
	public void user_create_Content_Provider_without_full_name() throws Throwable {
		
	}

	@Then("^verify the full name blank message$")
	public void verify_the_full_name_blank_message() throws Throwable {
		
	}


	
}
