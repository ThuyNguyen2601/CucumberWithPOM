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
		Thread.sleep(1000);
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
		contentProvider.createContentProvider("", taxCode, address, status, accountName, email, phoneNumber, password, confirmPassword, fullName, "CREATE");
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
		contentProvider.createContentProvider(name, taxCode, address, status, "", email, phoneNumber, password, confirmPassword, fullName, "CREATE");
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
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, "", phoneNumber, password, confirmPassword, fullName, "CREATE");
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
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, "123", phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the wrong email format message$")
	public void verify_the_wrong_email_format_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongEmailFormatMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP wrong email format is: " + flag + "\n");
	}
	
	@After("@CP7")
	public void closeBrowser7() {
		tearDown();
	}

	@Then("^user create Content Provider without phone number$")
	public void user_create_Content_Provider_without_phone_number() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, "", password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the phone number blank message$")
	public void verify_the_phone_number_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyPhoneNumberBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without phone number is: " + flag + "\n");
	}
	
	@After("@CP8")
	public void closeBrowser8() {
		tearDown();
	}

	@Then("^user create Content Provider with wrong phone number format$")
	public void user_create_Content_Provider_with_wrong_phone_number_format() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, "aaa", password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the wrong phone number format message$")
	public void verify_the_wrong_phone_number_format_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongPhoneNumberFormatMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP wrong phone number format is: " + flag + "\n");
	}
	
	@After("@CP9")
	public void closeBrowser9() {
		tearDown();
	}

	@Then("^user create Content Provider without password$")
	public void user_create_Content_Provider_without_password() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, "", confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the password blank message$")
	public void verify_the_password_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyPasswordBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without password is: " + flag + "\n");
	}
	
	@After("@CP10")
	public void closeBrowser10() {
		tearDown();
	}
	
	@Then("^user create Content Provider with wrong password format$")
	public void user_create_Content_Provider_with_wrong_password_format() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, "11111", confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the wrong password format message$")
	public void verify_the_wrong_password_format_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongPasswordFormatMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP wrong password format is: " + flag + "\n");
	}
	
	@After("@CP11")
	public void closeBrowser11() {
		tearDown();
	}

	@Then("^user create Content Provider without confirm password$")
	public void user_create_Content_Provider_without_confirm_password() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, "", fullName, "CREATE");
	}

	@Then("^verify the confirm password blank message$")
	public void verify_the_confirm_password_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyConfirmPasswordBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without confirm password is: " + flag + "\n");
	}
	
	@After("@CP12")
	public void closeBrowser12() {
		tearDown();
	}

	@Then("^user create Content Provider with wrong confirm password format$")
	public void user_create_Content_Provider_with_wrong_confirm_password_format() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, "22222", fullName, "CREATE");
	}

	@Then("^verify the wrong confirm password format message$")
	public void verify_the_wrong_confirm_password_format_message() throws Throwable {
		boolean flag = contentProvider.verifyWrongConfirmPasswordFormat();
		Assert.assertTrue(flag);
		System.out.print("Check create CP wrong confirm password format is: " + flag + "\n");
	}
	
	@After("@CP13")
	public void closeBrowser13() {
		tearDown();
	}

	@Then("^user create Content Provider with password and confirm password not matched$")
	public void user_create_Content_Provider_with_password_and_confirm_password_not_matched() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, "111111111", "999999999", fullName, "CREATE");
	}

	@Then("^verify the password and confirm password not matched message$")
	public void verify_the_password_and_confirm_password_not_matched_message() throws Throwable {
		boolean flag = contentProvider.verifyPasswordAndConfirmPasswordNotMatchedMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP password and confirm password not matched is: " + flag + "\n");
	}
	
	@After("@CP14")
	public void closeBrowser14() {
		tearDown();
	}

	@Then("^user create Content Provider without full name$")
	public void user_create_Content_Provider_without_full_name() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, confirmPassword, "", "CREATE");
	}

	@Then("^verify the full name blank message$")
	public void verify_the_full_name_blank_message() throws Throwable {
		boolean flag = contentProvider.verifyFullNameBlankMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create CP without full name is: " + flag + "\n");
	}
	
	@After("@CP15")
	public void closeBrowser15() {
		tearDown();
	}
	
	@Then("^user create Content Provider with valid value$")
	public void user_create_Content_Provider_with_valid_value() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, confirmPassword, fullName, "CREATE");
	}

	@Then("^verify the create content provider success message$")
	public void verify_the_create_content_provider_success_message() throws Throwable {
		boolean flag = contentProvider.verifyCreateContentProviderSuccessMessage();
		Assert.assertTrue(flag);
		System.out.print("Check create Content Provider success is: " + flag + "\n");
	}
	
	@After("@CP16")
	public void closeBrowser16() {
		tearDown();
	}
	
	@Then("^user create Content Provider but press Cancel button$")
	public void user_create_Content_Provider_but_press_Cancel_button() throws Throwable {
		contentProvider.createContentProvider(name, taxCode, address, status, accountName, email, phoneNumber, password, confirmPassword, fullName, "CANCEL");
	}

	@Then("^verify the title of page after Cancel$")
	public void verify_the_title_of_page_after_Cancel() throws Throwable {
		String title = contentProvider.getContentProviderPageTitle();
		Assert.assertEquals(title, "Manage Content Provider");
		System.out.print("Check create CP but press Cancel is OK");
	}
	
	@After("@CP17")
	public void closeBrowser17() {
		tearDown();
	}
	
	@Then("^user presses update Content Provider button$")
	public void user_presses_update_Content_Provider_button() throws Throwable {

	}

	@Then("^user update Content Provider without name$")
	public void user_update_Content_Provider_without_name() throws Throwable {

	}

	@Then("^verify the name update blank message$")
	public void verify_the_name_update_blank_message() throws Throwable {

	}

	@Then("^user update Content Provider without email$")
	public void user_update_Content_Provider_without_email() throws Throwable {

	}

	@Then("^verify the email update blank message$")
	public void verify_the_email_update_blank_message() throws Throwable {

	}

	@Then("^user update Content Provider with wrong email format$")
	public void user_update_Content_Provider_with_wrong_email_format() throws Throwable {

	}

	@Then("^verify the wrong email format update blank message$")
	public void verify_the_wrong_email_format_update_blank_message() throws Throwable {

	}

	@Then("^user update Content Provider without phone number$")
	public void user_update_Content_Provider_without_phone_number() throws Throwable {

	}

	@Then("^verify the phone number update blank message$")
	public void verify_the_phone_number_update_blank_message() throws Throwable {

	}

	@Then("^user update Content Provider with wrong phone number format$")
	public void user_update_Content_Provider_with_wrong_phone_number_format() throws Throwable {

	}

	@Then("^verify the wrong phone number format update blank message$")
	public void verify_the_wrong_phone_number_format_update_blank_message() throws Throwable {

	}

	@Then("^user update Content Provider without password$")
	public void user_update_Content_Provider_without_password() throws Throwable {

	}

	@Then("^verify the password update blank message$")
	public void verify_the_password_update_blank_message() throws Throwable {

	}

	@Then("^user update Content Provider with wrong password format$")
	public void user_update_Content_Provider_with_wrong_password_format() throws Throwable {

	}

	@Then("^verify the wrong password format update blank message$")
	public void verify_the_wrong_password_format_update_blank_message() throws Throwable {

	}

	@Then("^user update Content Provider without confirm password$")
	public void user_update_Content_Provider_without_confirm_password() throws Throwable {

	}

	@Then("^verify the confirm password update blank message$")
	public void verify_the_confirm_password_update_blank_message() throws Throwable {

	}

	@Then("^user update Content Provider with password and confirm password not matched$")
	public void user_update_Content_Provider_with_password_and_confirm_password_not_matched() throws Throwable {

	}

	@Then("^verify the password and confirm password update not matched message$")
	public void verify_the_password_and_confirm_password_update_not_matched_message() throws Throwable {

	}

	@Then("^user update Content Provider without full name$")
	public void user_update_Content_Provider_without_full_name() throws Throwable {

	}

	@Then("^verify the full name update blank message$")
	public void verify_the_full_name_update_blank_message() throws Throwable {

	}

	@Then("^user update Content Provider when press Cancel button$")
	public void user_update_Content_Provider_when_press_Cancel_button() throws Throwable {

	}

	@Then("^verify the page title after press Cancel update$")
	public void verify_the_page_title_after_press_Cancel_update() throws Throwable {

	}

	@Then("^user update Content Provider with valid values$")
	public void user_update_Content_Provider_with_valid_values() throws Throwable {

	}

	@Then("^verify the update Content Provider success message$")
	public void verify_the_update_Content_Provider_success_message() throws Throwable {

	}



	
}
